---
title: ""
weight: 1
bookHidden: true
---


# Atelier 3.3: efficacité (1)

## Préalable

1. J'effectue d'abord le $[link ../tutoriel/](tutoriel 3.3)

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `atelier3_3`
        * chemin du projet: `~/3c6_PRENOM_NOM/atelier3_3`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./atelier3_3.jar](atelier3_3.jar)
        * le projet utilise la base de données $[download ./atelier3_3.db](atelier3_3.db)

1. La libraire `atelier3_3.jar` contient `MonTableau` qui implante l'interface `Tableau`

    $[java ./Tableau]()

1. Pour créer un nouveau tableau vide, faire p.ex:

    $[java ./CreerTableau]()

1. Je crée la classe `MonAtelier3_3` qui hérite de la classe `Atelier3_3`


1. Je crée la classe `TrieurNaif` qui implante l'interface `Trieur`

1. Dans `TrieurNaif`:
    * je crée la méthode `private C valeurMinimale(Tableau<C> tableau)` qui:
        * reçoit un tableau en entrée
        * détermine la plus petite valeur de ce tableau
        * retourne cette valeur

1. Dans `TrieurNaif`:
    * j'implante un trieur naïf 
    * la méthode `trier`:
        * reçoit en argument le tableau `entree`
        * retourne un tableau avec les mêmes éléments, mais triés du plus petit au plus grand
    * voici le pseudo-code:
        <span class="pseudo">
        $[embed ./TrieurNaif]
        </span>

1. Je corrige les erreurs de compilation

1. J'ajoute une méthode `main` à la classe `MonAtelier3_3`:

    $[java ./MonAtelier3_3 3 6]()

1. J'implante les méthodes pour remplir le contrat du `Atelier3_3`, p.ex:

    $[java ./MonAtelier3_3 8 26]()

1. J'exécute mon projet, je valide mes méthodes et j'observe les tests de performance
    * en particulier, je vérifie que `TrieurNaif` n'est pas très efficace:

        <center>
            <img src="atelier3_3.png" width="90%">
        </center>

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`


## Remise

1. Je pousse un commit avec **exactement** le commentaire `atelier 3.3`, p.ex:

        $ git commit --allow-empty -m"atelier 3.3"
        $ git push

<!--

1. Je peux faire l'entrevue avant la date limite en créant un billet `entrevue 3.3`
    * Le prof va prioriser les questions, je devrai peut-être faire preuve de patience

1. Sinon, le prof va me contacter avec un rendez-vous avant la date limite

-->
