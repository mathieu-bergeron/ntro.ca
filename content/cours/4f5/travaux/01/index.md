# Instruction de remise TP#1

1. J'ouvre un GitBash à la racine de mon dépôt Git 

1. Je fais un commit avec le commentaire `TP1`

        $ git add .
        $ git commit -a --allow-empty -mTP1
        $ git push

1. Je m'assure que mon commit est bien sur GitHub


1. <a href="https://cmontmorency.moodle.decclic.qc.ca/mod/assign/view.php?id=302518">Sur Moodle, je m'assure de remettre</a>:
    * Mes graphes de tâches (`frontal.png` et `dorsal.png`)

    * Un modèle contenant une valeur personalisée (fichier `.json` et `.png`)

    * Le projet Eclipse au format `.zip` (en cas d'erreur avec Git)

    * La version finale de ma maquette pour le TP#1
        * NOTE: pas besoin de la modifier si elle correspond déjà aux critères



# Grille de correction TP#1

## 10pts) Maquette (document de conception)

* 5pts) La Vue contient une façon d'ajouter des éléments

* 5pts) Le Modèle contient une Liste ou un Map

## 90pts) Implantation partielle de la maquette

### 20pts) Compilation et exécution à partir d'un `$ git clone neuf`

* Le projet doit être fonctionnel à partir d'un `$ git clone neuf`

        $ mkdir ~/tmp

        $ cd ~/tmp

        $ git clone git@github.com:USAGER/DEPOT

        $ cd DEPOT

        $ cd mon_projet

        # si nécessaire
        $ git checkout <le commit le plus récent avec commentaire TP1>    

        $ sh gradlew clientFr

            [INFO] Ntro version 0.5

            # Doit afficher une page personalisée, en français
            # Doit supporter la navigation aller-retour vers la file d'attente
            # Doit générer
            #      _storage/models/MODELE_PERSONALISE.json
            #      _storage/graphs/MODELE_PERSONALISE.png


        $ sh gradlew clientEn

            [INFO] Ntro version 0.5

            # Doit afficher une page personalisée, en anglais
            # Doit supporter la navigation aller-retour vers la file d'attente
            # Doit générer
            #      _storage/models/MODELE_PERSONALISE.json
            #      _storage/graphs/MODELE_PERSONALISE.png



### 40pts) Fonctionnalités

* 10pts) L'application démarre sur une Vue personalisée 

* 10pts) On peut naviguer vers `VueFileAttente` et revenir

* 10pts) Sur la Vue personalisée, il y au moins
    * 2 éléments graphiques distincts
    * 2 règles de CSS apparentes
    * un texte traduit en anglais

* 10pts) Génération d'un modèle personalisé
    * tâche pour initialiser le modèle dans le dorsal
    * remise d'un fichier de test `.json` contenant une valeur personalisée
    * génération du fichier `.png` à partir du fichier `.json` remis

### 30pts) Code (respect de la méthodologie Ntro)

* 10pts) Respect de l'arborescence demandée

* 10pts) Noms pertinents pour les classes, méthodes et attributs

* 10pts) Qualité du code (respect des $[download /cegep/420-4F5-MO/presentation/NormesProgrammationJava.pdf](normes de programmation))


# Ré-évaluation des auto-évalutions

* Le prof va compiler les notes des auto-évaluations et ajuster au besoin

* Ces notes seront disponibles en même temps que celle du TP#1


<div style="background-color:white;margin-bottom:400px;">
</div>

