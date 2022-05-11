# Tutoriel 9.7: réagir au temps qui passe

## Animer le monde 2d

1. J'ouvre `AfficherPartie` et je complète la tâche `prochaineImagePartie` comme suit

    $[java ./AfficherPartie01]()


1. J'utilise $[kbd](Ctrl+1) pour créer la méthode `DonneesVuePartie.reagirTempsQuiPasse`

1. Dans `DonneesVuePartie`, je complète la méthode `reagirTempsQuiPasse` comme suit

    $[java ./DonneesVuePartie01]()

## Faire bouger et rebondir la balle

1. J'ouvre `Balle2d` et je spécifie une vitesse pour la balle

    $[java ./Balle2d01]()

1. Dans `Balle2d` j'ajoute ce code pour donner un comportement à la balle

    $[java ./Balle2d02]()

    * NOTES
        * le `super.onTimePasses` correspond au comportement par défaut d'un objet 2d
        * (c'est-à-dire se déplacer selon sa vitesse)

    
1. J'utilise $[kbd](Ctrl+1) pour créer les méthodes suivantes
    * `balleFrappeMurGauche`
    * `balleRebondiSurMurGauche`
    * `balleFrappeMurDroit`
    * `balleRebondiSurMurDroit`
    * `balleFrappePlafond`
    * `balleRebondiSurPlafond`
    * `balleFrappePlancher`
    * `balleRebondiSurPlancher`

1. Je complète le code de `Balle2d` comme suit

    
    $[java ./Balle2d03]()

    * NOTES
        * la méthode `collidesWith` est fournie dans `World2dFx`
        * le `EPSILON` permet de s'assurer que la balle est distancée du mur
            * (sinon elle peut rester «collée»)
       



## Tester que ça fonctionne

1. J'exécute le client pour vérifier que la balle rebondi sur les murs

        $ cd tutoriels
        $ sh gradlew client


    <center>
        <video width="50%" src="tut09.mp4" type="video/mp4" loop nocontrols autoplay>
    </center>

1. Je peux aussi tester avec plusieurs balles en ajoutant ce code dans `MondePong2d`

    $[java ./MondePong2d01]()

    <center>
        <video width="50%" src="tut09_100balles.mp4" type="video/mp4" loop nocontrols autoplay>
    </center>
