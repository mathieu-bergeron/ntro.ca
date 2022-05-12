---
title: ""
weight: 1
bookHidden: true
---


# Les ~25 modules


10pts) SEMAINES 1-2

1. Installation 01: Eclipse
1. Installation 02: GIT
1. Installation 03: Add unimplemented methods

(Rendez-vous individuels pour tous les étudiants)

(date limite d'évaluation: à l'intérieur de la période? Sinon: frais de retard)

(à évaluer en personne: les 3)
(qui compte: 3)

30pts) SEMAINES 3-6

1. Rappel POO: code de librairie Vs code d'application
1. Rappel POO: héritage «de base»
1. Rappel POO: visibilité
1. Rappel POO: interface
1. Rappel POO: classe abstraite
1. Rappel POO: mot clé super
1. Rappel POO: types génériques
1. Rappel POO: introspection

(à évaluer en personne: au moins 2)
(qui compte: 6)

RELÂCHE 1

20pts) SEMAINES 7-8

1. Fichier JSON: sauvegarder et charger de base
1. Fichier JSON: le mappage (objet JSON)
1. Fichier JSON: les autres types (liste, types primaires)
1. Fichier JSON: équivalents Java
1. Fichier JSON: modifier un fichier sans le charger en mémoire
1. Notion de modèle: quoi sauvegarder Vs quoi faire «live»

(à évaluer en personne: au moins 2)
(qui compte: 5)

20pts) SEMAINES 9-10

1. Récursivité
1. Tri générique: naïf
1. Tri générique: bubble sort
1. Tri générique: quicksort

(à évaluer en personne: au moins 2)
(qui compte: 3)

RELÂCHE 2

20pts) SEMAINES 11-13

1. Structure: liste 1
1. Structure: liste 2
1. Structure: liste 3
1. Structure: mappage 1 (hashmap)
1. Structure: mappage 2
1. Structure: mappage 3

(à évaluer en personne: au moins 2)
(qui compte: 5)

ÉVALUATION POUR LES DERNIERS RENDEZ-VOUS




# Rappel POO

1. Tutoriels et dictées trouées à l'intérieur de l'implantation d'un jeu
1. Trois cibles:
    * Swing
    * JSweet
        * (note: on doit charger les ressources async)
    * Android

# Notion de modèle (données)

1. Voir les structures de Json
1. On commence le cours par le chargement

# JSON

1. On va écrire notre propre sauvegardeur/chargeur de JSON 
    * à partir de gson et parseJSON
    * on veut supporter les `_Type` (nom de classes)
1. Il faut une petite intro à l'introspection (?)

# Jeu «grimpeur»

1. Niveaux verticaux où on peut sauter d'une plateforme à l'autre, éviter les obstacles, etc.
1. Niveaux générés procéduralement, puis sauvegardés en JSON
    * p.ex. charger le JSON veut aussi dire trier les objets graphiques selon leur verticalité

# Variantes

1. Variantes d'un jeu «grimpeur» pour tous les exemples
    * pour chaque variante:
        * implantation naive avec listes
        * implantation performante avec une structure dédiée
    * FPS
        * mesurer pour comparer les structures
    * temps de chargement:
        * p.ex. pour mesurer le temps de tri
            * (il faut voir les techniques de tri)

# Mesures de performance

1. Mesures de performances
    * FPS (ou temps entre les affichages)
        * comparer N et N^2 
    * Temps de chargement (pour comparer les tris)
        * comparer N et log(N)
    * Utilisation mémoire (Mo)
1. Testeur
    * tourner le jeu pendant 5 secs pour chaque niveaux (p.ex. nombre d'objets)
1. Rapports de performance
    * Afficher des graphes

# Expliquer le concept de HashTable

1. On découpe le jeu en grande case. Pour chaque grande case, on a un plus petit tableau qui contient les éléments de cette case.

