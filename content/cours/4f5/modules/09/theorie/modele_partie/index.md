# Théorie: sauvegarder dans un modèle


## Pourquoi sauvegarder un monde 2d dans un modèle?

<center>
<video width="50%" src="pourquoi.mp4" type="video/mp4" controls>
</center>

1. Pour sauvegarder l'état de la partie

1. Pour synchroniser le monde 2d de plusieurs clients
    * (en mode client/serveur)


## Quand sauvegarder un monde 2d dans un modèle?

<center>
<video width="50%" src="quand.mp4" type="video/mp4" controls>
</center>

1. Pas 60 fois par secondes!

1. Possibilité: à chaque action usager
    * en client/serveur: il faut propager les actions aux autres joueurs
    * (note: c'est la seule version supporté par `Ntro` pour l'instant)

1. Possibilité: à chaque seconde
    * alors il faut utiliser des messages pour propager les actions joueurs

1. En réalité: ça dépend du jeu 
    * selon la quantité d'information à synchroniser, si le jeu est très temps-réel, etc.
    * il faut aussi penser à limiter la triche
