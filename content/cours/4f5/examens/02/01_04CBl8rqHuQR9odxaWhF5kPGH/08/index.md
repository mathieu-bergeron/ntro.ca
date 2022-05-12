---
title: ""
weight: 1
bookHidden: true
---


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

Considérer le schéma du MVC de la méthodologie Ntro, version client/serveur


<img width="800px" src="https://ciboulot.ca/cegep/420-4F5-MO/modules/10/theorie/mvc/mvc_ntro_client_serveur.png"/>


Ci-bas, construire une séquence décrivant correctement l'implantation d'une fonctionnalité client/serveur en Ntro

* Inclure toutes les étapes décrites en théorie
    * (même celles qui sont parfois non-utilisées en pratique)
* Choisir `∅` si une option n'est pas nécessaire

<br>

{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=événement usager~∅} {1:MCS:=JavaFx~Ntro~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=capteur d'événement usager~∅} {1:MCS:=JavaFx~Ntro~∅} {1:MCS:=dans une vue~dans un modèle~dans une tâche du frontal~dans une tâche du dorsal}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=création d'un événement~∅} {1:MCS:=Ntro~JavaFx~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=ajout de données à l'événement~∅} {1:MCS:=Ntro~JavaFx~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=déclanchement de l'événement~∅} {1:MCS:=Ntro~JavaFx~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=capteur d'événement~∅} {1:MCS:JavaFx~=Ntro~∅} {1:MCS:dans une vue~dans un modèle~=dans une tâche du frontal~dans une tâche du dorsal}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=création d'un message~∅} {1:MCS:=Ntro~WebSocket~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=ajout de données au message~∅} {1:MCS:=Ntro~WebSocket~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=envoi du message~∅} {1:MCS:=Ntro~WebSocket~∅}<br>
{1:MCS:Dans le client: ~=Dans le serveur: ~∅} {1:MCS:=réception du message~∅} {1:MCS:=Ntro~WebSocket~∅} {1:MCS:dans une vue~dans un modèle~dans une tâche du frontal~=dans une tâche du dorsal}<br>
{1:MCS:Dans le client: ~=Dans le serveur: ~∅} {1:MCS:=modification au modèle~∅} {1:MCS:=via une méthode du modèle~∅}<br>
{1:MCS:Dans le client: ~=Dans le serveur: ~∅} {1:MCS:=envoi des modifications du modèle~∅} {1:MCS:=vers les clients~vers le dorsal~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=reception des modifications au modèle~∅} {1:MCS:dans une vue~dans un modèle~=dans une tâche du frontal~dans une tâche du dorsal}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=affichage du modèle~∅} {1:MCS:=via une méthode du modèle~∅}<br>
{1:MCS:=Dans le client: ~Dans le serveur: ~∅} {1:MCS:=affichage graphique~∅} {1:MCS:=via une méthode de la vue~∅}<br>

