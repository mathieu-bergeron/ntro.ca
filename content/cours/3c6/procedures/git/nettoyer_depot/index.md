<style>
pre > code {
	-webkit-touch-callout: text;
	-webkit-user-select: text;
	-khtml-user-select: text;
	-moz-user-select: text;
	-ms-user-select: text;
	user-select: text;
}
</style>




# Nettoyer un dépôt Git

<div style="padding:5px;background:pink;border-style:dotted" >
<center>
ATTENTION: faire une copie de sauvegarde sur disque externe <strong>avant</strong> 
d'exécuter les commandes ci-bas
</center>
</div>

<bf>

<div style="padding:5px;background:lightgreen;border-style:dotted" >
<center>
NOTE: Le copier-coller est activé sur cette page
</center>
</div>


1. En GitBash, je navigue à la racine de mon dépôt Git. Par exemple:

		$ cd
		$ cd ~/3c6_PRENOM_NOM

1. Je vérifie que je suis à la racine du dépôt:

		$ ls -d .git

			# devrait afficher .git

## Tout supprimer d'un coup

1. J'efface des fichiers et répertoires superflus:

		$ find . -name "*.db" -o -name "*.jar" -o -name "*.class" -o -name ".metadata" -o -name ".settings" | while read i; do rm -rvf "$i"; done

	* NOTE: au besoin, je devrais re-télécharger certain fichier `.jar` ou `.db`

1. Je $[link ../configurer_gitignore/](configure mon fichier `.gitignore`)

1. Je fais un `add`/`commit`/`push`

		$ git add .
		$ git commit -a
		$ git push

## Supprimer un type de fichier à la fois

1. J'efface tous les fichiers `.db`

		$ find . -name "*.db" | while read i; do rm -rvf "$i"; done


	* NOTE: au besoin, je devrais re-télécharger un `.db` qu'il me manque


1. J'efface tous les fichier `.jar`

		$ find . -name "*.jar" | while read i; do rm -rvf "$i"; done

	* NOTE: au besoin, je devrais re-télécharger un `.jar` qu'il me manque

1. J'efface tous les fichier `.class`

		$ find . -name "*.class" | while read i; do rm -rvf "$i"; done

1. J'efface les répertoires `.metadata` (Workspace Eclipse)

		$ find . -name ".metadata" | while read i; do rm -rvf "$i"; done

1. J'efface les répertoires `.settings` (configuration Eclipse)

		$ find . -name ".settings" | while read i; do rm -rvf "$i"; done

1. Je $[link ../configurer_gitignore/](configure mon fichier `.gitignore`)

1. Je fais un `add`/`commit`/`push`

		$ git add .
		$ git commit -a
		$ git push
