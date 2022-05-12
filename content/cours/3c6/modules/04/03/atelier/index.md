# Atelier 4.3: structures Java

## Préalable

1. J'effectue d'abord le $[link ../tutoriel/](tutoriel 4.3)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `atelier4_3`
        * chemin du projet: `~/3c6_PRENOM_NOM/atelier4_3`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./atelier4_3.jar](atelier4_3.jar)
        * le projet utilise la base de données $[download ./atelier4_3.db](atelier4_3.db)

1. Je crée la classe `MonAtelier4_3` qui hérite de la classe `Atelier4_3`

1. Je crée la classe `TesteurDeMappageAbstrait` qui implante l'interface `TesteurDeMappage`
    * j'implante les méthodes:
        * `fairePlusieursAjoutsAleatoires`
            * pour `nombreOperations` fois:
                * choisir une des `cles` au hasard
                * insérer une valeur aléatoire pour cette clé
        * `fairePlusieursModificationsAleatoires`
            * pour `nombreOperations` fois:
                * choisir une des `cles` au hasard
                * modifier la valeur associée à cette clé
        * `fairePlusieursRetraitsAleatoires`
            * pour `nombreOperations` fois:
                * choisir une des `cles` au hasard
                * retirer cette clé du map

1. Je crée la classe `TesteurDeMappageHash` qui hérite de `TesteurDeMappageAbstrait`
    * j'implante les méthodes:
        * `nouveauMap`
            * retourne un nouveau `HashMap`
        * `accederAuClesDansOrdre`
            * je trouve comment extraire une liste contenant les clés
            * j'utilise `Collections.sort()` pour trier les clés

    **NOTE**: pour accéder, faire p.ex. `String x = cle;` pour chaque clé

1. Je crée la classe `TesteurDeMappageTree` qui hérite de `TesteurDeMappageAbstrait`
    * j'implante les méthodes:
        * `nouveauMap`
            * retourne un nouveau `TreeMap`
        * `accederAuClesDansOrdre`
            * les clés sont déjà triées

    **NOTE**: pour accéder, faire p.ex. `String x = cle;` pour chaque clé

1. Je corrige les erreurs de compilation

1. J'ajoute une méthode `main` à la classe `MonAtelier4_3`:

    $[java ./MonAtelier4_3 3 6]()

1. J'implante les méthodes pour remplir le contrat du `Atelier4_3`, p.ex:

    $[java ./MonAtelier4_3 8 26]()

1. J'exécute mon projet, je valide mon code et je teste la performance:

    <center>
        <img src="validation.png" width="90%">
    </center>

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`


## Remise

1. Je pousse un commit avec **exactement** le commentaire `atelier 4.3`, p.ex:

        $ git commit --allow-empty -m"atelier 4.3"
        $ git push

<!--

1. Je peux faire l'entrevue avant la date limite en créant un billet `entrevue 4.3`
    * Le prof va prioriser les questions, je devrai peut-être faire preuve de patience

1. Sinon, le prof va me contacter avec un rendez-vous avant la date limite


-->
