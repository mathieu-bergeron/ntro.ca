# Théorie 2.3: polymorphisme

<center>
<video width="50%" src="01.mp4" type="video/mp4" controls>
</center>

* Polymorphisme veut simplement dire plusieurs formes
* Considérer la hiérarchie suivante:

    <center>
    <img width="80%" src="hierarchie.svg"/>
    </center>

* Un véhicule peut prendre plusieurs formes:
    * `Mobilette`, `Auto`, `Camion`, etc.

## L'héritage veut dire *est un*

<center>
<video width="50%" src="02.mp4" type="video/mp4" controls>
</center>

* Considérer la méthode suivante:

    $[java ./polymorphisme 1 3]()

* Tous ces appels à la méthodes sont valides:

    $[java ./polymorphisme 5 8]()

* C'est à dire, via l'héritage et le polymorphisme:
    * un objet `Vehicule` est un `Vehicule`
    * un objet `DeuxRoues` est un `Vehicule`
    * un objet `Moto` est un `Vehicule`
    * un objet `Mobilette` est un `Vehicule`

## Accéder aux méthodes

<center>
<video width="50%" src="03.mp4" type="video/mp4" controls>
</center>

* Considérer à nouveau la méthode suivante:

    $[java ./polymorphisme 1 3]()

* On peut appeler la méthode `nombreDeRoues()` sur l'objet `vehicule`
    * car cette méthode est définie dans la classe `Vehicule`

* On ne pourrait pas appeler la méthode `marqueDeMobilette()` sur l'objet `vehicule`
    * car cette méthode est définie dans la classe `Mobilette`

* Comme l'objet `vehicule` est de type `Vehicule`, on peut seulement accéder
    * aux méthodes définies dans la classe `Vehicule`
    * même si la méthode `accepterSiDeuxRoues` avait été appelée comme suit:

        $[java ./polymorphisme 8 8]()

    * c-à-d même si l'objet `vehicule` est en réalité une `Mobilette`, on accède
        * aux méthodes propres au type donné dans le code


## Vérifier le type réel

<center>
<video width="50%" src="04.mp4" type="video/mp4" controls>
</center>

* Considérer maintenant la méthode suivante:

    $[java ./polymorphisme 10 19]()

* L'opérateur `instanceof` vérifie le type réel de l'objet `vehicule`, ici:
    * retourne vrai  si `vehicule` est en fait une `Mobilette`
    * retourne faux sinon
    
* Mais on a toujours pas vérifié si c'est une Vespa, non?

## Transtypage

<center>
<video width="50%" src="05.mp4" type="video/mp4" controls>
</center>

* Transtype (*casting*) veut dire changer le type

* Pour accéder à une méthode de `Mobilette` il faut changer le type de `vehicule`

    $[java ./polymorphisme 21 32]()

* Avant d'accéder à la méthode `marqueDeMobilette` on change le type vers `Mobilette`

* L'opérateur est `(Mobilette)`, ou en général: `(NOUVEAU_TYPE)`

* On pourrait aussi écrire, sur une ligne:

    $[java ./polymorphisme 34 34]()

* À noter qu'un transtypage erroné va provoquer une erreur d'exécution:

    $[java ./polymorphisme 36 37]()

<!--

<center>
<video width="50%" src="03.mp4" type="video/mp4" controls>
</center>

-->
