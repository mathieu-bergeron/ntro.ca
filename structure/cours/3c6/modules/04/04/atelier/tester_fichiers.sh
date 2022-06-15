fichiers_naif=$(ls tutoriel4_4_*_naif.txt)

lignes_differentes=0
script_diff="commandes_diff.sh"

rm -f $script_diff > /dev/null 2>/dev/null

for fichier_naif in $fichiers_naif; 
do
    fichier_efficace=$(echo $fichier_naif | sed "s/naif/efficace/")

    lignes_differentes_ce_fichier=$(diff $fichier_efficace $fichier_naif | grep ">" | wc -l)

    lignes_differentes=$(($lignes_differentes + $lignes_differentes_ce_fichier))

    if [ $lignes_differentes_ce_fichier != 0 ];then
        echo "echo diff $fichier_naif $fichier_efficace" >> $script_diff
        echo "echo =============================================================" >> $script_diff
        echo "diff $fichier_naif $fichier_efficace" >> $script_diff
        echo "echo ''" >> $script_diff
    fi

done


if [ $lignes_differentes = 0 ]; then

    echo -e "\e[32m[Validation réussie!]"

else

    echo -e "\e[31m[Validation échouée]"
    echo "Il y a $lignes_differentes lignes différentes"
    echo "Voir ou exécuter $script_diff pour les détails"
fi

