---
title: ""
weight: 1
bookHidden: true
---


# Objectifs 9: créer une `VuePartie` simple

<center>
<video width="50%" src="presentation.mp4" type="video/mp4" controls>
</center>

<br>
<br>


<center>
<div style="background-color:orange;width:80%;border:2px dashed black;padding:10px">
<strong>IMPORTANT</strong>
<div style="text-align:left">
<ul>
<li>Je dois avoir <strong>deux vues</strong>
<ul>
    <li>ma vue personnalisée
    <li>une <strong>autre vue</strong> (p.ex. </code>VueFileAttente</code>)
</ul>
<li>Je transforme cette <strong>autre vue</strong> en <code>VuePartie</code>
<li>(OPTIONNEL) Ajouter plutôt la <code>VuePartie</code> en tant que 3ième vue
</ul>

</div>
</center>

1. J'effectue le $[link ../tutoriel/](tutoriel) pour comprendre comment
    * créer des données de Vue (`ViewData`)
    * créer et afficher un monde 2d
    * réagir au temps qui passe (animer le monde 2d)

1. <span style="padding:5px;background-color:orange;border-style:dotted">Je m'assure de migrer vers la version `0.9` de `Ntro`</span>

1. Je renomme mon **autre vue** à `VuePartie`
    * (OPTIONNEL) j'ajoute plutôt une `VuePartie` comme une 3ième vue
    * (je m'assure de pouvoir naviguer vers cette nouvelle `VuePartie`)

1. Je modifie mon graphe de tâches pour créer la `VuePartie` dès l'`Initialisation`
    * (plutôt que dans `Navigation`)

1. Je crée un `CanvasPartie` qui hérite de `World2dCanvas`

1. Sur ma `VuePartie`, j'ajoute un `CanvasPartie`

1. Je crée mon propre monde 2d (une classe qui hérite de `World2dFx`)

1. Je crée mon propre objet 2d (une classe qui hérite de `Object2dFx`)

1. Je crée mon propre `ViewData` (p.ex. `DonneesVuePartie`)

1. J'ajoute le groupe de tâches `AfficherPartie` et des tâches pour:
    * créer une instance de mon `ViewData`
    * réagir au temps qui passe avec un `waitsFor(clock().nextTick())`

1. J'affiche au moins un objet 2d **en mouvement**

1. (OPTIONNEL) commencer à implanter le jeu
    * créer un `ModelePartie`
    * réagir aux actions du joueur
    * réagir aux événements de la souris
    * ajouter des effets
    * etc.

1. Je m'assure que mes noms d'attribut/méthode sont adéquats **pour mon projet**
    * on ne veut **pas de** `MondePong2d` dans un jeu d'échecs!

1. Je pousse mon projet sur GitHub, p.ex:

        $ git add .
        $ git commit -a -m module09
        $ git push 

1. Je vérifie que mes fichiers sont sur GitHub

1. Je vérifie que projet est fonctionnel avec un `$ git clone` neuf, p.ex:

        $ mkdir ~/tmp

        $ cd ~/tmp

        $ git clone git@github.com:USAGER/DEPOT

        $ cd DEPOT

        $ cd mon_projet

        $ sh gradlew clientFr

            [INFO] Ntro version 0.9

            # Doit afficher ma page directement, en français
            # Doit permettre de naviguer vers une page partie
            # Doit afficher un objet 2d en mouvement 


        $ sh gradlew clientEn

            [INFO] Ntro version 0.9

            # Doit afficher ma page directement, en anglais
            # Doit permettre de naviguer vers une page partie
            # Doit afficher un objet 2d en mouvement 
