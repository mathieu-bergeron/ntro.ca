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


# Arbre binaire valide ou pas valide

Indiquer s'il s'agit:

* d'un arbre binaire de recherche valide
* d'un arbre, mais pas un arbre binaire de recherche
* même pas un arbre


# JSON valide

Indiquer s'il s'agit de JSON valide

<table>
<tr>
<td><code>[[]]</code></td>
<td>Valide</td>
</tr>

<tr>
<td><code>[1,2,[3,4]]</code></td>
<td>Valide</td>
</tr>

<tr>
<td><code>{[]}</code></td>
<td>Non valide</td>
</tr>

<tr>
<td><code>{"a":[], "b":{}}</code></td>
<td>Valide</td>
</tr>

<tr>
<td><code>{"a":[3,null,true,{"b":false}]}</code></td>
<td>Valide</td>
</tr>

<tr>
<td><code>{"a":1]</code></td>
<td>Non valide</td>
</tr>

<tr>
<td><code>["a":0, "b":3]</code></td>
<td>Non valide</td>
</tr>

<tr>
<td><code>[{}]</code></td>
<td>Valide</td>
</tr>
</table>


# Exemples de chargement d'une valeur (resteDuTexte)


* Pour chaque appel de méthode ci-bas, indiquer:
    * la valeur retournée si c'est le cas
    * qu'il y a une exception `ErreurDeChargement` sinon

<br>

* NOTES:
    * le `texteJson` est parfois écrit entre guillemets simples pour éviter d'écrire `\"`
    * on utilise les variables ci-bas:

<pre>
MaListeJson liste = new MaListeJson();
MonObjetJson objet = new MonObjetJson();
</pre>

<table>

<tr>
<td><code>liste.chargerEtRetournerResteDuTexte("null,1]")</code></td>
<td><code>ErreurDeChargement</code></td>
</tr>

<tr>
<td><code>liste.chargerEtRetournerResteDuTexte("[0,1]")</code></td>
<td><code>""</code></td>
</tr>

<tr>
<td><code>liste.chargerEtRetournerResteDuTexte("[1,2],3,4,5]")</code></td>
<td><code>",3,4,5]"</code></td>
</tr>

<tr>
<td><code>objet.chargerEtRetournerResteDuTexte('{"a":123, "b":false}')</code></td>
<td><code>""</code></td>
</tr>

<tr>
<td><code>objet.chargerEtRetournerResteDuTexte('0.1235, "cle02":12}')</code></td>
<td><code>ErreurDeChargement</code></td>
</tr>

<tr>
<td><code>objet.chargerEtRetournerResteDuTexte('{"a":2}, "b":false}')</code></td>
<td><code>', "b":false}'</code></td>
</tr>

</table>



