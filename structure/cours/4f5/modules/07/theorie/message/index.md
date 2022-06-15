---
title: ""
weight: 1
bookHidden: true
---


# Théorie: notion de message


## Définir et déclarer un message

<center>
<video width="50%" src="declarer.mp4" type="video/mp4" controls>
</center>

1. Le frontal et le dorsal communique à travers des messages

1. En `Ntro`, un message est une classe qui hérite de `MessageNtro`, p.ex.

    $[java ./MsgAjouterRendezVous]()

1. Comme un modèle, on doit
    * ajouter un constructeur par défaut
    * ajouter des accesseurs *get/set* pour chaque attribut

1. On doit aussi déclarer le message, p.ex.

    $[java ./ClientPong01]()


1. Les étapes ci-haut sont **obligatoires**
    * le message est envoyé sur le réseau au format `.json`

## Création et envoi d'un message

<center>
<video width="50%" src="creer.mp4" type="video/mp4" controls>
</center>

1. On fait un appel `newMessage` pour créer un message

    $[java ./VueFileAttente 1 1]()

1. Souvent, on veut insérer de l'information dans le message, p.ex.

    $[java ./VueFileAttente 3 3]()

1. Pour envoyer, on fait appel à `send`

    $[java ./VueFileAttente 5 5]()

## Reception d'un message

<center>
<video width="50%" src="recevoir.mp4" type="video/mp4" controls>
</center>

1. Le message est reçu dans une tâche

1. Dans une tâche du dorsal, on va recevoir le message explicitement. P.ex.

    $[java ./ModifierFileAttente]()

    * la tâche va s'exécuter à chaque fois qu'on reçoit un message de type `MsgAjouterRendezVous`


1. Dans une tâche du frontal, on préfère observer le modèle
    * (voir la section $[link ../observation/](Observer un modèle dans le frontal))


## Implantation client/serveur

<center>
<video width="50%" src="client_serveur.mp4" type="video/mp4" controls>
</center>

1. Si le dorsal et le frontal sont les deux dans le client, on a:
    * chaque message est conservé dans une file d'attente
    * dès que possible, le message est reçu dans une tâche

1. Si le dorsal est sur un serveur (et le frontal sur le client), on a:
    * chaque message est d'abord sauvegardé en `.json`
    * le message est ensuite envoyé sur le réseau
    * de l'autre côté, le `.json` est reçu 
    * le message est construit à partir du `.json`
    * ensuite, le message est reçu dans une tâche

1. NOTES: 
    * le code réseau est caché dans la libraire `Ntro`
    * le/la programmeur/programmeuse d'application n'a pas à le faire

