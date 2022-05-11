# Introduction à Gradle

## Utilité de l'outil

1. Gradle gère les dépendances et automatise les tâches de compilation
1. Gradle télécharge les librairies manquantes
1. Outil console (pratique pour scripter et exécuter sur le serveur)
1. (outil par défaut des projets Android)

## Arborescence

<pre>
   settings.gradle             config du projet
   builSrc                     scripts gradle locaux

   app01                       sous-projet (il peut en avoir plusieurs)
   app01/build.gradle          tâches de compilation d'un sous-projet
   app01/src/main/java         fichiers Java
   app01/src/main/resources    fichiers .fxml, .css, etc.

   gradlew                     commande Gradle (Linux et Mac)
   gradle.bat                  commande Gradle (Windows)
   gradle                      librairie Gradle

   .gradle                     fichiers temporaires du projet
   ~/.gradle                   fichiers temporaires de l'usager
</pre>

## Configurer le projet (`settings.gradle`)

1. Nom du projet
    <pre>
    rootProject.name = 'projet4f5'
    </pre>

1. Inclure un sous-projet:
    <pre>
    include 'app01'
    </pre>

## Gestion des dépendances

1. Dépendance via Git
    * Gradle va clone le dépôt Git et compiler la dépendance
    * Dans `settings.gradle`:
        <pre>
        sourceControl {
            gitRepository("https://github.com/mathieu-bergeron/ntro4f5.git") {
                producesModule("ca.ntro4f5:ntro")
            }
        }
        </pre>
    * Dans `build.gradle`:

        <pre>
        dependencies {
            implementation 'ca.ntro4f5:ntro:0.1' 
        }
        </pre>

1. Dépendance à une librairie
    * Gradle va télécharger le `.jar` à partir d'un catalogue (p.ex. `MavenCentral`)
    * Dans `build.gradle`:
        <pre>
        repositories {
            jcenter()
        }

        dependencies {
           implementation 'com.google.code.gson:gson:2.8.5'
        }
        </pre>


## Tâches

1. Pour exécuter une classe principale, on ajoute dans `build.gradle`:

    <pre>
    task MaTache (type:JavaExec) {
        dependsOn 'classes'
        main = 'app01.Main'
        classpath = sourceSets.main.runtimeClasspath
    }
    </pre>

1. On peut aussi ajouter des options, p.ex.
    <pre>
    task MaTache (type:JavaExec) {
        [...]
        jvmArgs('-Dfile.encoding=UTF-8', '-Duser.language=fr')
        standardInput = System.in
    }
    </pre>

    * `jvmArgs` passe des arguments à la JVM, p.ex. que la langue est le français
    * `standardInput` sélectionne le clavier comme méthode de saisie par défaut

## Scripts locaux (plugin)

1. Dans `buildSrc`, on peut ajouter des scripts (appelé plugin) 

1. Permet de réutiliser des configurations pour plusieurs sous-projets

    * Voir p.ex. `~/tutoriels4f5/buildSrc/src/main/groovy/local-4f5-plugin.gradle`

1. On utilise un plugin dans `build.gradle`:

    <pre>
    plugins {
        id 'local-4f5-plugin'
    }
    </pre>


## Commandes


1. Compiler

        $ sh gradlew build

1. Effacer les fichiers temporaires

        $ sh gradlew clean

1. Exécuter une tâche

        $ sh gradlew MaTache
