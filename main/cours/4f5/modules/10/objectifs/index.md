---
title: ""
weight: 1
bookHidden: true
---


# Objectifs 10: version client/serveur

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
<li>Je dois pouvoir ajouter des informations à ma vue personnalisée
<ul>
    <li>dans un premier client, et le deuxième client l'affiche aussi
    <li>dans le deuxième client, et le premier l'affiche aussi
</ul>
</ul>

</div>
</center>

1. J'effectue le $[link ../tutoriel/](tutoriel) pour comprendre comment

    * transformer mon application en mode client/serveur

1. <span style="padding:5px;background-color:orange;border-style:dotted">Je m'assure de migrer vers la version `1.0` de `Ntro`</span>

1. Je m'assure que mes noms d'attribut/méthode sont adéquats **pour mon projet**
    * on ne veut **pas de** `ServeurPong` dans un jeu de dames!

1. Je pousse mon projet sur GitHub, p.ex:

        $ git add .
        $ git commit -a -m module10
        $ git push 

1. Je vérifie que mes fichiers sont sur GitHub

1. Je vérifie que projet est fonctionnel avec un `$ git clone` neuf, p.ex:

        $ mkdir ~/tmp

        $ cd ~/tmp

        $ git clone git@github.com:USAGER/DEPOT

        $ cd DEPOT

        $ cd mon_projet

        $ sh gradlew serveur

        # Dans un deuxième GitBash
        $ sh gradlew client

        # Dans un troisième GitBash
        $ sh gradlew client

            # Doit afficher deux clients 
            # Doit afficher ma vue personnalisée
            # Les deux clients doivent afficher la même information
            # Je dois pouvoir ajouter une information dans un client 
            #    de sorte qu'elle est propagée dans l'autre
              
                
