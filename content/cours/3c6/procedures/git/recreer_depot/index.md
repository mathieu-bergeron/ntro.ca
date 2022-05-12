---
title: ""
weight: 1
bookHidden: true
---


# Recréer un dépôt Git

<div style="padding:5px;background:pink;border-style:dotted" >
<center>
ATTENTION: faire <strong>uniquement</strong> si votre répertoire <code>.git</code> est devenu trop gros.
</center>
</div>

### Faire une copie de sauvegarde de l'ancien dépôt

1. Je fais une copie de sauvegarde via l'explorateur de fichiers Windows

1. Ou en GitBash

		$ cd
		$ cp -rf 3c6_PRENOM_NOM __3c6

### Effacer le dépôt sur GitHub

<div style="padding:5px;background:pink;border-style:dotted" >
<center>
ATTENTION: vous <strong>devez</strong> avoir une copie de sauvegarde avant!
</center>
</div>

### Recréer le dépôt sur GitHub

### Re-cloner le dépôt Git

1. Je clone le dépôt recréée

		$ cd
		$ git clone git@github.com:USAGER/3C6_PRENOM_NOM 

### Copier les fichiers sauvegardés

1. Je copie *tous* les fichiers de la sauvegarde dans le nouveau dépôt Git local
	* Je *m'assure* de copier le fichier `.gitignore`

1. Ou en GitBash

		$ cd
		$ cp -rf __3c6/* 3c6_PRENOM_NOM/

1. Je m'assure de recopier le fichier `.gitignore`

		$ cd
		$ cp __/3c6/.gitignore 3c6_PRENOM_NOM/

### Re-pousser sur GitHub

1. Je fais un `add`/`commit`/`push`

		$ git add .
		$ git commit -a
		$ git push


### Avertir le prof que le dépôt GitHub a été recréé


