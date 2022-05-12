# Atelier 2.3: héritage

## Préalable

1. J'effectue d'abord le $[link ../tutoriel/](tutoriel 2.3)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `atelier2_3`
        * chemin du projet: `~/3c6_PRENOM_NOM/atelier2_3`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./atelier2_3.jar](atelier2_3.jar)
        * le projet utilise la base de données $[download ./atelier2_3.db](atelier2_3.db)

1. Je crée la classe `MonAtelier2_3` qui hérite de la classe `Atelier2_3`

1. Je crée la classe `MonAccepteur` qui implante l'interface `Accepteur`
    * la méthode `accepterLesChats(Animal animal)` doit:
        * retourner vrai si l'`animal` est un `Chat`
        * retourner faux sinon
    * la méthode `accepterLesBonsChasseurs(Animal animal)` doit:
        * retourner vrai l'`animal` a attrapé plus de `6` oiseaux
        * retourner faux sinon
    * la méthode `accepterLesJappeurs(Animal animal)` doit:
        * retourner vrai le cri de l'`animal` est le `jappement`
        * retourner faux sinon

1. Je crée la classe `MonFormateur` qui implante l'interface `Formateur`
    * la méthode `formater(Animal animal)` doit retourner:
        * `"Je suis un ANIMAL PRÉSENTATION"`
        * où:
            * `ANIMAL` est remplacé par le type d'animal
            * `PRÉSENTATION` est, selon le cas:
                * `" et je suis un bon chasseur."`
                * `", mais je suis un mauvais chasseur."`
                * `" et j'ai TACHES taches."` 
                    * où `TACHES` est remplacé par le nombre de taches
                * `", mais je n'ai pas de taches"`

1. J'implante les méthodes `fournirAccepteur` et `fournirFormateur`

1. J'ajoute une méthode `main` à la classe `MonAtelier2_3`:

    $[java ./MonAtelier2_3 3 6]()

1. J'exécute mon projet et je valide mes classes et mes méthodes

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`


## Remise

1. Je pousse un commit avec **exactement** le commentaire `atelier 2.3`, p.ex:

        $ git commit --allow-empty -m"atelier 2.3"
        $ git push

<!--

1. Je peux faire l'entrevue avant la date limite en créant un billet `entrevue 2.3`
    * Le prof va prioriser les questions, je devrai peut-être faire preuve de patience

1. Sinon, le prof va me contacter avec un rendez-vous avant la date limite


-->
