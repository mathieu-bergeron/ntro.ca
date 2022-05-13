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

def extract_title(input_line):
    title = None
    groups = MARKDOWN_TITLE_MATCHER.match(input_line)
    if groups is not None:
        title = groups.group(1)

    return title

def process_lines(input_lines):
    title = None
    for input_line in input_lines:
        if MARKDOWN_TITLE_MATCHER.match(input_line) and title is None:
            title = extract_title(input_line)

    output_lines = []
    for input_line in input_lines:
        if input_line.startswith('title:') and title is not None:
            output_lines.append("title: \"%s\"\n"  % title)
        else:
            output_lines.append(input_line)

    return output_lines

def process_file(input_file):
    lines = []
    for line in input_file:
        lines.append(line)

    return process_lines(lines)


if __name__ == '__main__':
    output_lines = []
    with codecs.open(INPUT_PATH, encoding='utf-8') as input_file:
        output_lines = process_file(input_file)

    with codecs.open(INPUT_PATH, 'w', encoding='utf-8') as output_file:
        for line in output_lines:
            output_file.write(line)
