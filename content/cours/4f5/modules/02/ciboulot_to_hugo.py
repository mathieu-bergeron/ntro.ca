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


#TODO) en français lorsque LANG ou LC_ALL est fr
#import locale
#loc = locale.getlocale()
#print(loc)

parser = argparse.ArgumentParser(description='Replace ciboulot-style Markdown extensions with Hugo shortcodes')
parser.add_argument('-i', metavar='MD_FILE', type=str, help='The input .md file')

args = parser.parse_args()

if args.i is None:
    parser.print_usage()
    exit(0)

INPUT_PATH = args.i


if __name__ == '__main__':
    pass
        
