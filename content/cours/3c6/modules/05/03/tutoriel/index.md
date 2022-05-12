# Tutoriel 5.3: map naïf

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `tutoriel5_3`
        * chemin du projet: `~/3c6_PRENOM_NOM/tutoriel5_3`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./tutoriel5_3.jar](tutoriel5_3.jar)

1. Je crée les classes `TesteurDeMapAbstract` et `TesteurDeMapNaif`
    * voir l'$[link ../../../04/03/atelier/](atelier 4.3)

1. Je crée la classe `MapJavaNaif` qui hérite de `MapJava`

1. En suivant la théorie, j'implante les méthodes pour remplir le contrat de `MapJava`

1. Je crée la classe `MonTutoriel5_3` qui hérite de la classe `Tutoriel5_3`

1. Je corrige les erreurs de compilation

1. J'ajoute une méthode `main` à la classe `MonTutoriel5_3`:

    $[java ./MonTutoriel5_3 3 6]()

1. J'implante la méthode pour remplir le contrat du `Tutoriel5_3`, p.ex:

    $[java ./MonTutoriel5_3 8 10]()

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

### Étape 01: créer le projet `tutoriel5_3`

1. Je crée un projet nommé `tutoriel5_3`
    * *File* => *New* => *Java Project*
        * Je décoche *Use default location*
            * je navigue à la racine du dépôt Git `~/3c6_PRENOM_NOM`
            * je crée un nouveau répertoire nommé `tutoriel5_3`
            * je sélectionne ce nouveau répertoire
        * Je vérifie que le projet utilise le JDK **1.8**
        * Je clique sur *Finish*


### Étape 02: ajouter la librairie `tutoriel5_3.jar`

1. Je télécharge le fichier $[download ./tutoriel5_3.jar](tutoriel5_3.jar) et je le place **à la racine du projet**

1. Je rafraîchis Eclipse afin de voir le fichier `.jar`
    * *Clique-droit* sur le projet => *Refresh*

1. J'ajoute la librairie au `classpath`:
    * *Clique-droit* sur le projet => *Build path* => *Configure Build Path*
        * Onglet *Librairies* =>
        * Je clique sur *Add JARs...*
            * je sélectionne le projet `tutoriel5_3`
            * je sélectionne le fichier `tutoriel5_3.jar`
        * Je clique sur *Apply and Close*

### Étape 03: créer la classe `MonTutoriel5_3`

1. Je crée une nouvelle classe nommée `MonTutoriel5_3`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `MonTutoriel5_3`

### Étape 04: hériter de Tutoriel5_3

1. J'ouvre `MonTutoriel5_3` et j'ajoute `extends Tutoriel5_3`

1. J'utilise $[kbd](Ctrl+1) pour ajouter le `import` de `Tutoriel5_3`

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

### Étape 05: créer la classe `MapJavaNaif`

1. Je crée une nouvelle classe nommée `MapJavaNaif`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `MapJavaNaif`

1. J'ouvre `MapJavaNaif` et je complète la signature:

    $[java ./MapJavaNaif 1 2]()

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. Je code la classe:

    $[java ./MapJavaNaif]()

### Étape 06: créer la classe `TesteurDeMapAbstrait`

1. Je crée une nouvelle classe nommée `TesteurDeMapAbstrait`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `TesteurDeMapAbstrait`

1. J'ouvre `TesteurDeMapAbstrait` et je complète la signature:

    $[java ./TesteurDeMapAbstrait 1 1]()

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. Je code la classe:

    $[java ./TesteurDeMapAbstrait]()

### Étape 07: créer la classe `TesteurDeMapNaif`

1. Je crée une nouvelle classe nommée `TesteurDeMapNaif`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `TesteurDeMapNaif`

1. J'ouvre `TesteurDeMapNaif` et je complète la signature:

    $[java ./TesteurDeMapNaif 1 1]()

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. Je code la classe:

    $[java ./TesteurDeMapNaif]()

### Étape 08: remplir le contrat `Tutoriel5_3`

1. J'implante les méthodes pour remplir le contrat du `Tutoriel5_3`, p.ex:

    $[java ./MonTutoriel5_3 8 10]()

### Étape 09: ajouter la méthode `main`

1. J'ouvre `MonTutoriel5_3` et j'ajoute la méthode `main`

    $[java ./MonTutoriel5_3 1 6]()

### Étape 10: exécuter pour valider

1. J'exécute mon projet, je valide mon code et vérifie la performance:

    <center>
        <img src="validation.png" width="90%">
    </center>

    <center>
        <img src="performance.png" width="90%">
    </center>
