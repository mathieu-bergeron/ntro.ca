# Tutoriel 2.1: la librairie `tutoriel2_1.jar`

## Préalable

1. Je regarde d'abord la présentation de l'$[link ../validation/](outil de validation)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `tutoriel2_1`
        * chemin du projet: `~/3c6_PRENOM_NOM/tutoriel2_1`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./tutoriel2_1.jar](tutoriel2_1.jar)
        * le projet utilise la base de données $[download ./tutoriel2_1.db](tutoriel2_1.db)

1. La librairie `tutoriel2_1.jar` contient:
    * la classe `Tutoriel2_1`
    * l'interface `Accepteur`
    * l'interface `Formateur`

1. Je crée la classe `MonTutoriel2_1` qui hérite de la classe `Tutoriel2_1`

1. Je crée la classe `MonAccepteur` qui implante l'interface `Accepteur`
    * la méthode `accepter(int valeur)` doit:
        * retourner vrai pour les valeurs entre `10` et `99` (inclusivement)
        * retourner faux sinon

1. Je crée la classe `MonFormateur` qui implante l'interface `Formateur`
    * la méthode `formater(int valeur)` doit:
        * retourner une chaîne où chaque chiffre est entre `[]`, p.ex. `[6][2]`

1. J'implante les méthodes `fournirAccepteur` et `fournirFormateur`

1. J'ajoute une méthode `main` à la classe `MonTutoriel2_1`:

    $[java ./MonTutoriel2_1 9 12]()

1. J'exécute mon projet et je valide mes méthodes

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`

## Réalisation

### Étape 01: créer le projet `tutoriel2_1`

1. Je crée un projet nommé `tutoriel2_1`
    * *File* => *New* => *Java Project*
        * Je décoche *Use default location*
            * je navigue à la racine du dépôt Git `~/3c6_PRENOM_NOM`
            * je crée un nouveau répertoire nommé `tutoriel2_1`
            * je sélectionne ce nouveau répertoire
        * Je vérifie que le projet utilise le JDK **1.8**
        * Je clique sur *Finish*


### Étape 02: ajouter la librairie `tutoriel2_1.jar`

1. Je télécharge le fichier $[download ./tutoriel2_1.jar](tutoriel2_1.jar) et je le place **à la racine du projet**

1. Je rafraîchis Eclipse afin de voir le fichier `.jar`
    * *Clique-droit* sur le projet => *Refresh*

1. J'ajoute la librairie au `classpath`:
    * *Clique-droit* sur le projet => *Build path* => *Configure Build Path*
        * Onglet *Librairies* =>
        * Je clique sur *Add JARs...*
            * je sélectionne le projet `tutoriel2_1`
            * je sélectionne le fichier `tutoriel2_1.jar`
        * Je clique sur *Apply and Close*

### Étape 03: ajouter la base de données `tutoriel2_1.db`

1. Je télécharge le fichier $[download ./tutoriel2_1.db](tutoriel2_1.db) et je le place **à la racine du projet**

1. Je rafraîchis Eclipse afin de voir le fichier `.db`
    * *Clique-droit* sur le projet => *Refresh*


### Étape 04: créer la classe `MonTutoriel2_1`

1. Je crée une nouvelle classe nommée `MonTutoriel2_1`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `MonTutoriel2_1`

### Étape 05: hériter de Tutoriel2_1

1. J'ouvre `MonTutoriel2_1` et j'ajoute `extends Tutoriel2_1`

1. J'utilise $[kbd](Ctrl+1) pour ajouter le `import` de `Tutoriel2_1`


1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

### Étape 06: créer la classe `MonAccepteur`

1. Je crée une nouvelle classe nommée `MonAccepteur`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `MonAccepteur`

1. J'ouvre `MonAccepteur` et j'ajoute `implements Accepteur`

1. J'utilise $[kbd](Ctrl+1) pour ajouter le `import` de `Accepteur`


1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. Je remplis la méthode `accepter` comme suit:

    $[java ./MonAccepteur 7 10]()

### Étape 07: créer la classe `MonFormateur`

1. Je crée une nouvelle classe nommée `MonFormateur`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `MonFormateur`

1. J'ouvre `MonFormateur` et j'ajoute `implements Formateur`

1. J'utilise $[kbd](Ctrl+1) pour ajouter le `import` de `Formateur`


1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. Je remplis la méthode `formater` comme suit:

    $[java ./MonFormateur 7 22]()

### Étape 08: remplir les méthdes de `MonTutoriel2_1`

1. Je peux maintenant remplir `fournirAccepteur` comme suit:

    $[java ./MonTutoriel2_1 14 17]()

1. Et `fournirFormateur` comme suit:

    $[java ./MonTutoriel2_1 19 22]()

### Étape 09: ajouter la méthode `main`

1. J'ouvre `MonTutoriel2_1` et j'ajoute la méthode `main`

    $[java ./MonTutoriel2_1 9 12]()


### Étape 10: exécuter pour valider

1. J'exécute mon programme

1. Je vérifie que la validation est réussie:

    <center>
    <img src="validation.png"   />
    </center>

1. Je ferme la fenêtre de validation

1. Je vérifie que l'application s'exécute à la console:


    <center>
    <img src="application.png"   />
    </center>





