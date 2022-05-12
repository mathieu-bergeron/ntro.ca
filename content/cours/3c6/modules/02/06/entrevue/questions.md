---
title: ""
weight: 1
bookHidden: true
---


# Question d'entrevue

Considérer la hiérarchie de classes suivante:

<center>
<img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/02/06/entrevue/hierarchie_jeux.svg" width="200px"/>
</center>


Considérer le programme suivant:

<pre>
public static void main(String[] args){

    Formateur doom = new Doom();
    Formateur valorant = new Valorant();

    System.out.println(doom.formater());
    System.out.println(valorant.formater());
}
</pre>

Le programme va afficher:

<pre>
DOOM! --- Doom est un fps qui roule à 35 images par seconde
Valorant est un fps qui roule à 120 images par seconde [Qui ici est bon à Valorant?]
</pre>

<br>
<br>


Dans un éditeur de texte, coder la méthode `formater` telle que **redéfinie** dans:

* `Doom`
* `Valorant`
