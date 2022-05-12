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


# JSON valide

Indiquer s'il s'agit de JSON valide

<table>
<tr>
<td><code>null</code></td>
<td>Valide</td>
</tr>

<tr>
<td><code>[1,2,3]</code></td>
<td>Valide</td>
</tr>

<tr>
<td><code>[x,y,z]</code></td>
<td>Non valide</td>
</tr>

<tr>
<td><code>[]</code></td>
<td>Valide</td>
</tr>

<tr>
<td><code>{"hauteur":null, "largeur":10}</code></td>
<td>Valide</td>
</tr>

<tr>
<td><code>{hauteur:20, largeur:10}</code></td>
<td>Non valide</td>
</tr>

<tr>
<td><code>{"hauteur",20:"largeur",10}</code></td>
<td>Non valide</td>
</tr>

<tr>
<td><code>"chaine</code></td>
<td>Non valide</td>
</tr>

<tr>
<td><code>"chaine"</code></td>
<td>Valide</td>
</tr>

<tr>
<td><code>-0.12</code></td>
<td>Valide</td>
</tr>

<tr>
<td><code>-12/100</code></td>
<td>Non valide</td>
</tr>


</table>

# Version Java d'un JSON Valide


## Question 1/2

* Constuire la version Java du JSON suivant: `[0,null,true,"ah"]`

* Choisir `∅` si l'option n'est pas utile.

$[java ./Q1]()

## Question 2/2

* Constuire la version Java du JSON suivant: `{"0":null,"1":true,"2":"ah"}`

* Choisir `∅` si l'option n'est pas utile.

$[java ./Q2]()

# Exemples de chargement d'une valeur (resteDuTexte)

* Pour chaque appel de méthode ci-bas, indiquer:
    * la valeur retournée si c'est le cas
    * qu'il y a une exception `ErreurDeChargement` sinon

<br>

* NOTES:
    * le `texteJson` est parfois écrit entre guillemets simples pour éviter d'écrire `\"`
    * on utilise les variables ci-bas:

<pre>
MonNullJson nullJson = new MonNullJson();
MonBooleenJson booleenJson = new MonBooleenJson();
MonNombreJson nombreJson = new MonNombreJson();
MaChaineJson chaineJson = new MaChaineJson();
</pre>

<table>

<tr>
<td><code>nullJson.chargerEtRetournerResteDuTexte("null,1]")</code></td>
<td><code>",1]"</code></td>
</tr>

<tr>
<td><code>nullJson.chargerEtRetournerResteDuTexte("0,1]")</code></td>
<td><code>ErreurDeChargement</code></td>
</tr>

<tr>
<td><code>booleenJson.chargerEtRetournerResteDuTexte("true")</code></td>
<td><code>""</code></td>
</tr>

<tr>
<td><code>booleenJson.chargerEtRetournerResteDuTexte("null,1]")</code></td>
<td><code>ErreurDeChargement</code></td>
</tr>

<tr>
<td><code>nombreJson.chargerEtRetournerResteDuTexte('0.1235,"cle02":12}')</code></td>
<td><code>',"cle02":12}'</code></td>
</tr>

<tr>
<td><code>nombreJson.chargerEtRetournerResteDuTexte("[3,false]")</code></td>
<td><code>ErreurDeChargement</code></td>
</tr>

<tr>
<td><code>chaineJson.chargerEtRetournerResteDuTexte('"cle02":12}')</code></td>
<td><code>":12}"</code></td>
</tr>

<tr>
<td><code>chaineJson.chargerEtRetournerResteDuTexte('"cle02')</code></td>
<td><code>ErreurDeChargement</code></td>
</tr>


</table>



