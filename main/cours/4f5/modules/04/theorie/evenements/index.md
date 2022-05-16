---
title: ""
weight: 1
bookHidden: true
---


# Théorie: réagir aux événements usager

## Identifier les contrôles en FXML

<center>
<video width="50%" src="identifiant.mp4" type="video/mp4" controls>
</center>

* Dans le `.xml`, on doit identifier chaque contrôle avec un attribut `fx:id`

    $[xml ./file_attente]()

    * NOTE: ligne 2

* Le `fx:id` et `id` ne joue pas le même rôle
    * `fx:id` identifiant JavaFx 
    * `id` identifiant CSS

## Récupérer un contrôle dans une Vue

<center>
<video width="50%" src="attribut_java.mp4" type="video/mp4" controls></video><br>
(oubli: le type de l'attribut doit être la même classe que la balise)
</center>

* Pour accéder au contrôle en Java, on ajoute un attribut dans notre Vue

$[java ./VueFileAttente01]()

* Le nom de l'attribut doit correspondre exactement au `fx:id` du fichier `.xml`

* Le type de l'attribut doit être la même classe que la balise dans le fichier `.xml`

* L'annotation `@FXML` doit être directement au dessus de l'attribut

* La ligne `Ntro.assertNotNull` est utile pour détecter rapidement les erreurs


## Installer un capteur d'événement en JavaFx

<center>
<video width="50%" src="evt_fx.mp4" type="video/mp4" controls>
</center>

* Voici comment capter un événement JavaFx

    $[java ./VueFileAttente02]()

    * quand l'usager clique, on devrait avoir l'affichage suivant à la console

            clic: ACTION
            clic: ACTION
            clic: ACTION

## Créer et déclencher un événement en `Ntro`

<center>
<video width="50%" src="creer_evt_ntro.mp4" type="video/mp4" controls>
</center>

* Il faut créer une classe qui hérite de `EventNtro`, p.ex.

    $[java ./EvtAfficherFileAttente]()

    * NOTE: par convention, on va appeler nos événements `EvtNomEvenement`

* Il faut déclarer l'événement dans le Frontal, p.ex.

    $[java ./FrontalPong]()

* Chaque événement `Ntro` doit être créé

    $[java ./VueFileAttente03 3 3]()

* Une fois créé, on peut le déclencher comme ceci

    $[java ./VueFileAttente03 7 7]()

* On déclenche typiquement un événement `Ntro` à chaque fois qu'on capte un événement JavaFx

    $[java ./VueFileAttente03]()

1. Les noms `evtNtro` et `evtFx` sont des **mauvais** noms de variables
    * on les utilise ici pour des raisons pédagogiques
    * on veut souligner le fait qu'il s'agit de types d'événement différents

## Gérer un événement en `Ntro`

<center>
<video width="50%" src="reagir_evt.mp4" type="video/mp4" controls>
</center>

1. Il faut créer une tâche pour gérer l'événement `Ntro`

$[java ./Navigation]()


1. La tâche est déclenchée à chaque fois que l'événement est déclenchée
    * (et que les autres conditions sont remplies)



