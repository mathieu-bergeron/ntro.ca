# Atelier 3.4: efficacité (2)

## Préalable

1. J'effectue d'abord le $[link ../tutoriel/](tutoriel 3.4)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `atelier3_4`
        * chemin du projet: `~/3c6_PRENOM_NOM/atelier3_4`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./atelier3_4.jar](atelier3_4.jar)
        * le projet utilise la base de données $[download ./atelier3_4.db](atelier3_4.db)

1. Je crée la classe `MonAtelier3_4` qui hérite de la classe `Atelier3_4`

1. Je recopie la classe `TrieurNaif` à partir de l'`atelier3_3`

1. Je crée la classe `TrieurEfficace` qui implante l'interface `Trieur`
    * j'implante un tri fusion
    * la méthode `trier`:
        * reçoit en argument le tableau `entree`
        * retourne un tableau avec les mêmes éléments, mais triés du plus petit au plus grand
    * la méthode `fusionner`:
        * reçoit en argument deux tableaux `gauche` et `droite`
        * retourne un tableau fusionnant `gauche` et `droite`, en ajoutant les éléments dans l'ordre
    * **TRUC**: ajouter des méthodes privées rend le pseudo-code plus facile à coder
        * p.ex. le prof utilise des méthodes privées pour:
            * trier lorsque le tableau est long
            * extraire un sous-tableau
            * fusionner lorsque les tableaux sont longs
            * déplacer un élément vers un autre tableau
            * déplacer tous les éléments vers un autre tableau
    * voici le pseudo-code pour `trier`:
        <span class="pseudo">
        $[embed ./TriFusion]
        </span>
    * voici le pseudo-code pour `fusionner`:
        <span class="pseudo">
        $[embed ./TriFusion_fusionner]
        </span>



1. Je corrige les erreurs de compilation

1. J'ajoute une méthode `main` à la classe `MonAtelier3_4`:

    $[java ./MonAtelier3_4 3 6]()

1. J'implante les méthodes pour remplir le contrat du `Atelier3_4`, p.ex:

    $[java ./MonAtelier3_4 8 26]()

1. J'exécute mon projet, je valide mes méthodes et j'observe les tests de performance
    * en particulier, je vérifie que `TrieurEfficace` est beaucoup plus efficace que `TrieurNaif`

        <center>
            <img src="atelier3_4.png" width="90%">
        </center>

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`


## Remise

1. Je pousse un commit avec **exactement** le commentaire `atelier 3.4`, p.ex:

        $ git commit --allow-empty -m"atelier 3.4"
        $ git push

<!--

1. Je peux faire l'entrevue avant la date limite en créant un billet `entrevue 3.4`
    * Le prof va prioriser les questions, je devrai peut-être faire preuve de patience

1. Sinon, le prof va me contacter avec un rendez-vous avant la date limite

-->
