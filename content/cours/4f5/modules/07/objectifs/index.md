# Objectifs 7: implanter une fonctionnalité

<!--

<center>
<video width="50%" src="presentation.mp4" type="video/mp4" controls>
</center>

-->

<center>
<div style="background-color:orange;width:80%;border:2px dashed black;padding:10px">
<strong>IMPORTANT</strong>
<div style="text-align:left">
<ul>
<li>Je commence à implanter <strong>ma fonctionnalité</strong>
<li>Je peux implanter une version simplifiée de ma fonctionnalité
    <ul>
        <li>mais <strong>je dois</strong> ajouter quelque chose à ma liste
    </ul>
    
</ul>
</div>
</center>

1. J'effectue le $[link ../tutoriel/](tutoriel) pour comprendre comment
    * envoyer un message au dorsal
    * recevoir le message dans le dorsal et modifier le modèle 
    * observer et afficher le modèle dans le frontal

1. Sur ma Vue, j'ajoute un bouton correspondant à une fonctionnalité
    * cette fonctionnalité doit <strong>ajouter quelque chose à ma liste</strong>
    * (je peux générer des données au hasard comme dans le tutoriel)
    * (je pourrais aussi lire des données d'un fichier ou d'un tableau)

1. J'implante un message correspondant à ma fonctionnalité

1. Dans mon dorsal, je reçoit le message et je modifie le modèle

1. Dans mon frontal, j'observe le modèle et je l'affiche

1. Je m'assure que tout fonctionne
    * les données **doivent s'ajouter** au fichier `.json` de votre modèle
    * l'ajout au modèle doit s'afficher à chaque fois qu'on appuie sur le bouton

1. Je m'assure que mes noms d'attribut/méthode sont adéquats **pour mon projet**
    * on ne veut **pas de** `MsgAjouterRendezVous` dans une page paramètres!

1. Je pousse mon projet sur GitHub, p.ex:

        $ git add .
        $ git commit -a -m module07
        $ git push 

1. Je vérifie que mes fichiers sont sur GitHub

1. Je vérifie que projet est fonctionnel avec un `$ git clone` neuf, p.ex:

        $ mkdir ~/tmp

        $ cd ~/tmp

        $ git clone git@github.com:USAGER/DEPOT

        $ cd DEPOT

        $ cd mon_projet

        $ sh gradlew clientFr

            [INFO] Ntro version 0.5

            # Doit afficher ma page directement, en français
            # Doit permettre d'ajouter quelque chose au modèle
            # Doit afficher le modèle en mode texte
            # Chaque ajout demandé par l'usager doit s'afficher


        $ sh gradlew clientEn

            [INFO] Ntro version 0.5

            # Doit afficher ma page directement, en anglais
            # Doit permettre d'ajouter quelque chose au modèle
            # Doit afficher le modèle en mode texte
            # Chaque ajout demandé par l'usager doit s'afficher
