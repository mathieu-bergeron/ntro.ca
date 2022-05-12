---
title: ""
weight: 1
bookHidden: true
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
.pseudo {
    -webkit-touch-callout: text;
    -webkit-user-select: text;
    -khtml-user-select: text;
    -moz-user-select: text;
    -ms-user-select: text;
    user-select: text;
}
</style>


# Quelle opération prend une boucle pour Naive

Considérer `ListeJavaNaive`, l'implémentation naïve d'une liste présentée dans la théorie.

Pour chaque opération, indiquer:

* Une boucle n'est jamais requise
* Une boucle est rarement requise
* Une boucle est toujours requise


<table>
<tr>
<td>
<code>
add(E e); // ajouter à la fin
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
<tr>
<td>
<code>
addAll(E[] elements); // ajouter plusieurs éléments
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
<tr>
<td>
<code>
insert(int position, E e); // insérer au milieu
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
<tr>
<td>
<code>
set(int position, E e); // modifier un élément
</code>
</td>
<td>
Une boucle n'est jamais requise
</td>
</tr>
<tr>
<td>
<code>
get(int position); // obtenir un élément
</code>
</td>
<td>
Une boucle n'est jamais requise
</td>
</tr>
<tr>
<td>
<code>
clear(); // vider la liste
</code>
</td>
<td>
Une boucle n'est jamais requise
</td>
</tr>
<tr>
<td>
<code>
size(); // taille de la liste
</code>
</td>
<td>
Une boucle n'est jamais requise
</td>
</tr>
<tr>
<td>
<code>
isEmpty(); // si liste vide
</code>
</td>
<td>
Une boucle n'est jamais requise
</td>
</tr>
<tr>
<td>
<code>
contains(Object o); // si la liste contient un certain élément
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
<tr>
<td>
<code>
indexOf(Object o); // position d'un certain élément dans la liste
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
<tr>
<td>
<code>
removeValue(Object o); // retirer un élément (par valeur)   
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
<tr>
<td>
<code>
remove(int position); // retirer un élément (par position)
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
</table>


<!--

public abstract void    add(E e);                   // ajoute à la fin
public abstract void    addAll(E[] elements);       // insère tout
public abstract void    insert(int position, E e);  // insère une nouvelle valeur à la position i
public abstract void    set(int position, E e);     // modifie la valeur à la position i
public abstract E       get(int position);          // obtenir la valeur à la position i
public abstract void    clear();                    // vide la liste
public abstract int     size();                     // taille de la liste
public abstract boolean isEmpty();                  // si vide
public abstract boolean contains(Object o);         // si la liste contient la valeur o
public abstract int     indexOf(Object o);          // indice de la valeur o
public abstract void    removeValue(Object o);      // indice de la valeur o
public abstract void    remove(int position);       // indice de la valeur o

-->

# Quelle opération prend une boucle pour Array

Considérer `ListeJavaArray`, l'implémentation efficace d'une liste présentée dans la théorie.

Pour chaque opération, indiquer:

* Une boucle n'est jamais requise
* Une boucle est rarement requise
* Une boucle est toujours requise (mais pourrait dans certains cas faire pas ou peu d'itérations)

<table>
<tr>
<td>
<code>
add(E e); // ajouter à la fin
</code>
</td>
<td>
Une boucle est rarement requise
</td>
</tr>
<tr>
<td>
<code>
addAll(E[] elements); // ajouter plusieurs éléments
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
<tr>
<td>
<code>
insert(int position, E e); // insérer au milieu
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
<tr>
<td>
<code>
set(int position, E e); // modifier un élément
</code>
</td>
<td>
Une boucle n'est jamais requise
</td>
</tr>
<tr>
<td>
<code>
get(int position); // obtenir un élément
</code>
</td>
<td>
Une boucle n'est jamais requise
</td>
</tr>
<tr>
<td>
<code>
clear(); // vider la liste
</code>
</td>
<td>
Une boucle n'est jamais requise
</td>
</tr>
<tr>
<td>
<code>
size(); // taille de la liste
</code>
</td>
<td>
Une boucle n'est jamais requise
</td>
</tr>
<tr>
<td>
<code>
isEmpty(); // si liste vide
</code>
</td>
<td>
Une boucle n'est jamais requise
</td>
</tr>
<tr>
<td>
<code>
contains(Object o); // si la liste contient un certain élément
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
<tr>
<td>
<code>
indexOf(Object o);  // position d'un certain élément dans la liste
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
<tr>
<td>
<code>
removeValue(Object o); // retirer un élément (par valeur)   
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
<tr>
<td>
<code>
remove(int position); // retirer un élément (par position)
</code>
</td>
<td>
Une boucle est toujours requise
</td>
</tr>
</table>

# Efficacité selon certaines situations

Considérer `ListeJavaArray`, l'implémentation (relativement) efficace d'une liste présentée dans la théorie.

Pour chaque scénario ci-bas, indiquer si:

* L'opération est efficace, en particulier:
    * aucune boucle n'est requise
    * OU une boucle est rarement requise
    * OU une boucle est requise, mais elle fera pas ou peu d'itérations
* L'opération est inefficace

<table>
<tr>
<td>
retirer un élément à la fin
</td>
<td>
Efficace
</td>
</tr>
<tr>
<td>
modifier un élément n'importe où
</td>
<td>
Efficace
</td>
</tr>
<tr>
<td>
ajouter un élément à la fin
</td>
<td>
Efficace
</td>
</tr>
<tr>
<td>
insérer un élément au début
</td>
<td>
Inefficace
</td>
</tr>
<tr>
<td>
retirer un élément n'importe où
</td>
<td>
Inefficace
</td>
</tr>
<tr>
<td>
insérer un élément n'importe où
</td>
<td>
Inefficace
</td>
</tr>
<tr>
<td>
retirer un élément au début
</td>
<td>
Inefficace
</td>
</tr>
<tr>
<td>
retirer un élément à la fin
</td>
<td>
Efficace
</td>
</tr>
<tr>
</table>

# Efficacité selon certaines situations (2)

Considérer `ListeJavaDebut`, qui est similaire à `ListeJavaArray`, sauf que:

* L'espace vide est **au début** du tableau
* Plutôt que `indiceDernierElement`, on a:
    * `indicePremierElement` qui mémorise où se situe réellement le **premier element**

<br>

Pour chaque scénario ci-bas, indiquer si:

* L'opération est efficace, en particulier:
    * aucune boucle n'est requise
    * OU une boucle est rarement requise
    * OU une boucle est requise, mais elle fera pas ou peu d'itérations
* L'opération est inefficace

<table>
<tr>
<td>
retirer un élément à la fin
</td>
<td>
Inefficace
</td>
</tr>
<tr>
<td>
modifier un élément n'importe où
</td>
<td>
Efficace
</td>
</tr>
<tr>
<td>
ajouter un élément à la fin
</td>
<td>
Inefficace
</td>
</tr>
<tr>
<td>
insérer un élément au début
</td>
<td>
Efficace
</td>
</tr>
<tr>
<td>
retirer un élément n'importe où
</td>
<td>
Inefficace
</td>
</tr>
<tr>
<td>
insérer un élément n'importe où
</td>
<td>
Inefficace
</td>
</tr>
<tr>
<td>
retirer un élément au début
</td>
<td>
Efficace
</td>
</tr>
<tr>
<td>
retirer un élément à la fin
</td>
<td>
Inefficace
</td>
</tr>
<tr>
</table>
