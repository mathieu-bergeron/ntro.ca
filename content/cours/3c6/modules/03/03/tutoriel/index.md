---
title: ""
weight: 1
bookHidden: true
---


# Tutoriel 3.3: efficacité (1)

## Préalable

1. Je regarde d'abord la présentation des $[link ../validation/](ajouts à l'outil de validation)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `tutoriel3_3`
        * chemin du projet: `~/3c6_PRENOM_NOM/tutoriel3_3`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./tutoriel3_3.jar](tutoriel3_3.jar)
        * le projet utilise la base de données $[download ./tutoriel3_3.db](tutoriel3_3.db)

1. La libraire `tutoriel3_3.jar` contient `MonTableau` qui implante l'interface `Tableau`

    $[java ./Tableau]()

1. Je crée la classe `MonTutoriel3_3` qui hérite de la classe `Tutoriel3_3`

1. Je crée la classe `ChercheurA` qui implante l'interface `Chercheur`
    * j'implante un chercheur naïf 
    * la méthode `trouverIndicePourValeur`:
        * reçoit en argument un `tableau` et une `valeur` à chercher
        * retourne l'indice du dernier élément corresondant à la `valeur` cherchée


1. Je crée la classe `ChercheurB` qui implante aussi l'interface `Chercheur`
    * j'implante un chercheur volontairement inefficace

1. Je corrige les erreurs de compilation

1. J'ajoute une méthode `main` à la classe `MonTutoriel3_3`:

    $[java ./MonTutoriel3_3 3 6]()

1. J'implante les méthodes pour remplir le contrat du `Tutoriel3_3`, p.ex:

    $[java ./MonTutoriel3_3 8 26]()

1. J'exécute mon projet, je valide mes méthodes et j'observe les tests de performance
    * en particulier, je vérifie que `ChercheurB` est moins efficace que `ChercheurA`

        <center>
            <img src="tutoriel3_3.png" width="90%">
        </center>
        

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`

## Réalisation

### Étape 01: créer le projet `tutoriel3_3`

1. Je crée un projet nommé `tutoriel3_3`
    * *File* => *New* => *Java Project*
        * Je décoche *Use default location*
            * je navigue à la racine du dépôt Git `~/3c6_PRENOM_NOM`
            * je crée un nouveau répertoire nommé `tutoriel3_3`
            * je sélectionne ce nouveau répertoire
        * Je vérifie que le projet utilise le JDK **1.8**
        * Je clique sur *Finish*


### Étape 02: ajouter la librairie `tutoriel3_3.jar`

1. Je télécharge le fichier $[download ./tutoriel3_3.jar](tutoriel3_3.jar) et je le place **à la racine du projet**

1. Je rafraîchis Eclipse afin de voir le fichier `.jar`
    * *Clique-droit* sur le projet => *Refresh*

1. J'ajoute la librairie au `classpath`:
    * *Clique-droit* sur le projet => *Build path* => *Configure Build Path*
        * Onglet *Librairies* =>
        * Je clique sur *Add JARs...*
            * je sélectionne le projet `tutoriel3_3`
            * je sélectionne le fichier `tutoriel3_3.jar`
        * Je clique sur *Apply and Close*

### Étape 03: ajouter la base de données `tutoriel3_3.db`

1. Je télécharge le fichier $[download ./tutoriel3_3.db](tutoriel3_3.db) et je le place **à la racine du projet**

1. Je rafraîchis Eclipse afin de voir le fichier `.db`
    * *Clique-droit* sur le projet => *Refresh*


### Étape 04: créer la classe `MonTutoriel3_3`

1. Je crée une nouvelle classe nommée `MonTutoriel3_3`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `MonTutoriel3_3`

### Étape 05: hériter de Tutoriel3_3

1. J'ouvre `MonTutoriel3_3` et j'ajoute `extends Tutoriel3_3`

1. J'utilise $[kbd](Ctrl+1) pour ajouter le `import` de `Tutoriel3_3`

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

### Étape 06: créer la classe `ChercheurA`

1. Je crée une nouvelle classe nommée `ChercheurA`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `ChercheurA`

1. J'ouvre `ChercheurA` et je complète la signature:

    $[java ./ChercheurA_signature]()

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. J'ouvre `ChercheurA` et je code le chercheur naïf:

    $[java ./ChercheurA]()

### Étape 07: créer la classe `ChercheurB`

1. Je crée une nouvelle classe nommée `ChercheurB`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `ChercheurB`

1. J'ouvre `ChercheurB` et je complète la signature:

    $[java ./ChercheurB_signature]()

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. J'ouvre `ChercheurB` et je code le chercheur inefficace:

    <style>
    .ici > div > pre > code {
        -webkit-touch-callout: text;
        -webkit-user-select: text;
        -khtml-user-select: text;
        -moz-user-select: text;
        -ms-user-select: text;
        user-select: text;
    }
    </style>


    <div class="ici">
    $[java ./ChercheurB]()
    </div>

    * NOTE: je peux copier-coller le code ci-haut


### Étape 08: remplir le contrat `Tutoriel3_3`

1. J'implante les méthodes pour remplir le contrat du `Tutoriel3_3`, p.ex:

    $[java ./MonTutoriel3_3 8 26]()

### Étape 09: ajouter la méthode `main`

1. J'ouvre `MonTutoriel3_3` et j'ajoute la méthode `main`

    $[java ./MonTutoriel3_3 1 6]()

### Étape 10: exécuter pour valider

1. J'exécute mon programme

1. Je valide mes méthodes et j'observe les tests de performance
    * en particulier, je vérifie que `ChercheurB` est moins efficace que `ChercheurA`

        <center>
            <img src="tutoriel3_3.png" width="90%">
        </center>
