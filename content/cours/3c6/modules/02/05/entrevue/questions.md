# Question d'entrevue

Considérer la hiérarchie de classes suivante:

<center>
<img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/02/05/entrevue/hierarchie_jeux.svg" width="200px"/>
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
Doom est un fps qui roule à 35 images par seconde
Valorant est un fps qui roule à 120 images par seconde
</pre>

<br>
<br>


Dans un éditeur de texte, coder l'interface `Formateur` et les classes suivantes:

* `JeuVideo`
* `FirstPersonShooter`

Ajouter les *signatures* des méthodes suivantes aux bons endroits, **avec les bonnes visibilités** et **avec le mot clé `abstract` au besoin**

* `String formater()`
* `String typeDeJeu()`
* `String nomJeu()`
* `double imagesParSeconde()`

Recopier votre code ici:

# Question d'entrevue v2

Considérer la hiérarchie de classes suivante:

<center>
<img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/02/05/entrevue/hierarchie_sports.svg" width="200px"/>
</center>


Considérer le programme suivant:

<pre>
public static void main(String[] args){

    Formateur hockey = new Hockey();
    Formateur soccer = new Soccer();

    System.out.println(hockey.formater());
    System.out.println(soccer.formater());
}
</pre>

Le programme va afficher:

<pre>
Le soccer est un sport d'équipe avec 11 joueurs par équipe.
Le hockey est un sport d'équipe avec 6 joueurs par équipe.
</pre>

<br>
<br>


Dans un éditeur de texte, coder l'interface `Formateur` et les classes suivantes:

* `Sport`
* `SportEquipe`

Ajouter les *signatures* des méthodes suivantes aux bons endroits, **avec les bonnes visibilités** et **avec le mot clé `abstract` au besoin**

* `String formater()`
* `boolean estCeSportEquipe()`
* `String nomSport()`
* `double nombreDeJoueursParEquipe()`

Recopier votre code ici:



