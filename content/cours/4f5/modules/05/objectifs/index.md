# Objectifs 5: implanter le Modèle de ma page

<center>
<video width="50%" src="presentation.mp4" type="video/mp4" controls>
</center>

<center>
<div style="background-color:orange;width:80%;border:2px dashed black;padding:10px">
<strong>IMPORTANT</strong>
<div style="text-align:left">
<ul>
<li>Je commence à implanter <strong>mon modèle</strong>
<li>Je peux implanter une version simplifiée de mon modèle
    <ul>
        <li>mais <strong>je dois</strong> implanter une liste
        <li>mais <strong>je dois</strong> implanter une valeur personalisée
    </ul>
    
</ul>
</div>
</center>

1. J'effectue le $[link ../tutoriel/](tutoriel) pour comprendre comment
    * créer un modèle
    * créer un dorsal

1. <span style="padding:5px;background-color:orange;border-style:dotted">Je m'assure de migrer vers la version `0.5` de `Ntro`</span>

1. J'implante mon dorsal

1. J'implante mon modèle
    * mon modèle doit contenir <strong>au moins une liste</strong>
    * mon modèle doit contenir <strong>au moins une valeur personalisée</strong>

1. Dans mon dorsal, j'ajoute une tâche pour initialiser mon modèle
    * (pas obligé de mofifier le modèle, c'est ok d'initialiser un modèle vide)

1. Je m'assure que tout fonctionne

1. J'expérimente avec
    * modifier le fichier `.json` de mon modèle

        <pre>   mon_projet/_storage/models/MON_MODELE.json</pre>

    * afficher le graphe d'objets de mon modèle

        <pre>   mon_projet/_storage/graphs/MON_MODELE.png</pre>


1. Je m'assure que je peux ajouter **au moins une valeur personalisée** dans mon fichier `.json`
    * je m'assure que je peux visualiser cette valeur dans le fichier `.png`

1. Je m'assure que mes noms d'attribut/méthode sont adéquats **pour mon projet**
    * on ne veut **pas de** `rendezVousDansOrdre` dans une page paramètres!

1. Je pousse mon projet sur GitHub, p.ex:

        $ git add .
        $ git commit -a -m module05
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
            # Doit générer
            #      _storage/models/MON_MODELE.json
            #      _storage/graphs/MON_MODELE.png


        $ sh gradlew clientEn

            [INFO] Ntro version 0.5

            # Doit afficher ma page directement, en anglais
            # Doit générer
            #      _storage/models/MON_MODELE.json
            #      _storage/graphs/MON_MODELE.png

