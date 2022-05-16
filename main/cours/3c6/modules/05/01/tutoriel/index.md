---
title: ""
weight: 1
bookHidden: true
---


# Tutoriel 5.1: liste naïve

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `tutoriel5_1`
        * chemin du projet: `~/3c6_PRENOM_NOM/tutoriel5_1`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./tutoriel5_1.jar](tutoriel5_1.jar)



1. Je crée la classe `ListeJavaNaive` qui hérite de la classe `ListeJava`

1. J'implante les méthodes pour remplir le contrat de `ListeJava`, c-à-d:

    $[java ./ListeJava]()

1. Je crée les classes `TesteurDeListeAbstrait` et `TesteurDeListeNaive`
    * voir le $[link ../../../04/03/tutoriel/](tutoriel 4.3)

1. J'implante les méthodes de `TesteurDeListeAbstrait` et `TesteurDeListeNaive`
    * en particulier, j'implante `melangerLaListe` comme dans la théorie

1. Je crée la classe `MonTutoriel5_1` qui hérite de la classe `Tutoriel5_1`

1. Je corrige les erreurs de compilation

1. J'ajoute une méthode `main` à la classe `MonTutoriel5_1`:

    $[java ./MonTutoriel5_1 3 6]()

1. J'implante les méthodes pour remplir le contrat du `Tutoriel5_1`, p.ex:

    $[java ./MonTutoriel5_1 8 31]()

1. J'exécute mon projet, je valide mon code et vérifie la performance:

    <center>
        <img src="validation.png" width="90%">
    </center>

    <center>
        <img src="performance.png" width="90%">
    </center>


1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`

## Réalisation

### Étape 01: créer le projet `tutoriel5_1`

1. Je crée un projet nommé `tutoriel5_1`
    * *File* => *New* => *Java Project*
        * Je décoche *Use default location*
            * je navigue à la racine du dépôt Git `~/3c6_PRENOM_NOM`
            * je crée un nouveau répertoire nommé `tutoriel5_1`
            * je sélectionne ce nouveau répertoire
        * Je vérifie que le projet utilise le JDK **1.8**
        * Je clique sur *Finish*


### Étape 02: ajouter la librairie `tutoriel5_1.jar`

1. Je télécharge le fichier $[download ./tutoriel5_1.jar](tutoriel5_1.jar) et je le place **à la racine du projet**

1. Je rafraîchis Eclipse afin de voir le fichier `.jar`
    * *Clique-droit* sur le projet => *Refresh*

1. J'ajoute la librairie au `classpath`:
    * *Clique-droit* sur le projet => *Build path* => *Configure Build Path*
        * Onglet *Librairies* =>
        * Je clique sur *Add JARs...*
            * je sélectionne le projet `tutoriel5_1`
            * je sélectionne le fichier `tutoriel5_1.jar`
        * Je clique sur *Apply and Close*

### Étape 03: créer la classe `MonTutoriel5_1`

1. Je crée une nouvelle classe nommée `MonTutoriel5_1`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `MonTutoriel5_1`

### Étape 04: hériter de Tutoriel5_1

1. J'ouvre `MonTutoriel5_1` et j'ajoute `extends Tutoriel5_1`

1. J'utilise $[kbd](Ctrl+1) pour ajouter le `import` de `Tutoriel5_1`

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

### Étape 05: créer la classe `ListeJavaNaive`

1. Je crée une nouvelle classe nommée `ListeJavaNaive`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `ListeJavaNaive`

1. J'ouvre `ListeJavaNaive` et je complète la signature:

    $[java ./ListeJavaNaive 1 1]()

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. Je code la classe:

    $[java ./ListeJavaNaive]()

### Étape 06: créer la classe `TesteurDeListeAbstrait`

1. Je crée une nouvelle classe nommée `TesteurDeListeAbstrait`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `TesteurDeListeAbstrait`

1. J'ouvre `TesteurDeListeAbstrait` et je complète la signature:

    $[java ./TesteurDeListeAbstrait 1 1]()

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. Je code la classe:

    $[java ./TesteurDeListeAbstrait]()

1. J'ajoute le abstract à la signature

    $[java ./TesteurDeListeAbstrait_abstract 1 1]()


### Étape 07: créer la classe `TesteurDeListeNaive`

1. Je crée une nouvelle classe nommée `TesteurDeListeNaive`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `TesteurDeListeNaive`

1. J'ouvre `TesteurDeListeNaive` et je complète la signature:

    $[java ./TesteurDeListeNaive 1 1]()

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. Je code la classe:

    $[java ./TesteurDeListeNaive]()

### Étape 08: remplir le contrat `Tutoriel5_1`

1. J'implante les méthodes pour remplir le contrat du `Tutoriel5_1`, p.ex:

    $[java ./MonTutoriel5_1 8 31]()

### Étape 09: ajouter la méthode `main`

1. J'ouvre `MonTutoriel5_1` et j'ajoute la méthode `main`

    $[java ./MonTutoriel5_1 1 6]()

### Étape 10: exécuter pour valider

1. J'exécute mon projet, je valide mon code et vérifie la performance:

    <center>
        <img src="validation.png" width="90%">
    </center>

    <center>
        <img src="performance.png" width="90%">
    </center>
