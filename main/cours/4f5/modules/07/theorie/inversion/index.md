---
title: ""
weight: 1
bookHidden: true
---


# Théorie: inversion des dépendances

<center>
<video width="50%" src="presentation.mp4" type="video/mp4" controls>
</center>

## Version intuitive

<center>
<video width="50%" src="intuitive.mp4" type="video/mp4" controls>
</center>

1. Intuitivement, on dirait

    * Je demande à la Vue d'afficher le Modèle

    $[java ./Intuitif]()




1. La version intuitive mène à du code où on utilise les accesseurs *get*

    $[java ./VueIntuitive]()


1. La Vue doit connaître les détails du modèle pour l'afficher
    * la vue doit savoir qu'il faut transformer `numeroPartie` en chaîne
    * si le modèle change, il faut réécrire la Vue

## Version inversée

<center>
<video width="50%" src="inversee.mp4" type="video/mp4" controls>
</center>


1. La version inversée est

    * Je demande au modèle de s'afficher sur la Vue

    $[java ./Inverse]()


1. La version inversée mène habituellement à du code plus propre

1. En inversée, la Vue et le Modele sont plus indépendants

    $[java ./ModeleInverse]()


1. C'est le modèle qui transforme le `numeroPartie` en chaîne
    * si on représente le `numeroPartie` différemment, pas besion de modifier la vue


## Intuitif ou inversé?

<center>
<video width="50%" src="inverser_ou_non.mp4" type="video/mp4" controls>
</center>

1. Si on est en train d'écrire plein de *get*, il faut s'arrêter
    * peut-on inverser la dépendance? Est-ce que c'est plus propre?


1. Dans le doute, faire comme vous préférez
    * l'inversion des dépendances n'est pas un objectif du cours
