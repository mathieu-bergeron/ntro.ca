# Tutoriel 4.5: tester que tout fonctionne

## Exécuter le client

1. J'exécute le client

        $ cd tutoriels
        $ sh gradlew client

1. Au besoin je corrige les erreurs


## Vérifier le comportement

1. Je m'assure de pouvoir changer de page

    <center>
    <video width="50%" src="tut04.mp4" type="video/mp4" loop nocontrols autoplay>
    </center>

## Vérifier le graphe de tâches

1. Je m'assure d'avoir le graphe de tâches suivant:

    <center>
        <img width="100%" src="frontend.png"/>
    </center>

    * NOTES:
        * le graphe est généré, alors l'emplacement exact des noeuds peut varier
        * l'important est d'avoir les mêmes séquences
            * p.ex. `viewLoader[VuePartie]` → `VuePartie` → `afficherVuePartie`
