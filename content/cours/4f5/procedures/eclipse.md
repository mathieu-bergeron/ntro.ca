# En cas d'erreurs bizarres avec Eclipse

1. En Eclipse, je supprime chaque projet
    * `pong`
    * mon jeu

1. Je **ferme** Eclipse

1. J'ouvre un GitBash à la racine de mon dépôt git

    * Je m'assure d'arrêter Gradle

            $ cd tutoriels
            $ sh gradlew --stop

    * J'efface à la main des fichiers temporaires d'Eclipse

            $ cd pong
            $ rm .project
            $ rm .classpath
            $ rm -rf .settings

            $ cd ..
            $ cd ..
            $ cd mon_projet
            $ cd MON_JEU
            $ rm .project
            $ rm .classpath
            $ rm -rf .settings

    * J'efface à la main des fichiers temporaires de Gralde

            $ rm -rf .gradle

            $ cd ..
            $ cd ..
            $ cd tutoriels
            $ cd pong
            $ rm -rf .gradle

            $ cd ~
            $ rm -rf .gradle
            $ rm -rf .m2

            $ cd /c/Users/MON_USAGER
            $ rm -rf .gradle

1. J'ouvre un GitBash à la racine de mon dépôt git

    * Avec Gradle, je recrée le projet Eclipse pour `pong`

            $ cd tutoriels
            $ sh gradlew build   

                # je peux ignorer un BUILD FAILED ici
                # tout ce qu'on veut est télécharger les dépendances

            $ sh gradlew eclipse

    * Avec Gradle, je recrée le projet Eclipse pour mon projet

            $ cd ..
            $ cd mon_projet
            $ sh gradlew build   

                # je peux ignorer un BUILD FAILED ici
                # tout ce qu'on veut est télécharger les dépendances

            $ sh gradlew eclipse


1. Je démarre Eclipse à nouveau

1. En Eclipse, j'importe à nouveau chaque projet
    * `pong`
    *  mon jeu
    

    


