#! /usr/bin/python
# vim: set fileencoding=utf-8 :
#
# --
# Copyright (C) (2020) (Mathieu Bergeron) (mathieu.bergeron@cmontmorency.qc.ca)
# --
#
# This program is free software; you can redistribute it and/or modify
# it under the terms of the GNU AFFERO General Public License as published by
# the Free Software Foundation; either version 3 of the License, or
# any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU Affero General Public License
# along with this program; if not, write to the Free Software
# Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
# or see http://www.gnu.org/licenses/agpl.txt.
# --

from __future__ import print_function
import argparse
import codecs

import re

parser = argparse.ArgumentParser(description='Replace ciboulot-style Markdown extensions with Hugo shortcodes')
parser.add_argument('-i', metavar='MD_FILE', type=str, help='The input .md file')

args = parser.parse_args()

if args.i is None:
    parser.print_usage()
    exit(0)

INPUT_PATH = args.i

MARKDOWN_TITLE_PATTERN = '^#+\s+(\w.*\w)\s*$'
MARKDOWN_TITLE_MATCHER = re.compile(MARKDOWN_TITLE_PATTERN)

HUGO_HEADER_PATTERN= '^---\s*$'
HUGO_HEADER_MATCHER= re.compile(HUGO_HEADER_PATTERN)

HUGO_TITLE_PATTERN = '^\s*title\s*:.*$'
HUGO_TITLE_MATCHER = re.compile(HUGO_TITLE_PATTERN)

CIBOULOT_EXTENSION_SPLITS = '\$\[[^\]]+\]\(?[^\)]*\)?'
CIBOULOT_EXTENSION_SPLITTER = re.compile(CIBOULOT_EXTENSION_SPLITS)

CIBOULOT_EXTENSION_GROUPS = '\$\[([^\]]+)\]\(?([^\)]*)\)?'
CIBOULOT_EXTENSION_GROUPER = re.compile(CIBOULOT_EXTENSION_GROUPS)

CIBOULOT_INDENT_PATTERN = '^[ ]+'
CIBOULOT_INDENT_MATCHER = re.compile(CIBOULOT_INDENT_PATTERN)


def ciboulot_extension_to_hugo_shortcode(indent, name, attributes, text):
    shortcode = '{{%% ciboulot name="%s" attributes="%s" text="%s" %%}}' % (name, ",".join(attributes), text)

    if name == "link":
        shortcode = '{{%% link href="%s" text="%s" %%}}' % (attributes[0], text)

    elif name == "download":
        shortcode = '{{%% download href="%s" text="%s" %%}}' % (attributes[0], text)

    elif name == "embed":
        if indent > 0:
            shortcode = '{{%% embed src="%s" indent="%s" %%}}' % (attributes[0], indent)
        else:
            shortcode = '{{%% embed src="%s" %%}}' % (attributes[0])


    return shortcode




def transform_markdown_line(markdown_line):
    text_nodes = CIBOULOT_EXTENSION_SPLITTER.split(markdown_line)

    matches = CIBOULOT_EXTENSION_GROUPER.findall(markdown_line)
    shortcodes = []
    for i, match in enumerate(matches):
        indent = 0
        if i == 0 and len(text_nodes) > 0:
            indent_match = CIBOULOT_INDENT_MATCHER.match(text_nodes[0])
            if indent_match is not None:
                indent = len(indent_match.group(0)) / 4

        name_and_attributes = match[0]
        segments = name_and_attributes.split(' ')
        name = segments[0]
        attributes = segments[1:]
        text = match[1]
        shortcodes.append(ciboulot_extension_to_hugo_shortcode(indent, name, attributes, text))

    markdown_line = ""

    for i,text_node in enumerate(text_nodes):
        markdown_line += text_node
        if i < len(shortcodes):
            markdown_line += unicode(shortcodes[i])

    return markdown_line

def transform_lines(title, header_lines, markdown_lines):

    output_lines = []

    for header_line in header_lines:
        if header_line.startswith('title:') and title is not None:
            output_lines.append("title: \"%s\"\n"  % title)
        else:
            output_lines.append(header_line)

    for markdown_line in markdown_lines:
        output_lines.append(transform_markdown_line(markdown_line))

    return output_lines


def extract_title(input_line):
    title = None
    groups = MARKDOWN_TITLE_MATCHER.match(input_line)
    if groups is not None:
        title = groups.group(1)

    return title


def read_lines(input_lines):
    title = None

    in_header = False
    header_lines = []
    markdown_lines = []

    for input_line in input_lines:
        if HUGO_HEADER_MATCHER.match(input_line):

            header_lines.append(input_line)
            in_header = not in_header

        elif in_header:

            header_lines.append(input_line)

        else:

            if MARKDOWN_TITLE_MATCHER.match(input_line) and title is None:
                title = extract_title(input_line)

            markdown_lines.append(input_line)

    return (title, header_lines, markdown_lines)


def read_file(input_file):
    lines = []
    for line in input_file:
        lines.append(line)

    return read_lines(lines)


if __name__ == '__main__':
    with codecs.open(INPUT_PATH, encoding='utf-8') as input_file:
        (title, header_lines, markdown_lines) = read_file(input_file)

    output_lines = transform_lines(title, header_lines, markdown_lines)

    with codecs.open(INPUT_PATH, 'w', encoding='utf-8') as output_file:
        for line in output_lines:
            output_file.write(line)
