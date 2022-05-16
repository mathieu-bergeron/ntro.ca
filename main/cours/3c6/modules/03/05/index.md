---
title: ""
weight: 1
bookHidden: true
---


# La récursivité


<center>
<video width="50%" src="01.mp4" type="video/mp4" controls>
</center>

* C'est quand une `methode()` fait un appel à elle-même:

    $[java ./Ex01]()


* Le résultat est une boucle

* Plusieurs algorithmes sont plus faciles à coder de cette façon
    * c'est souvent plus proche de la définition papier (mathématique)

* Par exemple:
    * définition mathématique de la fonction factorielle:

        <pre>
        fac(0) = 1
        fac(n) = n * fac(n-1)
        </pre>

    * code Java récursif:

    $[java ./Ex02]()

    * NOTE: le prof ignore volontairement le guide de style en faisant deux `return`

* Il est toujours possible de transformer des appels récursifs en boucle normale

    $[java ./Ex03]()

    * NOTE: on voit comment la code est plus loin de la définition mathématique

## Pile d'appel

<center>
<video width="50%" src="02.mp4" type="video/mp4" controls>
</center>

* La récursivité utilise la pile d'appels pour mémoriser des valeurs

* Qu'est-ce que la pile d'appels?
    * quand on fait un appel de méthode, les arguments sont stoqués sur la pile
    * quand la méthode termine, c'est retiré de la pile
    * la pile permet de revenir là où on était dans la méthode précédente

* Par exemple:

    $[java ./Pile]()

* En cas de plantage, la pile d'appel est affichée (équivalent de la ligne 24):

        Exception in thread "main" java.lang.RuntimeException
	        at Pile.C(Pile.java:15)
	        at Pile.B(Pile.java:11)
	        at Pile.A(Pile.java:6)
	        at Pile.main(Pile.java:20)



## Avantages de la récursivité

<center>
<video width="50%" src="03.mp4" type="video/mp4" controls>
</center>

* Code souvent plus simple et plus lisible

* Les boucles infinies sont détectées par des erreurs de débordement de pile 
    * en anglais: *stack overflow*

            Exception in thread "main" java.lang.StackOverflowError
                at Pile.A(Pile.java:6)
                at Pile.A(Pile.java:6)
                at Pile.A(Pile.java:6)
                at Pile.A(Pile.java:6)
                at Pile.A(Pile.java:6)
                at Pile.A(Pile.java:6)
                at Pile.A(Pile.java:6)
                at Pile.A(Pile.java:6)
                at Pile.A(Pile.java:6)
                ...


## Inconvénient de la récursivité

* Plus facile d'écrire des boucles infinies (condition d'arrêt implicite)

* En pratique, la pile d'appel est assez petite (p.ex. 1000 appels)
    * donc souvent impossible d'utiliser la récursivité sur des gros problèmes
    * (à moins que le nombre d'appels soit `O(log(n) comme pour le tri fusion)`


## Transformer en boucle normale

* On peut transformer n'importe quelle méthode récursive en boucle

* On peut écrire du code récursif pour un prototype 
    * et éliminer la récursivité pour le code de production


* Certains compilateurs peuvent éliminer automatiquement la récursivité
    * p.ex. `C++`, `Scala`, `Ocaml`
    * (il faut par contre respecter certaines règles dans l'écritude du code)


