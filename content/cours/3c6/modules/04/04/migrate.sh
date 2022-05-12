# Copyright (C) (2020) (Mathieu Bergeron) (mathieu.bergeron@cmontmorency.qc.ca)
#
# This file is part of aquiletour
#
# aquiletour is free software: you can redistribute it and/or modify
# it under the terms of the GNU Affero General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# aquiletour is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU Affero General Public License for more details.
#
# You should have received a copy of the GNU Affero General Public License
# along with aquiletour.  If not, see <https://www.gnu.org/licenses/>


echo -n "old module tag: "
read old_tag

echo -n "new module tag: "
read new_tag

echo "renaming $old_tag to $new_tag everywhere"

git commit --allow-empty -a -m"before migrating $old_tag to $new_tag"

# Remove every link
find . -type l  | while read i; 
do
    rm -v "$i"
done

# Remove every file except this script and .md files
find . -type f -not -name "*.md" | while read i; 
do
    test "$(basename $i)" != "$(basename $0)" && rm -v "$i"
done

# Replacing within files
find . -type f -name "*.md" | while read md_file
do
    sed s/$old_tag/$new_tag/g -i "$md_file"
done

# Tags of the form 2.1 instead of 2_1
old_dot_tag=$(echo $old_tag | sed s/_/./)
new_dot_tag=$(echo $new_tag | sed s/_/./)

find . -type f -name "*.md" | while read md_file
do
    sed s/$old_dot_tag/$new_dot_tag/g -i "$md_file"
done



git add .
git commit -m"after migrating $old_tag to $new_tag"



