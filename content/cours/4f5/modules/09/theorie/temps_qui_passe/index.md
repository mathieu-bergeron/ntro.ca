# Théorie: réagir au temps qui passe

## Déplacer un objet 2d

<center>
<video width="50%" src="deplacer.mp4" type="video/mp4" controls>
</center>

* L'objet 2d a aussi une vitesse
* Cette vitesse indique comment déplacer l'objet

<center>
    <img width="100%" src="objet2d.svg"/>
</center>

### En `Ntro`

* Choisir la vitesse dès le début

$[java ./Balle2d01]()



## Réagir au temps qui passe

<center>
<video width="50%" src="temps_qui_passe.mp4" type="video/mp4" controls>
</center>

* Pour déplacer un objet on va:
    1. Attendre que le temps passe
    1. Déplacer un tout petit peu l'objet selon sa vitesse
    1. Ré-afficher le monde 2d

<center>
    <img width="100%" src="deplacer.svg"/>
</center>

### En `Ntro`

* Ajouter une tâche qui s'exécute à chaque `clock().nextTick()`
    * (c-à-d dès que possible)

    $[java ./AfficherPartie01]()

* Appeler le `onTimePasses` du monde 2d (méthode héritée de `World2d`)

    $[java ./DonneesVuePartie01]()


* `World2dFx.onTimePasses` va notifier chaque objet que le temps passe

    $[java ./World2d]()

* Par défaut, un objet 2d se déplace selon sa vitesse

    $[java ./Object2d]()

* On peut aussi redéfinir `onTimePasses` et ajouter du comportement

    $[java ./Balle2d02]()

