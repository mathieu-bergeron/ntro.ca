# Théorie: données de la Vue

## Où mémoriser les données de la Vue?

<center>
<video width="50%" src="donnees_vue.mp4" type="video/mp4" controls>
</center>

### Cas le plus courant

* Les données sont mémorisées directement dans les éléments graphiques
    * p.ex. un bouton mémorise le texte à afficher

* Le modèle peut s'afficher directement sur la Vue

* Les données sont préservées même si la Vue change un peu, p.ex.
    * si on change de page
    * si on défile avec une barre de défilement

### Le cas du Canvas

* Un canvas mémorise uniquement son état courant (l'image affichée)

* Le canvas ne mémorise pas les étapes du dessin
    * p.ex. ne mémorise pas chaque rectangle qu'on a dessiné

* Si on veut modifier un peu le canvas, il faut le redessiner
    * p.ex. si on veut déplacer un rectangle, il faut le redessiner

* Il faut alors mémoriser soi-même les objets de la Vue
    * p.ex. mémoriser chaque rectangle (sa position, sa taille)

## Notion de `ViewData` 

<center>
<video width="50%" src="view_data.mp4" type="video/mp4" controls>
</center>

* Un `ViewData` est un objet qui mémorise les données de la Vue

* Le `ViewData` est spécifique à la Vue

* Utile quand la Vue est mal équipée pour mémoriser ces données
    * (comme dans le cas du canvas)

* Aussi utile pour transformer les données du modèle avant de les afficher
    * plusieurs `ViewData` pour faire différentes transformations
    * p.ex. pour afficher le même modèle de différentes façons

* Le `ViewData` traite des données à afficher, mais pas à sauvegarder, p.ex.
    * calculer et afficher le FPS (images par seconde)
    * les données d'un jeu (on veut pas sauvegarder le jeu 60 fois par seconde)

## Un cousin du MVC: le MVVM

<center>
<video width="50%" src="mvvm.mp4" type="video/mp4" controls>
</center>


* Le `ViewData` (appelé alors `ViewModel`) est au coeur de certaines méthodologies

* On parle alors de MVVM (Model-View-ViewModel) plutôt que MVC

* Voir p.ex. https://fr.wikipedia.org/wiki/Mod%C3%A8le-vue-vue_mod%C3%A8le
