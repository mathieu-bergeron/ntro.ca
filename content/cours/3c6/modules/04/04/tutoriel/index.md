# Tutoriel 4.4: modifier un fichier (naïf)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `tutoriel4_4`
        * chemin du projet: `~/3c6_PRENOM_NOM/tutoriel4_4`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./tutoriel4_4.jar](tutoriel4_4.jar)
        * le projet utilise la base de données $[download ./tutoriel4_4.db](tutoriel4_4.db)

1. Je crée la classe `MonTutoriel4_4` qui hérite de la classe `Tutoriel4_4`

1. Je crée la classe `ManipulateurDeFichierAbstrait` qui implante l'interface `ManipulateurDeFichier`
    * j'implante les méthodes:
        * `formaterDouble`
        * `ecrireFichier`
        * `lireFichier`

1. Je crée la classe `ManipulateurDeFichierNaif` qui hérite de `ManipulateurDeFichierAbstrait`
    * j'implante le méthode `modifierFichier`

1. Je corrige les erreurs de compilation

1. J'ajoute une méthode `main` à la classe `MonTutoriel4_4`:

    $[java ./MonTutoriel4_4.4 6]()

1. J'implante les méthodes pour remplir le contrat du `Tutoriel4_4`, p.ex:

    $[java ./MonTutoriel4_4 8 26]()

1. J'exécute mon projet, je valide mon code et je teste la performance:

    <center>
        <img src="validation.png" width="90%">
    </center>

1. Je vérifie aussi qu'il y a des fichiers `tutoriel4_4_TAILLE_naif.txt` à la racine du projet
    * j'ouvre un fichier pour inspecter sa structure, p.ex.

            30,29
            86,21
            83,86
            62,82
            60,00
            82,76
            08,57
            31,02
            05,57
            18,24

    * NOTE: les nombres sont formatés avec une taille fixe


1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`

## Réalisation

### Étape 01: créer le projet `tutoriel4_4`

1. Je crée un projet nommé `tutoriel4_4`
    * *File* => *New* => *Java Project*
        * Je décoche *Use default location*
            * je navigue à la racine du dépôt Git `~/3c6_PRENOM_NOM`
            * je crée un nouveau répertoire nommé `tutoriel4_4`
            * je sélectionne ce nouveau répertoire
        * Je vérifie que le projet utilise le JDK **1.8**
        * Je clique sur *Finish*


### Étape 02: ajouter la librairie `tutoriel4_4.jar`

1. Je télécharge le fichier $[download ./tutoriel4_4.jar](tutoriel4_4.jar) et je le place **à la racine du projet**

1. Je rafraîchis Eclipse afin de voir le fichier `.jar`
    * *Clique-droit* sur le projet => *Refresh*

1. J'ajoute la librairie au `classpath`:
    * *Clique-droit* sur le projet => *Build path* => *Configure Build Path*
        * Onglet *Librairies* =>
        * Je clique sur *Add JARs...*
            * je sélectionne le projet `tutoriel4_4`
            * je sélectionne le fichier `tutoriel4_4.jar`
        * Je clique sur *Apply and Close*

### Étape 03: ajouter la base de données `tutoriel4_4.db`

1. Je télécharge le fichier $[download ./tutoriel4_4.db](tutoriel4_4.db) et je le place **à la racine du projet**

1. Je rafraîchis Eclipse afin de voir le fichier `.db`
    * *Clique-droit* sur le projet => *Refresh*


### Étape 04: créer la classe `MonTutoriel4_4`

1. Je crée une nouvelle classe nommée `MonTutoriel4_4`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `MonTutoriel4_4`

### Étape 05: hériter de Tutoriel4_4

1. J'ouvre `MonTutoriel4_4` et j'ajoute `extends Tutoriel4_4`

1. J'utilise $[kbd](Ctrl+1) pour ajouter le `import` de `Tutoriel4_4`

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

### Étape 06: créer la classe `ManipulateurDeFichierAbstrait`

1. Je crée une nouvelle classe nommée `ManipulateurDeFichierAbstrait`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `ManipulateurDeFichierAbstrait`

1. J'ouvre `ManipulateurDeFichierAbstrait` et je complète la signature:

    $[java ./ManipulateurDeFichierAbstrait 1 1]()

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. Je code la classe:

    $[java ./ManipulateurDeFichierAbstrait]()

1. Je retire la méthode `nouvelleListe`

1. J'ajuste le signature pour ajouter le `abstract`

    $[java ./ManipulateurDeFichierAbstrait_signature_finale 1 1]()

### Étape 07: créer la classe `ManipulateurDeFichierNaif`

1. Je crée une nouvelle classe nommée `ManipulateurDeFichierNaif`
    * *Clique-droit* sur le projet => *New* => *Class*
        *  *Name*: `ManipulateurDeFichierNaif`

1. J'ouvre `ManipulateurDeFichierNaif` et je complète la signature:

    $[java ./ManipulateurDeFichierNaif 1 1]()

1. J'utilise $[kbd](Ctrl+1) pour générer les méthodes manquantes
    * option `add unimplemented methods`

1. Je code la classe:

    $[java ./ManipulateurDeFichierNaif]()

    * NOTE: chaque `double` est formaté avec une taille fixe

### Étape 08: remplir le contrat `Tutoriel4_4`

1. J'implante les méthodes pour remplir le contrat du `Tutoriel4_4`, p.ex:

    $[java ./MonTutoriel4_4 8 26]()

### Étape 09: ajouter la méthode `main`

1. J'ouvre `MonTutoriel4_4` et j'ajoute la méthode `main`

    $[java ./MonTutoriel4_4 1 6]()


### Étape 10: exécuter pour valider

1. J'exécute mon projet, je valide mon code et je teste la performance:

    <center>
        <img src="validation.png" width="90%">
    </center>

1. Je vérifie aussi qu'il y a des fichiers `tutoriel4_4_TAILLE_naif.txt` à la racine du projet
    * j'ouvre un fichier pour inspecter sa structure, p.ex.

            30,29
            86,21
            83,86
            62,82
            60,00
            82,76
            08,57
            31,02
            05,57
            18,24

    * NOTE: les nombres sont formatés avec une taille fixe
