---
title: ""
weight: 1
bookHidden: true
---


# Théorie 2.6: constructeurs et `super`

<center>
<video width="50%" src="01.mp4" type="video/mp4" controls>
</center>

* Un constructeur est une méthode spéciale appelée à la création d'un objet

* Le mot clé `super` permet d'accéder à la superclasse

## Constructeur

<center>
<video width="50%" src="02.mp4" type="video/mp4" controls>
</center>

* À la création d'un nouvel objet:

$[java ./Principal 3 6]()

* Un constructeur est appelé:

$[java ./Vehicule 1 7]()

* Typiquement, on veut créer un objet en spécifiant certaines valeurs:

$[java ./Principal 8 11]()

* Dans ce cas, le constructeur doit avoir un argument:

$[java ./Vehicule 9 11  ]()


## Constructeur et classe parent

<center>
<video width="50%" src="03.mp4" type="video/mp4" controls>
</center>


* Il faut toujours appeler le constructeur de la classe parent avec le mot clé `super`

$[java ./Auto]()


## Pourquoi utiliser le mot clé `super`?

<center>
<video width="50%" src="04.mp4" type="video/mp4" controls>
</center>

* Dans chaque constructeur d'une sous-classe (c'est obligé!)

* Mais aussi pour appeler explicitement une méthode de la classe parent:

$[java ./Auto_super_simple]()

* En particulier, c'est utile pour modifier le comportement d'une méthode parent:

$[java ./Auto_super]()

* C'est-à-dire:
    * on redéfini la méthode `formater` qui est implantée dans la classe `Vehicule`
    * dans `Auto`, le comportement de cette méthode devient:
        * on prend la valeur de `formater` que `Vehicule` aurait retournée
        * main on ajoute `"[AUTO]"` avant de retourner

