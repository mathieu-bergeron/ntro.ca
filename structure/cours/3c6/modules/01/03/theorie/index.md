---
title: ""
weight: 1
bookHidden: true
---


# Méthodes qu'on *doit* implanter

<center>
<video width="50%" src="01.mp4" type="video/mp4" controls>
</center>

## Implanter une interface est un contrat

<center>
<video width="50%" src="02.mp4" type="video/mp4" controls>
</center>

1. Implanter une interface veut dire qu'on implante les méthodes qu'elle contient

1. Considérer le code suivant:

$[java ./Interface]()

1. Ce code pourrait entraîner l'erreur de compilation suivante:

        Theore1_3.java:3: error: Theore1_3 [does not implement] method 

                                 String obtenirNom() 

                                 in PossedeNom

        public class Theore1_3 implements PossedeNom {
               ^
               1 error

    * L'erreur dit que la classe `Theorie1_3` **doit** implanter
      la méthode `String obtenirNom()` qui est déclarée dans la
      l'interface `PossedeNom`

1. Pour réparer, il faut ajouter la méthode

$[java ./Interface_reparee]()


* NOTES: 
    * la méthode doit avoir la signature `String obtenirNom()`
    * par contre le contenu est au choix du programmeur

    

## Hériter d'une classe peut aussi être un contrat

<center>
<video width="50%" src="03.mp4" type="video/mp4" controls>
</center>

1. Pour hériter d'une classe parent, il faut parfois implanter des méthodes

1. Considérer le code suivant:

$[java ./Classe]()


1. Ce code pourrait entraîner l'erreur de compilation suivante:

        Theore1_3.java:3: error: Theore1_3 [does not implement] method 

                                 afficher(int valeur) 

                                 in Afficheur

        public class Theore1_3 extends Afficheur {
               ^
               1 error

    * L'erreur dit que la classe `Theorie1_3` **doit** implanter
      la méthode `afficher(int valeur)` qui est déclarée dans la
      classe parent `Afficheur`

1. Pour réparer, il faut ajouter la méthode

$[java ./Classe_reparee]()

* NOTES: 
    * la méthode doit avoir la signature `afficher(int valeur)`
    * par contre le contenu est au choix du programmeur


## Annotation `@Override`

<center>
<video width="50%" src="04.mp4" type="video/mp4" controls>
</center>

1. L'annotation `@Override` indique soit: 
    * qu'on a implanté une méthode *obligatoire*
    * qu'on a redéfini (*override*) la méthode d'une super classe

1. Par exemple:

$[java ./Theorie_reparee]()

1. Le compilateur peut vérifier que le `@Override` est appliqué aux bons endroits
    * (et ainsi détecter rapidement certaines erreurs)

