---
title: ""
weight: 1
bookHidden: true
---


# Théorie: notion de session

<center>
<video width="50%" src="presentation.mp4" type="video/mp4" controls>
</center>

* Dans une application client/serveur, une session est liée à une connexion

* Typiquement, la session contient

    * un numéro unique de session
    * l'identifiant de l'usager qui s'est connecté
    * le nom de l'usager
    * des paramètres temporaires, p.ex.
        * état d'un fil de discussion
        * ordre de tri données
        * etc.

* Typiquement, la session expire après un certain temps
    
    * l'usager doit alors se reconnecter

* Pour l'instant, on va simuler la session avec des attributs statiques

    $[java ./Session]()

* Pour tester avec plusieurs sessions, on va démarrer plusieurs versions

        $ sh graldew alice
        $ sh graldew bob
        $ sh graldew charlie

* On va définir chaque session dans le `build.gradle`

    <pre>
    task(alice, dependsOn: 'classes', type: JavaExec) {
       configure clientConfig
       args("Alice","GAUCHE")
    }
    </pre>

    <pre>
    task(bob, dependsOn: 'classes', type: JavaExec) {
       configure clientConfig
       args("Bob","DROITE")
    }
    </pre>

    <pre>
    task(charlie, dependsOn: 'classes', type: JavaExec) {
       configure clientConfig
       args("Charlie","AUCUN")
    }
    </pre>
