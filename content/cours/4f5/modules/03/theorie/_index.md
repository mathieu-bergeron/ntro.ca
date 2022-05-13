---
title: ""
weight: 1
bookHidden: true
---


# Théorie: les Vues en `Ntro` et JavaFx


## Les fichiers d'une Vue

<center>
<video width="50%" src="fichiers.mp4" type="video/mp4" controls>
</center>

* Il y a trois fichiers à fournir pour créer une vue:

    * un fichier `.xml` au format FXML (obligatoire)
    * un fichier `.css` (optionnel)
    * un fichier `.properties` qui contient des traductions (optionnel)

* Le format FXML est spécifique à JavaFx
    * en FXML, on peut décrire la vue avec des balises, un peu comme en HTML
    * p.ex. pour ajouter un bouton: `<Button>  </Button>`

* Le `.css` permet de modifier l'apparence des éléments affichés (comme en HTML)

* Le fichier `.properties` contient du texte à afficher
    * des fichiers `.properties` additionnels permettent de supporter d'autres langues

## Exemples de fichiers FXML

<center>
<video width="50%" src="exemples_fxml.mp4" type="video/mp4" controls>
</center>

```xml
{{% embed src="./racine01.xml" %}}
```

* La première ligne est obligatoire

    ```xml
    {{% embed 
        src="./racine01.xml" 
        indent="1" 
        first-line="1" 
        last-line="1" 
        %}}
    ```

* Ensuite, il faut importer chaque balise qu'on utilise

    ```xml
    {{% embed 
        src="./racine01.xml" 
        indent="1" 
        first-line="3" 
        last-line="3" 
        %}}
    ```

    * (comme si on importait une classe)

* La première balise doit avoir les attributs

    1. `xmlns:fx`

        ```xml
        {{% embed 
            src="./racine01.xml" 
            indent="2" 
            first-line="5" 
            last-line="5" 
            %}}
        ```

        * (c'est comme ça qu'on indique qu'il s'agit de FXML)

    2. `fx:controller`

        ```xml
        {{% embed 
            src="./racine01.xml" 
            indent="2" 
            first-line="6" 
            last-line="6" 
            %}}
        ```

        * où on déclare la classe Java de la Vue
        * (ce que JavaFx nomme `controller`, `Ntro` appelle plutôt la Vue)


* Autre exemple:

```xml
{{% embed 
    src="./file_attente01.xml" 
    %}}
```

* On voit que dans la balise racine `VBox`, y a une balise `Button`

* En fait, on doit tout mettre dans la balise racine

* (ou dans une balise qui est dans la balise racine)

* (ou dans une balise qui est dans une balise qui est dans la balise racine)

* (etc.)



## Structure d'une Vue en FXML

<center>
<video width="50%" src="structure_fxml.mp4" type="video/mp4" controls>
</center>

* Chaque balise correspond à un noeud (un élément graphique)

* Certains noeuds sont des éléments simple (p.ex. un Bouton) 

* D'autres noeuds sont des conteneurs 
    * un conteneur est une région rectangulaire qui contient des noeuds


* Le conteneur est le parent et les noeuds contenus sont les enfants du conteneur
    * un enfant est soit un élément ou un autre conteneur

    <center>
        <img width="50%" src="conteneur_et_element.png"/>
    </center>


* Chaque conteneur est responsable de:
    * placer chaque enfants dans l'espace
    * calculer la taille de chaque enfant
        * (en fonction p.ex. de propriétés comme `-fx-min-width` et `-fx-max-width`)

## Exemples de conteneurs JavaFx

<center>
<video width="50%" src="exemples_conteneurs.mp4" type="video/mp4" controls>
</center>

* <a href="https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/StackPane.html"><code>StackPane</code></a>
    * affiche un seul enfant et lui donne toute l'espace

    <center>
        <img width="50%" src="StackPane.png"/>
    </center>

    * NOTES:
        * en fait le `StackPane` affiche un avant-plan et un ou des arrières plans
        * on va l'utiliser uniquement pour l'avant-plan (un seul enfant)

* <a href="https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/VBox.html"><code>VBox</code></a>
    * place ses enfants du haut vers le bas, verticalement

    <center>
        <img width="50%" src="VBox.png"/>
    </center>

* Il y a en plein d'autre
    * voir la liste des sous-classes de <a href="https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/Pane.html"><code>Pane</code></a>
    

## Quelles sont les balises valides?

<center>
<video width="50%" src="balises.mp4" type="video/mp4" controls>
</center>

* Chaque classe graphique JavaFx est une balise
    * P.ex. la classe <a href="https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Button.html"><code>Button</code></a> du paquet `javafx.scene.control`
    * (et plusieurs autres classes du paquet `javafx.scene`)

* On peut créer une balise personalisée en héritant d'une classe graphique
    * P.ex. `class MonBouton extends Button` va créer la balise `<MonBouton>`




* Une bonne façon d'explorer le FXML est d'utiliser l'outil <a href="https://gluonhq.com/products/scene-builder/"><i>SceneBuilder</i></a>
    * C'est un outil graphique pour créer des Vues en FXML
    * L'outil sauvegarde en `.xml`
    * On peut alors inspecter les balises utilisées

* **ATTENTION**
    * l'outil *SceneBuilder* a aussi tendance à générer du `.xml` touffu
    * SVP ne pas utiliser ce `.xml` directement dans votre projet






## Le CSS en JavaFx

<center>
<video width="50%" src="css.mp4" type="video/mp4" controls>
</center>

* Comme pour HTML, le CSS de JavaFx a les notions de
    * sélecteur, p.ex: `#id` et `.class`
    * propriétés, p.ex. `-fx-backgroundcolor:gray`

* **ATTENTION**
    * Les propriétés CSS ne sont pas les mêmes qu'en HTML
        * En JavaFx, les propriétés commencent par `-fx-`
        * Voici le guide complet du CSS en JavaFX
            * https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html 

* Pour utiliser le CSS, il faut ajouter des attributs aux balises
    * `id` pour l'identifiant CSS
    * `styleClass` pour spécifier la class CSS (et non `class`)

* Par exemple

    ```xml
{{% embed 
    src="./file_attente02.xml" 
    indent="1" 
    first-line="1"
    last-line="15"
    %}}
    ```
        

* Finalement, il faut déclarer votre CSS dans le Frontal

```java
{{% embed src="./FrontalPong04.java" %}}
```




## Les traductions en JavaFx

<center>
<video width="50%" src="traductions.mp4" type="video/mp4" controls>
</center>

* Un fichier `.properties` contient des paires variable/valeur de la forme

    ```ini
    ouvrirPartie=Ouvrir une partie
    retour=Retour au menu principal
    ```

    * NOTES:
        * la variable est avant le `=` (p.ex. `ouvrirPartie` et `retour`)
        * la valeur est après le `=` (sans `"`)

* On peut utiliser ce texte en FXML avec `%variable`

    $[xml ./file_attente03]()

* Il faut déclarer des fichier `.properties` dans le Frontal:

    $[java ./FrontalPong03]()


## Déclarer des Vues en Ntro

<center>
<video width="50%" src="declarer_vue.mp4" type="video/mp4" controls>
</center>

* Créer d'abord une classe qui hérite de `ViewFx`

    $[java ./VueRacine01]()

    * NOTES: 
        * la méthode `initialize` est requise par JavaFx
        * on va l'utiliser dans le module 4

* Déclarer la Vue dans le Frontal

    $[java ./FrontalPong01]()

* S'assurer que l'attribut `fx:controller` est correct:

    $[xml ./racine01 6 6]()

    * doit être le nom complet de la classe, comme dans un `import`

        $[java ./FrontalPong01 1 1]()


* (Optionnel) on peut aussi déclarer un fichier CSS

    $[java ./FrontalPong02 4 4]()

* (Optionnel) on peut aussi déclarer des traductions

    $[java ./FrontalPong02 1 2]()




## Charger une Vue avec une tâche `viewLoader(...)`

<center>
<video width="50%" src="charger_vue.mp4" type="video/mp4" controls>
</center>

* S'assurer d'enregistrer la Vue dans le Frontal

    $[java ./FrontalPong01 8 8]()

* Une fois la vue enregistrée, `Ntro` va créer la tâche

    * `viewLoader(VueRacine.class)`

* Ensuite, on peut utiliser la tâche dans le graphe de tâches


## Créer une Vue avec une tâche `create(...)`

<center>
<video width="50%" src="creer_vue.mp4" type="video/mp4" controls>
</center>

* On a besoin d'un objet `ViewLoader<VueRacine>` pour créer la Vue

* On ajoute une dépendance à une tâche `viewLoader(VueRacine.class)`


    $[java ./Initialisation01]()

    <center>
        <img width="350px" src="create.png"/>
    </center>

    * NOTES:
        * une tâche de type `create(...)` retourne un résultat
        * comme la tâche est de type `create(VueRacine.class)`, il faut retourner un objet de type `VueRacine`

## Afficher la Vue racine en Ntro

<center>
<video width="50%" src="installer_vue_racine.mp4" type="video/mp4" controls>
</center>

* La Vue racine s'affiche à même la fenêtre

* On ajoute une dépendance à la tâche `window()`

    $[java ./Initialisation02]()

    <center>
        <img width="100%" src="frontend01.png"/>
    </center>

## Afficher une page en Ntro

<center>
<video width="50%" src="installer_vue_file_attente.mp4" type="video/mp4" controls>
</center>

* Une page (ou sous-vue) va s'afficher à l'intérieur de la `VueRacine`

* Dans la `VueRacine`, on a besoin d'une méthode qui installe une sous-vue

    $[java ./VueRacine02]()

    * NOTES: 
        * `rootNode()` retourne la conteneur racine (ou balise racine) de la vue
        * notre `VueRacine` place la sous-vue directement à la racine


* Ensuite, on a une tâche pour afficher la page

    $[java ./Initialisation03]()

<center>
    <img width="100%" src="frontend02.png"/>
</center>

