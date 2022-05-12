---
title: ""
weight: 1
bookHidden: true
---


# Configurer `.gitignore`

1. En GitBash, je navigue à la racine de mon dépôt Git. Par exemple:

		$ cd
		$ cd ~/3c6_PRENOM_NOM

1. Je vérifie que je suis à la racine du dépôt:

		$ ls -d .git

			# devrait afficher .git

1. Je modifie mon fichier `.gitignore`

		$ EDITEUR .gitignore

			# Ajouter

			*.db
			*.jar

			*.class

			.metadata
			.settings

1. Je fais un `add`/`commit`/`push`

		$ git add .
		$ git commit -a
		$ git push
