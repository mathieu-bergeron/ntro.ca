---
title: ""
weight: 1
bookHidden: true
---


# Tutoriel 2.6: coder `ClientPong` et `FrontalPong`

## Commencer à coder le client du projet `pong`

1. En Eclipse, j'ajoute la classe `ClientPong` au paquet `pong`
    * *Clique-droit* sur le projet `pong`  => *New* => *Class*
    * Je m'assure d'avoir:
        * paquet: `pong`
        * nom: `ClientPong` 
        * coché: `public static void main(String[] args)`
    * *Finish*


1. J'ouvre `ClientPong.java` et je m'assure que la classe implante `NtroClientFx`

    $[java ./ClientPong01 1 1]()


1. Avec $[kbd](Ctrl+1), j'ajoute le `import NtroClientFx`

1. Avec $[kbd](Ctrl+1), j'ajoute les méthodes obligatoires de `NtroClientFx`

1. Dans la méthode `main`, j'ajoute le code pour lancer l'application

    $[java ./ClientPong01 3 5]()


## Exécuter le client `pong`

1. J'ouvre un Git-Bash dans le répertoire `tutoriels` de mon dépôt Git

1. J'exécute `ClientPong` en français

        $ sh gradlew clientFr

            # Devrait afficher

            [INFO] Locale: 'fr_CA'
            [INFO] Ntro default frontend. Please register a frontend
            [INFO] App running. Press any key here to exit.

1. J'observe que:
    * l'application n'affiche rien (il n'y a pas de frontal)
    * l'application reste active tant que l'usager ne la ferme pas

1. J'appuie sur n'importe quelle touche pour quitter l'application


1. J'exécute `ClientPong` en anglais

        $ sh gradlew clientEn

            # Devrait afficher

            [INFO] Locale: 'en_CA'
            [INFO] Ntro default frontend. Please register a frontend
            [INFO] App running. Press any key here to exit.

1. J'appuie sur n'importe quelle touche pour quitter l'application


## Commencer à coder le frontal du client `pong`

1. En Eclipse, j'ajoute le paquet `frontal` au projet `pong`
    * *Clique-droit* sur le paquet `pong`  => *New* => *Package*
    * Je m'assure d'avoir:
        * nom du paquet: `pong.frontal`
    * *Finish*

1. En Eclipse, j'ajoute la classe `FrontalPong` au paquet `frontal`
    * *Clique-droit* sur le paquet `frontal`  => *New* => *Class*
    * Je m'assure d'avoir:
        * paquet: `pong.frontal`
        * nom: `FrontalPong` 
    * *Finish*

1. J'ouvre `FrontalPong.java` et je m'assure que la classe implante `FrontendFx`

1. Avec $[kbd](Ctrl+1), j'ajoute le `import FrontendFx`

1. Avec $[kbd](Ctrl+1), j'ajoute les méthodes obligatoires de `FrontendFx`

1. Avant d'ajouter des tâches à un frontal, je copie le `import static` suivant:

    * <span style="background-color:orange; padding:10px;border:2px dashed black;"> `import static ca.ntro.app.tasks.frontend.FrontendTasks.*;` </span>

1. Dans la méthode `createTasks`, j'ajoute une tâche pour afficher la fenêtre

    $[java ./FrontalPong 5 18]()


    * **ATTENTION**: j'importe la bonne version de `Window`, c'est-à-dire:
        * `ca.ntro.app.services.Window`

## Déclarer le frontal du clien `pong`

1. J'ouvre `ClientPong.java` 

1. Dans la méthode `registerFrontend`, je m'assure de déclarer le frontal du client `pong`

    $[java ./ClientPong02]()


1. J'utiliser $[kbd](Ctrl+1) pour importer `FrontalPong`
