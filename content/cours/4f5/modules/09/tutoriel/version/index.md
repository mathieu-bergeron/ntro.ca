# Tutoriel 9.1: migrer à la version `0.9` de `Ntro`

1. Dans le répertoire `tutoriels`, j'ouvre `gradle.properties`


1. Je modifie `ntroVersion` pour indiquer `0.9`

    Était:

    <pre>
        ntroVersion=0.8
    </pre>

    Devient:

    <pre>
        ntroVersion=0.9
    </pre>

1. En Gradle, j'exécute le client `pong`

        $ cd tutoriels
        $ sh gradlew client

            # Gradle va télécharger la version 0.9 de Ntro

            # Devrait afficher la fenêtre principale
            # Devrait afficher à la console

            [INFO] Ntro version 0.9

1. En Gradle, je recrée le projet Eclipse

        $ sh gradlew eclipse

1. En Eclipse, je rafraîchis le projet `pong`

    * Clique-droit sur le projet => *Refresh*

        <center>
            <img width="50%" src="eclipse00.png"/>
        </center>

1. En Eclipse, j'exécute le client `pong`
    * Clique-droit `ClientPong` => *Run as* => *Java Application*

        <center>
            <img width="50%" src="eclipse01.png"/>
        </center>


    * Devrait aussi afficher `[INFO] Ntro version 0.9`

        <center>
            <img src="eclipse02.png"/>
        </center>


1. En cas d'erreurs bizarres avec Eclipse
    * je m'assure que j'ai la version `0.8` dans `tutoriels/gradle.properties`
    * je refais les étapes de cette page
    * si j'ai encore des erreurs, je suis cette <a href="/cegep/420-4F5-MO/procedures/eclipse">procédure</a>



        

