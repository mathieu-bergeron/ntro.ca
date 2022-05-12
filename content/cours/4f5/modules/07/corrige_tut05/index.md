---
title: ""
weight: 1
bookHidden: true
---


# Utiliser le corrigé du tutoriel 05

1. En Eclipse, je supprime le projet `pong`

1. Je fais une copie de sauvegarde de mon répertoire `tutoriels`

        $ mv tutoriels _mon_tut05

1. Je télécharge $[download ./corrige_tut05.zip](corrige_tut05.zip)

1. Je place le fichier `corrige_tut05` à la racine de mon dépôt Git

1. Je décompresse l'archive sur place


        $ unzip corrige_tut05.zip

1. Je génére le nouveau projet Eclipse

        $ cd tutoriels
        $ sh graldew build 
        $ sh gradlew eclipse

1. J'importe le nouveau projet dans Eclipse
