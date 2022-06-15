---
title: ""
weight: 1
bookHidden: true
---


# Atelier 3.2: structure générique (2)

## Préalable

1. J'effectue d'abord le $[link ../tutoriel/](tutoriel 3.2)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `atelier3_2`
        * chemin du projet: `~/3c6_PRENOM_NOM/atelier3_2`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./atelier3_2.jar](atelier3_2.jar)
        * le projet utilise la base de données $[download ./atelier3_2.db](atelier3_2.db)

1. Je crée la classe `MonAtelier3_2` qui hérite de la classe `Atelier3_2`

1. Je recopie l'interface `Paire` à partir de l'`atelier3_1`:

1. Je recopie les classes suivantes de l'`atelier3_1`:
    * `MaPaire`
    * `MonPlanteur`

1. J'ajoute tous les paramètres de type `C` dans:
    * `Paire`
    * `MaPaire`

1. Je modifie `MonPlanteur` pour utiliser la nouvelle `Paire`
    * je vérifie qu'il y a maintenant une erreur de compliation
    * je commente le code générant cette erreur

1. Je corrige les autres erreurs de compilation

1. J'ajoute une méthode `main` à la classe `MonAtelier3_2`:

    $[java ./MonAtelier3_2 3 6]()

1. J'implante les méthodes pour remplir le contrat du `Atelier3_2`, p.ex:

    $[java ./MonAtelier3_2 8 26]()

    * NOTE: il y a des paramètres à passer au constructeur

1. J'exécute mon projet et je valide mes classes et mes méthodes

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`


## Remise

1. Je pousse un commit avec **exactement** le commentaire `atelier 3.2`, p.ex:

        $ git commit --allow-empty -m"atelier 3.2"
        $ git push

<!--

1. Je peux faire l'entrevue avant la date limite en créant un billet `entrevue 3.2`
    * Le prof va prioriser les questions, je devrai peut-être faire preuve de patience

1. Sinon, le prof va me contacter avec un rendez-vous avant la date limite

-->
