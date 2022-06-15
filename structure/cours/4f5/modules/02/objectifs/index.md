---
title: ""
weight: 1
bookHidden: true
---


# Objectifs 2: créer mon projet

<center>
<div style="background-color:orange;width:80%;border:2px dashed black;padding:10px">
<strong>IMPORTANT</strong>
<div style="text-align:left">
<ul>
<li>J'utilise le même dépôt Git que pour les tutoriels
<ul>
<li>(ne <strong>pas refaire</strong> les étapes 2.1 à 2.4 du tutoriel)
</ul>
<br>
<li>Je renomme <strong>tous</strong> les noms bidons 
<ul>
<li>(p.ex. <code>MON_JEU</code>, <code>4F5_DEMARRAGE</code> et <code>ClientMonJeu</code>)
</ul>
</ul>
<div>
</div>
</center>


1. Dans mon dépôt Git, je crée un répertoire de démarrage nommé `mon_projet`
    * (à partir d'un `4F5_DEMARRAGE` neuf)

1. Dans le répertoire `mon_projet`, je crée un projet Gradle nommé `MON_JEU`

1. J'importe le projet `MON_JEU` en Eclipse

1. Je code mes classes `ClientMonJeu` et `FrontalMonJeu`
    * (y compris la tâche qui affiche la fenêtre)

1. J'exécute `MON_JEU` en français et en anglais
    * (doit afficher une fenêtre)

1. J'expérimente avec les options de la fenêtre (classe `Window`)

    * <span style="background-color:orange; padding:10px;border:2px dashed black;">je choisis des options de `Window` pour mon projet</span>

1. Je pousse mon projet sur GitHub, p.ex:

        $ git add .
        $ git commit -a -m"premier commit pour MON_JEU"
        $ git push 

1. Je vérifie que mes fichiers sont sur GitHub

1. Je vérifie que projet est fonctionnel avec un `$ git clone` neuf, p.ex:

        $ mkdir ~/tmp

        $ cd ~/tmp

        $ git clone git@github.com:USAGER/DEPOT

        $ cd DEPOT

        $ cd mon_projet

        $ sh gradlew clientFr

            # Doit afficher la fenêtre par défaut de Ntro

            # Doit afficher à la console
            
                Locale: 'fr_CA'


        $ sh gradlew clientEn

            # Doit afficher la fenêtre par défaut de Ntro

            # Doit afficher à la console

                Locale: 'en_CA'
