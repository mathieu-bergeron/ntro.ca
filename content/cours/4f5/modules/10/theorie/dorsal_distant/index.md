---
title: ""
weight: 1
bookHidden: true
---


# Théorie: dorsal distant (proxy)

<center>
<video width="50%" src="client.mp4" type="video/mp4" controls>
</center>

1. Pour créer un client `Ntro` en mode client/serveur, on fait

    $[java ./ClientPong]()

<center>
<video width="50%" src="dorsal_distant.mp4" type="video/mp4" controls>
</center>

1. `DorsalPongDistant` hérite de `RemoteBackendNtro`

    $[java ./DorsalPongDistant]()

1. Un dorsal distant n'est pas un «vrai dorsal», mais simplement un proxy
    * tous les messages sont retransmis au serveur
    * le dorsal distant ne défini pas de tâche
    * le dorsal distant ne gère pas de modèle
    * les modifications aux modèles arrivent du serveur

