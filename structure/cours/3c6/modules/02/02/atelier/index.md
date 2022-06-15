---
title: ""
weight: 1
bookHidden: true
---


# Atelier 2.2: héritage

## Préalable

1. J'effectue d'abord le $[link ../tutoriel/](tutoriel 2.2)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `atelier2_2`
        * chemin du projet: `~/3c6_PRENOM_NOM/atelier2_2`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./atelier2_2.jar](atelier2_2.jar)
        * le projet utilise la base de données $[download ./atelier2_2.db](atelier2_2.db)

1. Je crée la classe `MonAtelier2_2` qui hérite de la classe `Atelier2_2`

1. J'implante les méthodes pour remplir le contrat du `Atelier2_2`

1. Je crée les classes de la hiérarchie suivante:

    <center>
    <img width="80%" src="hierarchie_animaux.svg"/>
    </center>

1. J'implante ou redéfini les méthodes suivantes, **dans les bonnes classes**
    * `public void manger()`
    * `public void dormir()`
    * `public String typeDeCri()`
    * `public void miauler()`
    * `public int nombreOiseauxAttrapes()`
        * les choix sont: `0`, `1` ou `12` oiseaux attrapés
    * `public void japper()`
    * `public int nombreDeTaches()`
        * un seul animal a des taches (et toujours `45` taches)

1. J'ajoute une méthode `main` à la classe `MonAtelier2_2`:

    $[java ./MonAtelier2_2 1 6]()

1. J'exécute mon projet et je valide mes classes et mes méthodes

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`


## Remise

1. Je pousse un commit avec **exactement** le commentaire `atelier 2.2`, p.ex:

        $ git commit --allow-empty -m"atelier 2.2"
        $ git push

<!--

1. Je peux faire l'entrevue avant la date limite en créant un billet `entrevue 2.2`
    * Le prof va prioriser les questions, je devrai peut-être faire preuve de patience

1. Sinon, le prof va me contacter avec un rendez-vous avant la date limite

-->
