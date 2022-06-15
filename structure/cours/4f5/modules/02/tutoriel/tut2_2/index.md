---
title: ""
weight: 1
bookHidden: true
---


# Tutoriel 2.2: configurer SSH

<center>
<div style="background-color:orange;width:80%;border:2px dashed black;padding:10px">
<strong>IMPORTANT</strong>
<div style="text-align:left">
<ul>
<li>Je fais ces étapes <strong>une fois par machine</strong> où je travaille, p.ex:
<ul>
<br>
<li>une fois sur le Windows du Collège
<li>une autre fois sur mon portable
</ul>
</ul>
</center>

## Créer ma clé SSH

* J'ouvre Git-Bash

* Je crée ma clé SSH

        $ ssh-keygen.exe

            # faire Entrée pour accpter les options par défaut


## Copier ma clé publique

* J'ouvre ma clé publique avec Notepad

        $ notepad.exe ~/.ssh/id_rsa.pub


* Je copie tout le texte p.ex. avec $[kbd](Ctrl+A) et $[kbd](Ctrl+C)

## Ajouter ma clé SSH à mon dépôt Git



* Je me connecte à GitHub

* J'ouvre les paramètres de mon profile GitHub

<center>
    <img height="400px" src="ouvrir_parametres.png"/>
</center>


* Je clique sur *SSH and GPG keys*

<center>
    <img height="300px" src="parametres_github.png"/>
</center>

* Je clique sur *New SSH key*

<center>
    <img width="100%" src="new_key.png"/>
</center>


* Je copie le texte de la clé que j'avais copier:


* Je clique sur *Add SSH key*

<center>
    <img width="100%" src="add_key.png"/>
</center>
