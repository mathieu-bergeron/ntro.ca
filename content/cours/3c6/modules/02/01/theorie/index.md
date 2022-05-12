---
title: ""
weight: 1
bookHidden: true
---


# Code de librairie Vs code d'application

<center>
<video width="50%" src="01.mp4" type="video/mp4" controls>
</center>

1. Code de librairie: classes conçues pour être utilisées dans plusieurs programmes
1. Code d'application: classes spécifiques à un programme



## Programmeur de librairie Vs programmeur d'application

<center>
<video width="50%" src="02.mp4" type="video/mp4" controls>
</center>

* Pour comprendre la différence, imaginer trois programmeurs:
    1. **Alice** programme la librairie `art.jar` qui fait de l'<a href="https://fr.wikipedia.org/wiki/Art_ASCII" target="_blank">art ascii</a>
    1. **Bob** programme `banner` qui affiche des messages:


            ######   #######  #     #        #  #######  #     #  ######   
            #     #  #     #  ##    #        #  #     #  #     #  #     #  
            #     #  #     #  # #   #        #  #     #  #     #  #     #  
            ######   #     #  #  #  #        #  #     #  #     #  ######   
            #     #  #     #  #   # #  #     #  #     #  #     #  #   #    
            #     #  #     #  #    ##  #     #  #     #  #     #  #    #   
            ######   #######  #     #   #####   #######   #####   #     #  

                
    1. **Charles** programme `cowsay` qui affiche des bulles de dialogue:

             _________
            < Bonjour >
             ---------
                    \   ^__^
                     \  (oo)\_______
                        (__)\       )\/\
                            ||----w |
                            ||     ||


* Sans connaître à l'avance le code que Bob et Charles vont écrire, 
   comment Alice peut-elle écrire du code utile pour les deux?

* La clé réside dans la notion de contrat ($[link ../../../01/03/theorie/](théorie 1.3))

* C'est comme si Alice disait:
    * Pour utiliser mon code de librairie, vous devez définir:
        * Une classe `Dessin` avec les méthodes suivantes:
            * `int obtenirLargeur()`
            * `int obtenirHauteur()`
            * `char obtenirSymbole(int x, int y)`

        * Ensuite, vous devez créer un objet `Dessin` et appeler ma méthode:
            * `afficherDessin(Dessin dessin)`

* Bob et Charles doivent remplir le contrat.

* Par exemple, Bob pourrait se dire:
    * J'ai un `String message` que je veux afficher en gros
    * Je vais créer ma classe `Message extends Dessin`
        * ma méthode `obtenirHauteur` va retourner `7`
        * ma méthode `obtenirLargeur` va retourner `message.length() * 5`
        * ma méthode `obtenirSymbole(int x, int y)` va:
            * chercher de quel lettre il s'agit
            * chercher dans cette lettre quel caractère afficher
            * retourner ce caractère
    * Je vais ensuite appeler `afficherDessin(new Message("Bonjour"));`

* Alice peut écrire son code sans savoir *comment* Bob va remplir le contrat

* P.ex. l'appel `afficherDessin(new Message("Bonjour"))` fonctionne puisque:
    * `Message extends Dessin`, c-à-d
    * la classe `Message` se comporte comme le `Dessin` décrit par Alice

## Pour écrire du code lisible

* Un bon truc est d'écrire comme s'il s'agissait de code de librairie

* Dans ma classe `Foo`, je me demande:
    * Pour que `Foo` fonctionne, quel contrat est-ce que le reste du code doit remplir?

* Je définit ce contrat en écrivant des Interfaces et des Classes abstraites

* Ailleurs dans le programme, je remplis le contrat avec des `extends` et des `implements`

* (la théorie sur les interfaces et les classes abstraites plus tard dans le cours)

## Un exemple

<center>
<video width="50%" src="03.mp4" type="video/mp4" controls>
</center>




## Et les structures de données?

<center>
<video width="50%" src="04.mp4" type="video/mp4" controls>
</center>

* Les structures de données sont des classes de librairie

* Une classe `Tableau` doit fonctionner peu importe le contenu du tableau
    * (entiers, rééels, chaînes, objets)

* Comment définir une classe `Tableau` *générale*?

* Comment trier le tableau sans connaître le type des éléments?

* (la réponse à ces questions plus tard dans le cours)


