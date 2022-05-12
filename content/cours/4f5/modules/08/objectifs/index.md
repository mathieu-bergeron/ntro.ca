---
title: ""
weight: 1
bookHidden: true
---


# Objectifs 8: améliorer votre Vue

<center>
<video width="50%" src="presentation.mp4" type="video/mp4" controls>
</center>
<ul>
<li> ERRATUM: c'est maitenant optionnel d'ajouter un contrôle personnalisé
</ul>

<br>
<br>


<center>
<div style="background-color:orange;width:80%;border:2px dashed black;padding:10px">
<strong>IMPORTANT</strong>
<div style="text-align:left">
<ul>
<li>Je dois créer un fragment pour afficher ma valeur personnalisée
<li>Je dois améliorer ma vue avec au moins
    <ul>
        <li>un conteneur pour ajouter des fragments 
        <li>2 éléments graphiques avec des tailles élastiques
    </ul>
<li>Je dois maintenant afficher mon modèle de façon graphique
</ul>

</div>
</center>

1. J'effectue le $[link ../tutoriel/](tutoriel) pour comprendre comment
    * afficher une valeur personnalisée avec un fragment
    * utiliser des tailles élastiques

1. <span style="padding:5px;background-color:orange;border-style:dotted">Je m'assure de migrer vers la version `0.8` de `Ntro`</span>

1. Sur ma Vue, j'ajoute un conteneur où insérer mes fragements

1. Je crée un fragment pour afficher ma valeur personnalisée

1. J'implante l'affichage des valeurs via le fragment

1. J'utilise des tailles élastiques pour au moins 2 éléments graphiques

1. Je m'assure que tout fonctionne
    * je peux ajouter plusieurs valeurs personnalisées
    * ces valeurs s'affichent avec des fragements

1. Je m'assure que mes noms d'attribut/méthode sont adéquats **pour mon projet**
    * on ne veut **pas de** `FragmentRendezVous` dans une page paramètres!

1. Je pousse mon projet sur GitHub, p.ex:

        $ git add .
        $ git commit -a -m module08
        $ git push 

1. Je vérifie que mes fichiers sont sur GitHub

1. Je vérifie que projet est fonctionnel avec un `$ git clone` neuf, p.ex:

        $ mkdir ~/tmp

        $ cd ~/tmp

        $ git clone git@github.com:USAGER/DEPOT

        $ cd DEPOT

        $ cd mon_projet

        $ sh gradlew clientFr

            [INFO] Ntro version 0.8

            # Doit afficher ma page directement, en français
            # Doit permettre d'ajouter quelque chose au modèle
            # Doit afficher les valeurs avec des fragments
            # Chaque ajout demandé par l'usager doit s'afficher


        $ sh gradlew clientEn

            [INFO] Ntro version 0.8

            # Doit afficher ma page directement, en anglais
            # Doit permettre d'ajouter quelque chose au modèle
            # Doit afficher les valeurs avec des fragments
            # Chaque ajout demandé par l'usager doit s'afficher
