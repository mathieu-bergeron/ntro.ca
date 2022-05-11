
## Configurer `~` (mon répertoire usager)

<center>
<video width="50%" src="configurer_home.mp4" type="video/mp4" controls>
</center>

1. J'ouvre Git-Bash

1. En Git-Bash, vérifier la version de Java

        $ java -version

            # devrait afficher:
            # java version "11.XXX"
            #
            # ou encore:
            # openjdk version "11.XXX"

1. **Si la version de Java est incorrecte**

    * Je modifie mon `~/.bash_profile`

            $ EDITEUR ~/.bash_profile

        * où `EDITEUR` est mon éditeur de choix: `vim`, `nano`, `notepad.exe`, ...

    * Je m'assure d'ajouter ces deux lignes

            export JAVA_HOME="/c/Program Files/Java/jdk-11.XXX"
            export PATH=$JAVA_HOME/bin:$PATH

        * j'écris exactement `JAVA_HOME` et `PATH`
        * je m'assure d'écrire les `"`
        * je m'assure d'avoir le bon chemin vers le JDK sur mon disque


    * Je re-vérifie la version de Java

            $ source ~/.bash_profile
            $ java -version
