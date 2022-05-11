# Utiliser le corrigé du TP1

1. En Eclipse, je supprime le projet `MON_JEU`

1. Je fais une copie de sauvegarde de mon répertoire `mon_projet`

        $ mv mon_projet _mon_tp1

1. Je télécharge $[download ./corrige_tp1.zip](corrige_tp1.zip)

1. Je place le fichier `corrige_tp1` à la racine de mon dépôt Git

1. Je décompresse l'archive sur place


        $ unzip corrige_tp1.zip

1. Dans le nouveau `mon_projet` j'exécute le script `nommer_projet`


        $ cd mon_projet
        $ sh scripts/nommer_projet.sh

            # je dois donner le nom de paquet désiré, p.ex. echecs

1. Je génére le nouveau projet Eclipse

        $ sh graldew build 
        $ sh gradlew eclipse

1. J'importe le nouveau projet dans Eclipse


1. <span style="padding:10px;background-color:orange;border-width:2px;border-color:black;border-style:dotted">ATTENTION, je dois ensuite renommer plusieurs fichiers et classes</span>
    * la classe `ClientMonJeu` et son utilisation dans `gradle.properties`
    * le fichier `ma_vue.xml`
    * la vue `MaVue`
    * le modèle `MonModele` et la valeur `MaValeur`
    * les attributs du modèles
    * l'événement `EvtAfficherVueMaVue`
    * plusieurs tâches, p.ex. `afficherVueMaVue`
    


