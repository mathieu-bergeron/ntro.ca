# Erreur de type `500 from server: Internal Server Error`

1. Si j'ai ce genre d'erreur Gradle

        Could not resolve all artifacts for configuration 'classpath'.
        > Could not resolve org.openjfx:javafx-plugin:0.0.10.
          Required by:
                unspecified:unspecified:unspecified
                   > Could not resolve org.openjfx:javafx-plugin:0.0.10.
                         > Could not get resource 'http://repository.jsweet.org/artifactory/libs-release-local/org/openjfx/javafx-plugin/0.0.10/javafx-plugin-0.0.10.pom'.
                                  > Could not GET 'http://repository.jsweet.org/artifactory/libs-release-local/org/openjfx/javafx-plugin/0.0.10/javafx-plugin-0.0.10.pom'. Received status code 500 from server: Internal Server Error 

## Essayer d'exécuter Gradle avec l'option `offline`

1. Si ça fonctionne, je n'ai pas besoin des autres étapes


        $ cd tutoriels
        $ sh gradlew build --offline


        $ cd ..
        $ cd mon_projet
        $ sh gradlew build --offline

1. Sinon, je fais les étapes ci-bas


## Télécharger des fichiers Gradle pour mon usager

1. Je télécharge $[download ./usager_dot_gradle.zip](usager_dot_gradle.zip) 

1. Je place cet archivea à racine de mon répertoire usager
    * `C:\Users\MON_USAGER\`

1. J'efface les anciens fichiers temporaires de Gradle

        $ cd /c/Users/MON_USAGER
        $ rm -rf .gradle

1. Je décompresse cette archive **sur place**

        $ cd /c/Users/MON_USAGER
        $ unzip usager_dot_gradle.zip


## Télécharger des fichiers Gradle pour un projet

1. Je télécharge $[download ./projet_dot_gradle.zip](projet_dot_gradle.zip) 

1. Je place cette archive dans le répertoire `tutoriels`

1. J'efface les anciens fichiers temporaires du projet Gradle

        $ cd tutoriels
        $ rm -rf .gradle

1. Je décompresse cette archive **sur place**

        $ cd tutoriels
        $ unzip projet_dot_gradle.zip

1. Je déplace l'archive vers le répertoire `mon_projet`

1. J'efface les anciens fichiers temporaires du projet Gradle

        $ cd mon_projet
        $ rm -rf .gradle

1. Je décompresse cette archive **sur place**

        $ cd mon_projet
        $ unzip projet_dot_gradle.zip

## Exécuter Gradle avec `--offline`

1. Je peux maintenant exécuter gradle avec l'option `--offline`

        $ sh gradlew build --offline

## Recréer les projets Eclipse

1. Dans le répertoire `tutoriels`, je recrée le projet Eclipse

        $ cd tutoriels
        $ sh gradlew build --offline
        $ sh gradlew eclipse --offline

1. Dans le répertoire `mon_projet`, je recrée le projet Eclipse

        $ cd mon_projet
        $ sh gradlew build --offline
        $ sh gradlew eclipse --offline

## Rafraîchir ou ré-importer les projets Eclipse

1 Je peux maintenant rafraîchir ou ré-importer les projets Eclipse






