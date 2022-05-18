# Copyright (C) (2022) (Mathieu Bergeron) (mathieu.bergeron@cmontmorency.qc.ca)
#
# This file is part of Ntro
#
# Ntro is free software: you can redistribute it and/or modify
# it under the terms of the GNU Affero General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# Ntro is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU Affero General Public License for more details.
#
# You should have received a copy of the GNU Affero General Public License
# along with aquiletour.  If not, see <https://www.gnu.org/licenses/>

##### INCLUDE #####
this_dir=$(readlink -f $0)
scripts_dir=$(dirname "$this_dir")
. "$scripts_dir/include.sh"
###################

run_commands(){

    for command in "$@";
    do
        echo -n "[$run_commands_dir]$ "
        echo $command
        eval "${command}"
        echo ""
    done

}

save_dir

cd "$root_dir"

branches=$(git branch | tr -d '*' | tr -d ' ')

for branch in $branches; 
do
    echo ""
    echo ""

    git checkout $branch

    export run_commands_dir=$branch
    run_commands "$@"
done

git checkout main

restore_dir

