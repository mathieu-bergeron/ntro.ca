<style>
pre > code {
    -webkit-touch-callout: text;
    -webkit-user-select: text;
    -khtml-user-select: text;
    -moz-user-select: text;
    -ms-user-select: text;
    user-select: text;
}
.pseudo {
    -webkit-touch-callout: text;
    -webkit-user-select: text;
    -khtml-user-select: text;
    -moz-user-select: text;
    -ms-user-select: text;
    user-select: text;
}
</style>


# Questions vitesse

Pour répondre aux questions suivantes, considérer:

* Ma RAM a une vitesse de transfert de 10 000 MB/s
* Mon SSD a une vitesse de transfert de 500 MB/s
* Mon disque dur à une vitesse de transfert de 50 MB/s


Indiquer les temps d'exécution approximatifs.

* Parcourir un tableau en RAM prend 1 seconde. Combien de temps pour le même tableau sur le SSD?
    * SSD 20 fois plus lent que la RAM
    * 20 secondes

* Parcourir un tableau en RAM prend 1 seconde. Combien de temps pour le même tableau sur le disque dur?
    * HDD 200 fois plus lent
    * 200 secondes

* Parcourir un tableau sur le SSD prend 400 secondes. Combien de temps pour le même tableau en RAM?
    * RAM 20 fois plus vite
    * 20 secondes

* Parcourir un tableau sur le SSD prend 400 secondes. Combien de temps pour le même tableau sur le disque dur?
    * HDD 10 fois plus lent que SSD
    * 4000 secondes

* Parcourir un tableau sur le disque dur prend 8 000 secondes. Combien de temps pour le même tableau en RAM?
    * RAM 200 fois plus rapide
    * 40 secondes

* Parcourir un tableau sur le disque dur prend 8 000 secondes. Combien de temps pour le même tableau sur le SSD?
    * SSD 10 fois plus rapide
    * 800 secondes


# Questions structure Vs BD

Pour chaque affirmation ci-bas, indiquer s'il s'agit plutôt:

* D'une notion de structure de données
* D'une notion de base de données


* La vitesse d'exécution est souvent plus importante que l'espace mémoire utilisé

* Il faut faire très attention de ne pas gaspiller l'espace mémoire

* Je peux modifier où et comment les données sont stoquées sans que le programmeur voit la différence

* Le programmeur choisit en détail comment organiser les données

* On accède aux données directement dans le code de notre programme

* Pour accéder au données, il faut se connecter à un programme externe

* J'utilise SQL pour manipuler les données

* J'utilise Java pour manipuler les données

# Questions Écrire sur le disque

Pour répondre aux questions suivantes, considérer:

* Ma RAM a une vitesse de transfert de 10 000 MB/s
* Mon SSD a une vitesse de transfert de 500 MB/s

Considérer les méthodes suivantes:

$[java ./MethodeA]

$[java ./MethodeB]


Indiquer les temps d'exécution approximatifs:

* `rechercherRemplacerA` sur un fichier de 10 MB
    * charger: 0.02
    * parcourir:  0.001
    * écrire: 0.02
    * total: 0.041
    * environs 0.04 secondes
* `rechercherRemplacerA` sur un fichier de 100 MB
    * charger: 0.2
    * parcourir:  0.01
    * écrire: 0.2
    * total: 0.41
    * environs 0.4 secondes
* `rechercherRemplacerA` sur un fichier de 1 000 MB
    * charger: 2
    * parcourir:  0.1
    * écrire: 2
    * total: 4.1
    * environs 4 secondes

* `rechercherRemplacerB` sur un fichier de 10 MB
    * charger: 0.02
    * parcourir:  0.001
    * écrire: négligeable
    * total: 0.021
    * environs 0.02 secondes
* `rechercherRemplacerB` sur un fichier de 100 MB
    * charger: 0.2
    * parcourir:  0.01
    * écrire: négligeable
    * total: 0.21
    * environs 0.2 secondes
* `rechercherRemplacerB` sur un fichier de 1 000 MB
    * charger: 2
    * parcourir:  0.1
    * écrire: négligeable
    * total: 2.1
    * environs 2 secondes









