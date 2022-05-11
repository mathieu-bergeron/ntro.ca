---
title: ""
weight: 1
# bookFlatSection: false
# bookToc: false
# bookHidden: false
# bookCollapseSection: false
# bookComments: false
# bookSearchExclude: false
---


<style>
pre > code {
	-webkit-touch-callout: text;
	-webkit-user-select: text;
	-khtml-user-select: text;
	-moz-user-select: text;
	-ms-user-select: text;
	user-select: text;
}
</style>

Dans la vidéo ci-bas, porter attention à la création de collaboration et à l'ajout de collaborateur

<video width="800px" src="https://ciboulot.ca/cegep/420-4F5-MO/examens/02/application/examen02_02.mp4" type="video/mp4" controls="true">

Ci-bas, construire une séquence décrivant correctement les 5 premières secondes de la vidéo

* Certaines étapes décrites en théorie ne s'appliquent pas
* Choisir `∅` si une option n'est pas nécessaire

<br>

## Étape 1) ajout d'une collaboration

{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=clic d'un bouton générant un événement de type~∅} {1:MCS:=ActionEvent~EvtCreerCollaboration~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=capteur d'événement~∅} {1:MCS:=dans VueFileAttente~dans FragmentCollaboration~dans FragmentCollaborateur~dans Collaborateur~dans Collaboration~dans taches.AfficherFileAttente~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=création d'un message de type~∅} {1:MCS:=MsgCreerCollaboration~MsgAjouterCollaborateur~WebSocket~Json~MsgAjouterforme~∅}<br>
{1:MCS:Dans le client: ~Dans le serveur: ~=∅} {1:MCS:ajout de données au message~=∅} {1:MCS:p.ex. le nom du collaborateur~=∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=envoi du message~Diffusion du message~∅} {1:MCS:=vers le serveur~vers les autres clients~∅}<br>
{1:MCS:Dans le client: ~=Dans le serveur: ~∅} {1:MCS:=reception du message~∅} {1:MCS:=dans dorsal.taches.ModifierFileAttente~frontal.taches.AfficherFileAttente~∅} <br>
{1:MCS:Dans le client: ~=Dans le serveur: ~∅} {1:MCS:=modification du modèle~∅}  {1:MCS:via un waitsFor(modified(ModeleFileAttente.class))~=via un waitsFor(model(ModeleFileAttente.class))~∅}<br>
{1:MCS:Dans le client: ~=Dans le serveur: ~∅} {1:MCS:=envoi des modifications~∅} {1:MCS:=vers les clients~vers le dorsal~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=reception des modifications~∅} {1:MCS:=dans taches.AfficherFileAttente~taches.ModifierFileAttente~∅} {1:MCS:=via un waitsFor(modified(ModeleFileAttente.class))~via un waitsFor(model(ModeleFileAttente.class))~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=affichage du modèle~∅} {1:MCS:=via fileAttente.afficherSur(...)~∅} <br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=affichage graphique~∅} {1:MCS:=via vueFileAttente.ajouterCollaboration(...)~∅} <br>

<br>
<br>
<br>

## Étape 2) ajout d'un collaborateur

{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=clic d'un bouton générant un événement de type~∅} {1:MCS:=ActionEvent~EvtCreerCollaborateur~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=capteur d'événement~∅} {1:MCS:dans VueFileAttente~=dans FragmentCollaboration~dans FragmentCollaborateur~dans Collaborateur~dans Collaboration~dans taches.AfficherFileAttente~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=création d'un message de type~∅} {1:MCS:MsgCreerCollaboration~=MsgAjouterCollaborateur~WebSocket~Json~MsgAjouterforme~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=ajout de données au message~∅} {1:MCS:=p.ex. le nom du collaborateur~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=envoi du message~Diffusion du message~∅} {1:MCS:=vers le serveur~vers les autres clients~∅}<br>
{1:MCS:Dans le client: ~=Dans le serveur: ~∅} {1:MCS:=reception du message~∅} {1:MCS:=dans dorsal.taches.ModifierFileAttente~frontal.taches.AfficherFileAttente~∅} <br>
{1:MCS:Dans le client: ~=Dans le serveur: ~∅} {1:MCS:=modification du modèle~∅}  {1:MCS:via un waitsFor(modified(ModeleFileAttente.class))~=via un waitsFor(model(ModeleFileAttente.class))~∅}<br>
{1:MCS:Dans le client: ~=Dans le serveur: ~∅} {1:MCS:=envoi des modifications~∅} {1:MCS:=vers les clients~vers le dorsal~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=reception des modifications~∅} {1:MCS:=dans taches.AfficherFileAttente~taches.ModifierFileAttente~∅} {1:MCS:=via un waitsFor(modified(ModeleFileAttente.class))~via un waitsFor(model(ModeleFileAttente.class))~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=affichage du modèle~∅} {1:MCS:=via fileAttente.afficherSur(...)~∅} <br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=affichage graphique~∅} {1:MCS:=via fragmentCollaboration.ajouterCollaborateur(...)~∅} <br>





<br>
<br>
<br>


## Et ainsi de suite...

Vous n'avez pas à décrire toute la vidéo
