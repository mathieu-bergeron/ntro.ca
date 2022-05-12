# Examen 4

<div style="padding:5px;background:orange;border-style:dotted" >
<strong>IMPORTANT</strong>: l'outil de validation est partiel pour l'examen. Tout vert <code>!=</code> 100%
<div>
<ul>
<li>CONSEIL: bien lire les énoncés. Réutiliser les méthodes existantes.
<ul>
<li>Le méthodes à coder ne sont <strong>pas</strong> longues
</ul>
</ul>
<ul>
<li>CONSEIL: ne <strong>pas</strong> perdre de temps à avoir tout vert
<ul>
<li>S'assurer plutôt que votre code est correct <i>selon vous</i>
</div>
</div>

## 10pts) Créer le projet

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `examen4`
        * chemin du projet: `~/3c6_PRENOM_NOM/examen4`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./examen4_gr1.jar](examen4_gr1.jar)
        * le projet utilise la base de données $[download ./examen4Gr1.db](examen4Gr1.db)

1. Je change l'encodage à **UTF-8**:
    * Clique-droit sur le projet => Properties
    * Je clique sur Resource
    * Je sélectionne *Text File Encoding* => *Other* => *UTF-8*
    * J'applique avec **Apply and Close**

1. La librairie `examen4_gr1.jar` contient, entre autres:
    * la classe `Examen4Gr1`
    * la classe `NoeudJson`
    * la classe `ChargeurJsonBD`
    * la classe `ChargeurJsonNoeud`
    * la classe `MaListeJson`
    * la classe `MonObjetJson`
    * la classe `ValeurJson`
    * l'interface `TesteurDeSet`
    * l'interface `ModificateurDeFichier`

1. Je crée la classe `MonExamen4` qui hérite de la classe `Examen4Gr1`

1. J'implante les méthodes pour remplir le contrat de `Examen4Gr1`

## 30pts) Implanter `NoeudJson`

1. On veut ajouter `NoeudJson` à nos valeurs Json

1. Voici des `NoeudJson`

    * `<1~2^3>`
    * `<1~"b"^3>`
    * `<"a"~4^3>`

1. Voici des `NoeudJson` à l'intérieur d'autres structures Json

    * `[ 1 , <4~"a"^5> , 3 ]`
    * `{ "c" : 3 , "d" : <4~4^5> }`


1. Voici un `NoeudJson` à l'intérieur d'un autre `NoeudJson`

    * `< "a" ~ <3~4^null> ^ 3 >`

1. Pour implanter un `NoeudJson`, je crée et complète la classe suivante


    $[java ./MonNoeudJson]()


    * NOTE: il y a trois `ValeurJson` à l'intérieur d'un `NoeudJson`
        * pas besoin de boucle dans le code ci-haut

    * NOTE: la librairie contient déjà `NoeudJava`

        $[java ./NoeudJava]()


## 20pts) Implanter `MaListeJsonBD`

1. On veut améliorer notre `ValeurJson` pour faciliter la sauvegarde dans un fichier

1. La librairie ajoute déjà la méthode `ValeurJson.nombreDeCaracteres()`
    * retourne la taille d'une valeur Json lorsque sauvegardée dans un fichier

1. Pour une liste Json, on ajoute aussi la méthode `nombreDeCaracteresAvant(indice)`
    * retourne le nombre de caracteres avant la valeur à l'`indice`
    * retourn `0` si l'indice n'est pas valide

1. Par exemple:
    * Si la liste est `[-2.4,null,true,"asdf",""]` et l'indice est `1`
        * retourne `6`, le nombre de caractères avant `null` (la valeur à l'indice `1`)

    * Si la liste est `[-2.4,null,true,"asdf",""]` et l'indice est `2`
        * retourne `11`, le nombre de caractères avant `true` (la valeur à l'indice `2`)

    * Si la liste est `[5.0,[5.0,3.0],5.0]` et l'indice est `-1`
        * retourne `0`, car l'indice `-1` n'est pas valide

    * Si la liste est `[5.0,[5.0,3.0],5.0]` et l'indice est `3`
        * retourne `0`, car l'indice `3` n'est pas valide

    * Si la liste est `[5.0,[5.0,3.0],5.0]` et l'indice est `0`
        * retourne `1`, le nombre de caractères avant le premier `5.0` (la valeur à l'indice `0`)

1. Je crée et complète la classe suivante

    $[java ./MaListeJsonBD]()

## 20pts) Implanter `MonModificateurDeFichier`

1. On ajoute la méthode `nombreDeCaracteresAvantValeurDe(String cle)` à `ObjetJson`
    * retourne la taille  *avant la valeur* correspondant à `cle`
    * par exemple
        * Pour l'objet `{"cle01":12.0,"cle02":20.0,"cle03":12.0}"` et la clé `cle01`
            * retourne `9`, le nombre de caractères avant la valeur `12.0`

        * Pour l'objet `{"cle01":12.0,"cle02":20.0,"cle03":12.0}"` et la clé `cle02`
            * retourne `22`, le nombre de caractères avant la valeur `20.0`


1. On veut implanter un `ModificateurDeFichier` qui écrit un `ObjetJson` efficacement

    $[java ./ModificateurDeFichier]()

    * `objetDejaEcrit` est un `ObjetJson` déjà écrit dans le fichier à modifier
    * `cle` est là où il faut modifier le fichier
    * `nouvelleValeur` est la valeur à écrire

1. La méthode `modifierObjet` doit avoir le comportement suivant:
    * Si la `cle` n'existe pas dans `objetDejaEcrit`
        * écrire tout le fichier 
            * (incluant la nouvelle valeur)

    * Si la `cle` existe dans `objetDejaEcrit`
        * Si la valeur écrite dans le fichier a la même taille que la nouvelle valeur
            * écrire uniquement la nouvelle valeur
                * (au bon endroit)
        * Sinon
            * écrire la nouvelle valeur et tout le reste de l'objet 
                * (mais pas le début de l'objet déjà écrit)

1. Pour spécifier ce qu'il faut écrire dans le fichier, on retourne un objet `EcrireDansFichier`

    $[java ./EcrireDansFichier]()

    * `décalage` est le nombre de caractères à passer avant d'écrire
    * `contenu` est la chaîne qu'il faut écrire


1. Par exemple:

    * Pour l'objet `{"cle01":12.0,"cle02":20.0,"cle03":12.0}"`, la `cle01` et la valeur `11.0`
        * retourne `new EcrireDansFichier(9,"11.0")`
        * (il faut *passer* `9` caractères, puis écrire `11.0`)

    * Pour l'objet `{"cle01":12.0,"cle02":20.0,"cle03":12.0}"`, la `cle01` et la valeur `\"nouveau\"`
        * retourne `new EcrireDansFichier(22,"\"nouveau\",\"cle03\":12.0}")`
        * (il faut *passer* `22` caractères, puis écrire la valeur et le reste de l'objet `"nouveau","cle03":12.0}`)

    * Pour l'objet `{"cle01":12.0,"cle02":20.0,"cle03":12.0}"`, la `cle00` et la valeur `\"nouveau\"`
        * retourne `new EcrireDansFichier(0, {\"cle00\":\"nouveau\",\"cle01\":12.0,\"cle02\":20.0,\"cle03\":12.0})`
        * (il faut *passer* `0` caractères, et écrire tout l'objet `{"cle00":"nouveau","cle01":12.0,"cle02":20.0,"cle03":12.0}`)

    
1. Je crée la classe `MonModificateurDeFichier` qui implante `ModificateurDeFichier`

    $[java ./MonModificateurDeFichier]()



## 20pts) Implanter deux `TesteurDeSet`

1. On veut tester l'efficacité de deux implantations de l'interface `Set` 
    * Un `Set` est un ensemble
    * Contient une liste de valeurs sans doublons
    * Les valeurs ne sont pas nécessairement contenues dans l'ordre

1. Je crée la classe `TesteurDeSetAbstrait` qui implante l'interface `TesteurDeSet`
    * j'implante les méthodes:
        * `valeurs` 
            * retourne une liste contenant les valeurs d'un `Set`
        * `ajouterPlusieursFoisMemesValeurs`
            * pour `nombreOperations` fois:
                * ajouter plusieurs `valeurs` dans le `Set`
        * `ajouterPuisRetirerValeursPlusieursFois`
            * pour `nombreOperations` fois:
                * ajouter plusieurs `valeurs` dans le `Set`
                * retirer ces `valeurs` tout de suite après les avoir toutes ajoutées


1. Je crée la classe `TesteurDeSetVersionUn` qui hérite de `TesteurDeSetAbstrait`
    * j'implante les méthodes:
        * `nouveauSet`
            * retourne un nouveau `HashSet`
        * `accederValeursDansOrdre`
            * j'utilise `Collections.sort()` pour trier les valeurs
            * je fais ensuite une boucle pour accéder à chaque valeur

    **NOTE**: pour accéder, faire p.ex. `String x = cle;` pour chaque clé

1. Je crée la classe `TesteurDeSetVersionDeux` qui hérite de `TesteurDeSetAbstrait`
    * j'implante les méthodes:
        * `nouveauSet`
            * retourne un nouveau `TreeSet`
        * `accederValeursDansOrdre`
            * les valeurs sont déjà triées
            * je fais une boucle pour accéder à chaque valeur

    **NOTE**: pour accéder, faire p.ex. `String x = cle;` pour chaque clé

## Finaliser

1. J'ajoute une méthode `main` à la classe `MonExamen4`:

    $[java ./MonExamen4 3 6]()

1. Je m'assure de fournir les objets:

    $[java ./MonExamen4 8 31]()

1. J'exécute mon projet et je m'assure qu'il n'y pas de plantage

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`


## Remise

1. Je pousse un commit avec **exactement** le commentaire `examen4`, p.ex:

        $ git add .
        $ git commit -a --allow-empty -m"examen4"
        $ git push

1. Comme redondance, je fais un `.zip` de mon projet et je le remets sur Moodle

<!--

1. Je peux faire l'entrevue avant la date limite en créant un billet `entrevue 2.2`
    * Le prof va prioriser les questions, je devrai peut-être faire preuve de patience

1. Sinon, le prof va me contacter avec un rendez-vous avant la date limite

-->
