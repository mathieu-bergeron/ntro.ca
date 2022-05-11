# Théorie: modifier un modèle dans le dorsal

<center>
<video width="50%" src="modifier.mp4" type="video/mp4" controls>
</center>

1. Il faut le faire dans une tâche


1. Cette tâche doit avoir un `waitsFor(model(MonModele.class))`, p.ex.

    $[java ./ModifierFileAttente]()

    * NOTE:
        * typiquement, le modèle est disponible via le groupe de tâche précédent et on a pas besoin d'ajoute explicitement ce `waitsFor`

1. `Ntro` va s'occuper de:
    * charger le modèle
    * sauvegarder le modèle après-coup
    * envoyer des messages au frontal pour communiquer les modifications


1. En `Ntro`, **le seul endroit** où modifier le modèle est dans une tâche du dorsal
    * les autres modifications ne seront **pas** sauvegardées dans le fichier `.json`
