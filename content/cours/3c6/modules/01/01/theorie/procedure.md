---
title: ""
weight: 1
bookHidden: true
---


# Procédure à suivre pour utiliser Git

## Avant de commencer à travailler

1. Je vérifie toujours si j'ai la dernière version:

		$ git pull

## Je fais des commits *souvent*

* Au 10-20 minutes quand tout va bien
* Avant de poser une question
* À **chaque** rapport d'erreur

## Pour faire un commit

1. Je vérifie la liste de fichiers modifiés

		$ git status

1. Au besoin, j'ajoute un fichier qui n'est pas suivi:

		$ git add FICHIER_PAS_SUIVI

1. Finalement, je fais le commit comme tel:

		$ git commit -a


1. Je pousse **tout de suite** mon commit:

		$ git push

## Pour ajouter un tag au commit courant

		$ git tag NOM_TAG
		$ git push --tags

## Pour revenir en arrière

1. Je rétourne un fichier à la dernière version commitée:

		$ git checkout FICHIER

1. Je retourne le dépôt complet à la dernière version commitée:

		$ git reset --hard
