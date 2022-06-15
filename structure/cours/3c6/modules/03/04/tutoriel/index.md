---
title: ""
weight: 1
bookHidden: true
---


# Tutoriel 3.4: efficacité (2)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `tutoriel3_4`
        * chemin du projet: `~/3c6_PRENOM_NOM/tutoriel3_4`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./tutoriel3_4.jar](tutoriel3_4.jar)
        * le projet utilise la base de données $[download ./tutoriel3_4.db](tutoriel3_4.db)

1. La libraire `tutoriel3_4.jar` contient `MonTableau` qui implante l'interface `Tableau`

    $[java ./Tableau]()

1. Je crée la classe `MonTutoriel3_4` qui hérite de la classe `Tutoriel3_4`

1. Je crée la classe `ChercheurNaif` qui implante l'interface `Chercheur`
    * j'implante un chercheur naïf 
    * la méthode `trouverIndicePourValeur`:
        * reçoit en argument un `tableau` et une `valeur` à chercher
        * retourne l'indice du dernier élément corresondant à la `valeur` cherchée

1. Je crée la classe `ChercheurEfficace` qui implante l'interface `Chercheur`
    * j'implante un chercheur binaire ("diviser pour régner")
    * la méthode `trouverIndicePourValeur`:
        * reçoit en argument un `tableau` et une `valeur` à chercher
        * retourne l'indice du dernier élément corresondant à la `valeur` cherchée

1. Je corrige les erreurs de compilation

1. J'ajoute une méthode `main` à la classe `MonTutoriel3_4`:

    $[java ./MonTutoriel3_4 3 6]()

1. J'implante les méthodes pour remplir le contrat du `Tutoriel3_4`, p.ex:

    $[java ./MonTutoriel3_4 8 26]()

1. J'exécute mon projet, je valide mes méthodes et j'observe les tests de performance
    * en particulier, je vérifie que `ChercheurEffiface` est beaucoup plus efficace que `ChercheurNaif`

        <center>
            <img src="tutoriel3_4.png" width="90%">
        </center>
        


1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`

## Réalisation

### Étape 01: créer le projet `tutoriel3_4`

1. Je crée un projet nommé `tutoriel3_4`
    * *File* => *New* => *Java Project*
        * Je décoche *Use default location*
            * je navigue à la racine du dépôt Git `~/3c6_PRENOM_NOM`
            * je crée un nouveau répertoire nommé `tutoriel3_4`
            * je sélectionne ce nouveau répertoire
        * Je vérifie que le projet utilise le JDK **1.8**
        * Je clique sur *Finish*


### Étape 02: ajouter la librairie `tutoriel3_4.jar`

1. Je télécharge le fichier $[download ./tutoriel3_4.jar](tutoriel3_4.jar) et je le place **à la racine du projet**

1. Je rafraîchis Eclipse afin de voir le fichier `.jar`
    * *Clique-droit* sur le projet => *Refresh*

1. J'ajoute la librairie au `classpath`:
    * *Clique-droit* sur le projet => *Build path* => *Configure Build Path*
        * Onglet *Librairies* =>
        * Je clique sur *Add JARs...*
            * je sélectionne le projet `tutoriel3_4`
            * je sélectionne le fichier `tutoriel3_4.jar`
        * Je clique sur *Apply and Close*

### Étape 03: ajouter la base de données `tutoriel3_4.db`

1. Je télécharge le fichier $[download ./tutoriel3_4.db](tutoriel3_4.db) et je le place **à la racine du projet**

1. Je rafraîchis Eclipse afin de voir le fichier `.db`
    * *Clique-droit* sur le projet => *Refresh*


### Étape 04: créer la classe `MonTutoriel3_4`

1. Je crée une nouvelle classe nommée `MonTutoriel3_4`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `MonTutoriel3_4`

### Étape 05: hériter de Tutoriel3_4

1. J'ouvre `MonTutoriel3_4` et j'ajoute `extends Tutoriel3_4`

1. J'utilise $[kbd](Ctrl+1) pour ajouter le `import` de `Tutoriel3_4`

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

### Étape 06: créer la classe `ChercheurNaif`

1. Je crée une nouvelle classe nommée `ChercheurNaif`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `ChercheurNaif`

1. J'ouvre `ChercheurNaif` et j'ajoute `implements Chercheur`

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. J'ouvre `ChercheurNaif` et je code le chercheur naïf:

    $[java ./ChercheurNaif]()

### Étape 07: créer la classe `ChercheurEfficace`

1. Je crée une nouvelle classe nommée `ChercheurEfficace`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `ChercheurEfficace`

1. J'ouvre `ChercheurEfficace` et j'ajoute `implements Chercheur`

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. J'ouvre `ChercheurEfficace` et je code le chercheur efficace:

    $[java ./ChercheurEfficace]()

### Étape 08: remplir le contrat `Tutoriel3_4`

1. J'implante les méthodes pour remplir le contrat du `Tutoriel3_4`, p.ex:

    $[java ./MonTutoriel3_4 8 26]()

### Étape 09: ajouter la méthode `main`

1. J'ouvre `MonTutoriel3_4` et j'ajoute la méthode `main`

    $[java ./MonTutoriel3_4 1 6]()


### Étape 10: exécuter pour valider

1. J'exécute mon programme

1. J'exécute mon projet, je valide mes méthodes et j'observe les tests de performance
    * en particulier, je vérifie que `ChercheurEffiface` est beaucoup plus efficace que `ChercheurNaif`

        <center>
            <img src="tutoriel3_4.png" width="90%">
        </center>
