# Entrevue 2.1: utiliser `entrevue2_1.jar`

## Objectifs

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `entrevue2_1`
        * chemin du projet: `~/3c6_PRENOM_NOM/entrevue2_1`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./entrevue2_1.jar](entrevue2_1.jar)
        * le projet utilise la base de données $[download ./entrevue2_1.db](entrevue2_1.db)

1. La librairie `entrevue2_1.jar` contient:
    * la classe `Entrevue2_1`
    * l'interface `Accepteur`
    * l'interface `Formateur`

1. Je crée la classe `MonEntrevue2_1` qui hérite de `Entrevue2_1`

1. Je crée la classe `MonAccepteur` qui implante `Accepteur`
    * la méthode `accepter(boolean valeur)` doit:
        * toujours retourner vrai

1. Je crée la classe `MonFormateur` qui implante `Formateur`
    * la méthode `formater(boolean valeur)` doit:
        * retourner `C'est vrai!` si la valeur est vraie
        * retourner `C'est faux!` si la valeur est fausse

1. J'implante les méthodes `fournirAccepteur` et `fournirFormateur`

1. J'ajoute une méthode `main` à la classe `MonEntrevue2_1`:

    $[java ./MonEntrevue2_1 9 12]()

1. J'exécute mon projet et je valide mes méthodes

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`
