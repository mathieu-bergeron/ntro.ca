---
title: ""
weight: 1
bookHidden: true
---


# JavaFX: animation par image clé (*keyframe*)

## Animation par image clé

1. On donne des valeurs à des points précis dans le temps
1. Les valeurs intermédiaires sont calculés par l'animation
1. Conceptuellement on  donne:

        Au temps 0: opacité est 1.0
        Au temps 10: opacité est 0.5
        Au temps 20: opacité est 1.0

1. Le système va générer:

        Au temps 0: opacité est 1.0
        Au temps 1: opacité est 0.95
        Au temps 2: opacité est 0.90
        Au temps 3: opacité est 0.85
        ...
        Au temps 10: opacité est 0.5
        Au temps 11: opacité est 0.55
        Au temps 12: opacité est 0.6
        ...
        Au temps 20: opacité est 1.0

## Créer l'animation

1. Créer l'animation

$[java ./vues06a 1 1]()

## Ajouter des images clés

1. Spécifier l'instant

    $[java ./vues06a 3 4]()

1. Spécifier la valeur

    $[java ./vues06a 6 6]()

1. Ajouter l'image clé à l'animation

    $[java ./vues06a 8 10]()

1. Typiquement ont fait tout ça d'un coup:

    $[java ./vues06a 13 16]()

## Contrôler l'animation

1. Spécifier le nombre de fois où l'animation va jouer

    $[java ./vues06a 18 18]()

1. Spécifier une boucle indéfinie

    $[java ./vues06a 20 20]()

1. Démarrer

    $[java ./vues06a 22 22]()

1. Arrêter

    $[java ./vues06a 24 24]()




