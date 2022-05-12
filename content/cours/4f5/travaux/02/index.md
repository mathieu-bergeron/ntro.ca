---
title: ""
weight: 1
bookHidden: true
---


# Instruction de remise TP#2

1. J'ouvre un GitBash à la racine de mon dépôt Git 

1. Je fais un commit avec le commentaire `TP1`

        $ git add .
        $ git commit -a --allow-empty -mTP2
        $ git push

1. Je m'assure que mon commit est bien sur GitHub

1. <a href="https://cmontmorency.moodle.decclic.qc.ca/mod/assign/view.php?id=306811">Sur Moodle, je m'assure de remettre</a>

    * Un fichier `README.md` avec les commandes à faire pour lancer le jeu en mode client/serveur, p.ex:

            $ sh gradlew serveur
            $ sh gradlew alice
            $ sh gradlew bob
    
    * Mes graphes de tâches (`frontal.png` et `dorsal.png`)

    * Un modèle contenant une valeur personalisée (fichier `.json` et `.png`)

    * Le projet Eclipse au format `.zip` (en cas d'erreur avec Git)

# Grille de correction TP#2

## 20pts) Exécution à partir d'un `$ git clone neuf`

* Le projet doit être fonctionnel à partir d'un `$ git clone neuf`

        $ mkdir ~/tmp

        $ cd ~/tmp

        $ git clone git@github.com:USAGER/DEPOT

        $ cd DEPOT

        $ cd mon_projet

        # si nécessaire
        $ git checkout <le commit le plus récent avec commentaire TP1>    

        # dans un 1er GitBash
        $ sh gradlew serveur

        # dans un 2ième GitBash
        $ sh gradlew client  


        # dans un 3ième GitBash
        $ sh gradlew client


            # Doit afficher 2 clients synchronisés via le serveur
            # Doif afficher d'abord votre page personnalisée
            # En un clic, on peut ajouter une valeur sur les deux clients
            # Au moins une valeur est affichée dans un fragment
            # L'affichage s'adapte à la taille de la fenêtre (tailles élastiques)
            # On peut naviguer vers une vue contenant un objet2d en mouvement



## 40pts) Fonctionnalités

* 10pts) On peut ajouter des données p.ex. avec un bouton

* 10pts) Les données ajoutées s'affichent dans un fragment avec des tailles élastiques

* 10pts) On peut naviguer vers une Vue contenent un objet2d en mouvement, puis revenir

* 10pts) Les données s'affichent dans les deux clients

## 40pts) Respect de la méthodologie Ntro et qualité du code

* 20pts) Respect de la méthodologie Ntro, p.ex.
    * graphes de tâches adéquat
    * utilisation de messages
    * modification du modèle **uniquement dans le dorsal**
    * observation d'un modèle **dans le frontal**
    * etc.

* 10pts) Noms pertinents pour les classes, méthodes et attributs

* 10pts) Qualité du code (respect des $[download /cegep/420-4F5-MO/presentation/NormesProgrammationJava.pdf](normes de programmation))


# Ré-évaluation des auto-évalutions

* Le prof va compiler les notes des auto-évaluations et ajuster au besoin

* Ces notes seront disponibles en même temps que celle du TP#2


<div style="background-color:white;margin-bottom:400px;">
</div>

