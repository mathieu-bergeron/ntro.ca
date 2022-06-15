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

save_dir

cd "$root_dir"

mkdir themes
git clone git@github.com:mathieu-bergeron/hugo-book              themes/hugo-book

mkdir contenu

## public content
git clone git@github.com:mathieu-bergeron/theorie.ntro.ca        donnees/theorie
git clone git@github.com:mathieu-bergeron/tutoriels.ntro.ca      donnees/tutoriels
git clone git@github.com:mathieu-bergeron/ateliers.ntro.ca       donnees/ateliers
git clone git@github.com:mathieu-bergeron/misc.ntro.ca           donnees/misc
git clone git@github.com:mathieu-bergeron/3c6.ntro.ca            donnees/3c6

# public static files
git clone git@github.com:mathieu-bergeron/static.ntro.ca         static_ntro.ca

restore_dir
