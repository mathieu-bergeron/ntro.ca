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

# Est-ce un arbre binaire équilibré? (ou pas un arbre)

* Pour chaque schéma ci-bas, indiquer si:
    * c'est un arbre binaire de recherche équilibré
    * c'est un arbre binaire de recherche, mais pas équilibré
    * ce n'est pas un arbre binaire de recherche


<table>
<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q01/01.svg"/>
</td>
<td>
Équilibré
</td>
</tr>


<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q01/02.svg"/>
</td>
<td>
Pas équilibré
</td>
</tr>

<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q01/03.svg"/>
</td>
<td>
Pas équilibré
</td>
</tr>

<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q01/03.svg"/>
</td>
<td>
Pas équilibré
</td>
</tr>

<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q01/_01.svg"/>
</td>
<td>
Pas un arbre binaire de recherche
</td>
</tr>

<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q01/_02.svg"/>
</td>
<td>
Pas un arbre binaire de recherche
</td>
</tr>

<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q01/_03.svg"/>
</td>
<td>
Pas un arbre binaire de recherche
</td>
</tr>

<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q01/_04.svg"/>
</td>
<td>
Pas un arbre binaire de recherche
</td>
</tr>



</table>

# Est-ce une rotation gauche/droite ou droite/gauche (ou invalide)

* Pour chaque exemple, indiquer si:
    * il s'agit d'une rotation gauche-droite
    * il s'agit d'une rotation droite-gauche
    * ce n'est pas une rotation

<table>
<tr>
<th>Avant rotation</th>
<th>Après rotation</th>
</tr>
<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q02/01.svg"/>
</td>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q02/02.svg"/>
</td>
</tr>
</table>

Rotation gauche-droite

<br>
<br>
<br>



<table>
<tr>
<th>Avant rotation</th>
<th>Après rotation</th>
</tr>
<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q02/02.svg"/>
</td>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q02/01.svg"/>
</td>
</tr>
</table>

Rotation droite-gauche


<br>
<br>
<br>

<table>
<tr>
<th>Avant rotation</th>
<th>Après rotation</th>
</tr>
<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q02/03.svg"/>
</td>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q02/04.svg"/>
</td>
</tr>
</table>

Rotation gauche-droite


<br>
<br>
<br>

<table>
<tr>
<th>Avant rotation</th>
<th>Après rotation</th>
</tr>
<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q02/04.svg"/>
</td>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q02/03.svg"/>
</td>
</tr>
</table>

Rotation droite-gauche

<br>
<br>
<br>


<table>
<tr>
<th>Avant rotation</th>
<th>Après rotation</th>
</tr>
<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q02/01.svg"/>
</td>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q02/_02.svg"/>
</td>
</tr>
</table>

Invalide

<br>
<br>
<br>


<table>
<tr>
<th>Avant rotation</th>
<th>Après rotation</th>
</tr>
<tr>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q02/03.svg"/>
</td>
<td>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/mini_test_theorie/q02/_04.svg"/>
</td>
</tr>
</table>

Invalide



# Signatures d'un map avec arbre

* Considérer le map avec arbre:

    <center>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/theorie/arbre_paires.svg"/>
    </center>

<br>

* En choisissant les bonnes options, compléter la classe `PairePourMap<K,V>` où:
    * `K` est le type des clés
    * `V` est le type des valeurs

<br>

* Choisir `∅` si l'option n'est pas utile.

    $[java ./PairePourMap]()
