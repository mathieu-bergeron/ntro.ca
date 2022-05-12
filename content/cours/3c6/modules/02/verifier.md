# Je vérifie mon dépôt Git

* ATTENTION: $[link ./depots_manquants](Dépôts qu'il manque au prof)

## Dépôt GitHub de la forme `3c6_PRENOM_NOM`

1. Je **dois** avoir:
    * Un dépôt **GitHub privé** nommé `3c6_PRENOM_NOM` 
        * (p.ex. `3c6_mathieu_bergeron`)

1. Sur *GitHub*, je **dois** ajouter `mathieu-bergeron` à la liste des collaborateurs

1. Je **dois** <a href="https://cmontmorency.moodle.decclic.qc.ca/mod/questionnaire/view.php?id=190583" target="_blank">remettre l'URL de mon dépôt Git</a>
    * l'URL est de la forme `git@github.com:MON_USAGER_GITHUB/3c6_PRENOM_NOM`


**IMPORTANT**: 

* ne **jamais** effacer ce dépôt sur GitHub
    * sans ce dépôt, le prof ne pourra pas corriger mes ateliers
* par contre, je peux effacer le dépôt créé pour le tutoriel 1.1

## Dépôt Git local

1. Je **dois** avoir:
    * Un dépôt local dans le répertoire `~/3c6`  
        * (ou `~/3c6_PRENOM_NOM`)

## Les *push/pull* vers *GitHub*

1. Je **dois** pouvoir faire *push* et *pull* entre mon dépôt local et GitHub

        $ cd ~/3c6              # ou cd ~/3c6_PRENOM_NOM
                                # ou cd ~/3c6/3c6_PRENOM_NOM selon votre cas

        $ git pull              # ne doit pas retourner d'erreur!
        $ git push

## En cas d'erreur de *push/pull*

1. Je vais recréer ma clé *SSH*

        $ ssh-keygen.exe

            # faire Entrée pour les options par défaut
            # faire y pour accepter d'écraser la clé existante

        $ cat ~/.ssh/id_rsa.pub


        # Copier le texte de la clé et aller le coller sur GitHub 
        # (Menu usager => Settings => SSH and GPG keys => New SSH key)

1. Je vais sauvegarder mon ancien dépôt local

        $ mv ~/3c6  ~/__3c6_sauvegarde    

        # ou mv ~/3c6_PRENOM_NOM ~/__3c6_sauvegarde 
        # selon votre cas

1. Je vais cloner mon dépôt distant:

        $ cd
        $ git clone git@github.com:MON_USAGER_GITHUB/3c6_PRENOM_NOM

1. Au besoin, je vais copier les fichiers qui ne serait pas sur *GitHub*

        $ cp -rf ~/__3c6_sauvegarde/* ~/3c6_PRENOM_NOM

1. Au besoin, je vais ajouter les fichiers locaux

        $ cd ~/3c6_PRENOM_NOM
        $ git add .
        $ git commit -a -m"réparation dépôt Git"
        $ git push

1. Je peux maintenant effacer mon ancien dépôt local:

        $ rm -rf ~/__3c6_sauvegarde



## Emplacement des projets Eclipse

1. Je ne **dois pas** avoir de projet Eclipse **à la racine** de mon dépôt Git

        $ cd ~/3c6         # ou ~/3c6_PRENOM_NOM
        $ ls -la

                # je dois avoir, par exemple:
                .git
                atelier1_2
                atelier1_3
                tutoriel1_3

                # je ne dois PAS avoir
                .settings
                .project
                .classpath
                src
                bin

        $ rm -rf .settings
        $ rm -rf .project
        $ rm -rf .classpath
        $ rm -rf src
        $ rm -rf bin

1. J'enregistre ces modifications dans Git

		$ git add .
		$ git commit -a
		$ git push


1. Je **vérifie** que la création d'un projet Eclipse se fait bien dans un sous-répertoire
    * **jamais** à la racine de mon dépôt Git

## En cas de conflits Git

1. Soit je choisis la version locale:

		$ git checkout --ours .

1. Soit je choisis la version distante:

		$ git checkout --theirs .

1. Ensuite je doit valider mon choix

		$ git add .
		$ git commit -a
		$ git push
