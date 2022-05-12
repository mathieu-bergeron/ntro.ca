# Atelier 2.6: constructeurs et `super`

## Préalable

1. J'effectue d'abord le $[link ../tutoriel/](tutoriel 2.6)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `atelier2_6`
        * chemin du projet: `~/3c6_PRENOM_NOM/atelier2_6`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./atelier2_6.jar](atelier2_6.jar)
        * le projet utilise la base de données $[download ./atelier2_6.db](atelier2_6.db)

1. Je crée la classe `MonAtelier2_6` qui hérite de la classe `Atelier2_6`

1. Je recopie les classes suivantes de l'`atelier2_5`:
    * `Animal`
    * `Chat`
    * `Chien`
    * `ChatPersan`
    * `ChatGouttiere`
    * `Bouledogue`
    * `Shihtzu`

1. Je recopie les interfaces suivantes de l'`atelier2_5`:
    * `Dormeur`
    * `Formateur`

1. J'ajoute le constructeur suivant:
    * `Animal(int heuresTotalesDeSommeil)`

1. J'ajoute le constructeur suivant:
    * `Chat(int heuresTotalesDeSommeil, int nombreOiseauxAttrapes)`

1. Dans `Chat`, je redéfinis la méthode `formater` pour retourner:
    * la même chose que `Animal.formater`, mais en ajoutant:
        * `" J'ai aussi attrapé OISEAUX oiseaux"`
            * où: `OISEAU` sera remplacé par le nombre d'oiseaux attrapés

1. Je corrige les erreurs de compilation

1. J'ajoute une méthode `main` à la classe `MonAtelier2_6`:

    $[java ./MonAtelier2_6 3 6]()

1. J'implante les méthodes pour remplir le contrat du `Atelier2_6`, p.ex:

    $[java ./MonAtelier2_6 8 26]()

    * NOTE: il y a maintenant des paramètres à passer au constructeur

1. J'exécute mon projet et je valide mes classes et mes méthodes

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`


## Remise

1. Je pousse un commit avec **exactement** le commentaire `atelier 2.6`, p.ex:

        $ git commit --allow-empty -m"atelier 2.6"
        $ git push

<!--

1. Je peux faire l'entrevue avant la date limite en créant un billet `entrevue 2.6`
    * Le prof va prioriser les questions, je devrai peut-être faire preuve de patience

1. Sinon, le prof va me contacter avec un rendez-vous avant la date limite

-->
