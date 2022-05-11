# Théorie: observer un modèle dans le frontal

<center>
<video width="50%" src="observation.mp4" type="video/mp4" controls>
</center>

1. Observer veut dire: réagir aux modifications apportées au modèle

1. On le fait dans une tâche du frontal avec un `waitsFor(modified(MonModele.class))`

    $[java ./AfficherFileAttente]()


1. Cette tâche va s'exécuter à chaque fois que le modèle est modifié

1. On reçoit la valeur courante du modèle (et l'ancienne valeur)

1. **IMPORTANT**: il s'agit de **copies** du modèle
    * modifier ces copies ne **va pas** modifier le modèle pour vrai
    * le seul endroit pour modifier le modèle pour vrai est dans une tâche du dorsal

1. En réalité, ces valeurs sont reçues via des messages
    * mais `Ntro` reçoit ces messages automatiquement
    * le/la programmeur/programmeuse d'application n'a pas à le coder

