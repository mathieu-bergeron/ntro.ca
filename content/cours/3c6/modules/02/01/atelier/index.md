---
title: ""
weight: 1
bookHidden: true
---


# Atelier 2.1: utiliser la librairie `atelier2_1.jar`

## Préalable

1. J'effectue d'abord le $[link ../tutoriel/](tutoriel 2.1)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `atelier2_1`
        * chemin du projet: `~/3c6_PRENOM_NOM/atelier2_1`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./atelier2_1.jar](atelier2_1.jar)
        * le projet utilise la base de données $[download ./atelier2_1.db](atelier2_1.db)

1. La librairie `atelier2_1.jar` contient:
    * la classe `Atelier2_1`
    * l'interface `Accepteur`
    * l'interface `Formateur`

1. Je crée la classe `MonAtelier2_1` qui hérite de `Atelier2_1`

1. Je crée la classe `MonAccepteur` qui implante `Accepteur`
    * la méthode `accepter(String valeur)` doit:
        * retourner vrai pour les chaînes formées du même caractère: 
            * `aaaaa`
            * `bb`
            * `ttttttt`
            * etc.
        * retourner faux sinon

1. Je crée la classe `MonFormateur` qui implante `Formateur`
    * la méthode `formater(String valeur)` doit:
        * retourner une chaîne avec le caratère et la taille:
            * `aaaaa` devient `a5`
            * `bb` devient `b2`
            * `ttttttt` devient `t7`
            * etc.

1. J'implante les méthodes `fournirAccepteur` et `fournirFormateur`

1. J'ajoute une méthode `main` à la classe `MonAtelier2_1`:

    $[java ./MonAtelier2_1 9 12]()

1. J'exécute mon projet et je valide mes méthodes

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`

## Remise

1. Je pousse un commit avec **exactement** le commentaire `atelier 2.1`, p.ex:

        $ git commit --allow-empty -m"atelier 2.1"
        $ git push

<!--

1. Je peux faire l'entrevue avant la date limite en créant un billet `entrevue 2.1`
    * Le prof va prioriser les questions, je devrai peut-être faire preuve de patience

1. Sinon, le prof va me contacter avec un rendez-vous avant la date limite


-->
