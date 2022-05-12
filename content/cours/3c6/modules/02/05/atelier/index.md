---
title: ""
weight: 1
bookHidden: true
---


# Atelier 2.5: interfaces et classes abstraites

## Préalable

1. J'effectue d'abord le $[link ../tutoriel/](tutoriel 2.5)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `atelier2_5`
        * chemin du projet: `~/3c6_PRENOM_NOM/atelier2_5`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./atelier2_5.jar](atelier2_5.jar)
        * le projet utilise la base de données $[download ./atelier2_5.db](atelier2_5.db)

1. Attention: la librairie `atelier2_5.jar` ne *contient plus* les interfaces:
    * `Dormeur`
    * `Formateur`

1. Je crée la classe `MonAtelier2_5` qui hérite de la classe `Atelier2_5`

1. Je crée moi-même les interfaces `Dormeur` et `Formateur`

1. Je recopie les classes suivantes de l'`atelier2_4`:
    * `Animal`
    * `Chat`
    * `Chien`
    * `ChatPersan`
    * `ChatGouttiere`
    * `Bouledogue`
    * `Shihtzu`

1. J'ajoute les bonnes méthodes dans les interfaces

1. Je transforme les classes `Animal`, `Chat` et `Chien` en classes abstraites

1. Dans `Animal`, je transforme les méthodes "vides" en méthodes abstraites

1. Je corrige les erreurs de compilation

1. J'ajoute une méthode `main` à la classe `MonAtelier2_5`:

    $[java ./MonAtelier2_5 3 6]()

1. J'implante les méthodes pour remplir le contrat du `Atelier2_5`, p.ex:

    $[java ./MonAtelier2_5 8 26]()

1. J'exécute mon projet et je valide mes classes et mes interfaces

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`


## Remise

1. Je pousse un commit avec **exactement** le commentaire `atelier 2.5`, p.ex:

        $ git commit --allow-empty -m"atelier 2.5"
        $ git push


<!--

1. Je peux faire l'entrevue avant la date limite en créant un billet `entrevue 2.5`
    * Le prof va prioriser les questions, je devrai peut-être faire preuve de patience

1. Sinon, le prof va me contacter avec un rendez-vous avant la date limite

-->
