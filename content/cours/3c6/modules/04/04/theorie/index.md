# Théorie 4.4: structures Vs base de données

<center>
<video width="50%" src="01.mp4" type="video/mp4" controls>
</center>

* C'est quoi la différence entre *structure* de données et *base* de données?

* Quand on parle de structures de données:
    * il s'agit des données en mémoire durant l'exécution du programme
    * le programmeur choisit en détails comment organiser ces données
    * les données sont directement accessibles en Java
    * on va prévilégier l'efficacité en terme de temps d'exécution
    * la consommation de mémoire est typiquement moins importante
        * (on a souvent relativement peu de données à stoquer en RAM)

* Quand on parle de base de données:
    * il s'agit des données sauvegardées en permanence sur le disque dur
    * c'est un logiciel de base de données qui organise les données sur le disque
    * le programmeur accède aux données via un langage de requêtes comme `SQL`
    * le logiciel de BD essaie de minimiser l'utilisation d'espace disque
        * (on sait que la BD peut contenir énormément de données)

## Efficacité en terme d'espace mémoire

<center>
<video src="02.mp4" width="50%"  type="video/mp4" controls>
</center>

* Jusqu'à maintenant, on a parlé d'efficacité en terme de temps d'exécution

* On peut aussi décrire l'efficacité en terme d'espace mémoire

* Il y a souvent un compromis temps/mémoire à faire:
    * souvent: plus rapide à exécuter == utilise plus de mémoire
    * alors que: utiliser moins de mémoire == plus lent à exécuter

* Pour comprendre pourquoi, imaginer la méthode `trouverDA(String nomEtudiant)`
    * imaginer qu'il faut chercher dans un tableau
    * si je mémorise le résultat de `trouverDA("Bergeron")`, alors:
        * le prochain appel à `trouverDA("Bergeron")` sera très rapide
            * (pas besoin de chercher)
    * mais si je mémorise le résultat pour chaque appel:
        * la consomation en mémoire augmente
        * en plus du tableau, il faut un `Map` avec les résultats mémorisés
        

## `HashMap` vs `TreeMap`

<center>
<video src="03.mp4" width="50%"  type="video/mp4" controls>
</center>

* On a vu que `HashMap` est très efficace en temps
    * par contre `HashMap` n'est pas très efficace en espace mémoire
    * on va voir pourquoi à la $[link ../../../05/03/theorie/](théorie 5.3)


* C'est le contraire pour `TreeMap`:
    * moins efficace en terme de temps d'exécution
    * mais très efficace en terme d'espace mémoire

* Les bases de données utilisent souvent un genre de `TreeMap` pour stoquer les données sur le disque

## Efficacité en terme d'accès au disque dur

<center>
<video src="04.mp4" width="50%"  type="video/mp4" controls>
</center>

* Accéder au disque dur est beaucoup plus lent qu'accéder à la mémoire vive

* En particulier: chercher sur un disque est vraiment très lent

* Ce qu'on veut est calculer d'avance l'emplacement des données
    * et accéder uniquement à l'emplacement désiré

* C'est très important pour les bases de données
    * on a souvent à modifier une valeur dans un fichier
    * on veut pas réécrire le fichier au complet à chaque fois


## Modifier un fichier: naïf Vs efficace

* Pour des petits fichiers, on peut tout réécrire.

* Imaginer par exemple un fichier contenant une liste de `double`

* Pour modifier une valeur à un certain `indice`, on peut faire:

    $[java ./ManipulateurDeFichierNaif]()

    * on lit le fichier au complet et on charge la liste de `double` en mémoire
    * on modifie la valeur
    * on sauvegarde le fichier au complet

* Pour un gros fichier, on veut écrire uniquement à la bonne place

* La classe `RandomAccessFile` permet justement d'accéder à un fichier n'importe où
    * https://docs.oracle.com/javase/7/docs/api/java/io/RandomAccessFile.html

* Il faut d'abord appeler `seek(long offset)` qui va déplacer le curseur de `offset` octets
    * le curseur (ou tête de lecture) correspond à l'emplacement du prochain accès

* On peut ensuite appeler `write(byte[] data)` pour écrire des octets au bon endroit

* Pour l'exemple d'un fichier contenant une liste de `double`, on va pouvoir:
    * calculer, en terme d'octets, l'emplacement qui correspond à un certain `indice`
    * avancer le curseur à cet emplacement
    * écrire uniquement la valeur qu'on veut modifier




