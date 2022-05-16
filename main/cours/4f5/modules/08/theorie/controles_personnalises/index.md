---
title: ""
weight: 1
bookHidden: true
---


# JavaFX: contrôle graphique personnalisé

## En Java

<center>
<video width="50%" src="java.mp4" type="video/mp4" controls>
</center>

1. Créer une classe qui hérite d'un composant graphique

$[java ./vues05a 1 7]()


1. Ajouter des attributs nommés au constructeur:

$[java ./vues05a 9 12]()


## En FXML

<center>
<video width="50%" src="fxml.mp4" type="video/mp4" controls>
</center>

1. Importer la balise:

$[xml ./vues05a 1 1]()


1. Utiliser la balise comme les autres:

$[xml ./vues05a 3 6]()


1. Utiliser les attributs nommés:

$[xml ./vues05a 8 13]()


## Exemples du tutoriel 07

<center>
<video width="50%" src="flexbox.mp4" type="video/mp4" controls>
</center>

1. On définit un `FlexBoxRendezVous` 

    <video width="100%" src="tut07_flexbox.mp4" type="video/mp4" loop nocontrols autoplay>

    * NOTES:
        * JavaFx ne fournit pas de conteneur de type FlexBox
        * L'implantation de `Ntro` est simple:
            * on commence dans un `HBox` 
            * quand l'espace horizontal manque, on bascule en mode `VBox`
            * l'attribut `gap` indique l'espace horizontal on aimerait avoir

1. Voici comment utiliser notre `FlexBoxRendezVous`

    $[xml ./exemple_flexbox]()

<center>
<video width="50%" src="canvas.mp4" type="video/mp4" controls>
</center>

1. On définit un `CanvasPartie`

    <video width="100%" src="tut07_canvas.mp4" type="video/mp4" loop nocontrols autoplay>

    * NOTES:
        * Le Canvas de JavaFx est de taille fixe par défaut
        * L'implantation de `Ntro` est simple
            * on place le Canvas dans un Conteneur
            * on place un capteur (*listener*) sur la taille de ce Conteneur
            * quand le Conteneur change de taille, on ajuste aussi la taille du Canvas

1. Voici comment utiliser notre `CanvasPartie`

    $[xml ./exemple_canvas]()

    * NOTES:
        * l'attribut `epsilon` contrôle quand redimensionner
            * p.ex. `epsilon=2` voudrait dire 
                * redimensionner quand la fenêtre a grossi d'au moins 2 pixels
        * peut permettre d'éviter un effet tremblement si on redimensionne trop souvent




