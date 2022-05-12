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

# Quelle est la taille de chaque map naïf après chaque insertion

* Considérer les clés suivantes:

<pre class="language-java">
<code class="language-java">
CleHashable cle01 = new CleHashable([]);
CleHashable cle02 = new CleHashable([0,1,3]);
CleHashable cle03 = new CleHashable([1,2,2]);
</code>
</pre>

* Considérer la fonction de hachage suivante:

<pre class="language-java">
<code class="language-java">
private int[] valeurs;

public int indice(){
    indice = 0;

    if(valeurs.length > 0){
        indice += valeurs[0];
        indice += valeurs[valeur.length-1];
    }

    return indice;
}
    
</code>
</pre>

* Considérer la table de hachage suivante:

<pre class="language-java">
<code class="language-java">
MapJava<CleHashable,String>[] table = new MapJava<>[4];
</code>
</pre>

* Les `put` ci-bas sont fait *dans l'ordre*

* Indiquer la taille de chaque map naïf après chaque `put`

<table>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
map.put(cle01, "asdf");
</code>
</pre>
</td>
<td>
<pre class="language-java">
<code class="language-java">
table[0].size() == {1:MCS:0~=1~2~3~4~5}
table[1].size() == {1:MCS:=0~1~2~3~4~5}
table[2].size() == {1:MCS:=0~1~2~3~4~5}
table[3].size() == {1:MCS:=0~1~2~3~4~5}
</code>
</pre>
</td>
</tr>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
map.put(cle02, "2poiu");
</code>
</pre>
</td>
<td>
<pre class="language-java">
<code class="language-java">
table[0].size() == {1:MCS:0~=1~2~3~4~5}
table[1].size() == {1:MCS:=0~1~2~3~4~5}
table[2].size() == {1:MCS:=0~1~2~3~4~5}
table[3].size() == {1:MCS:0~=1~2~3~4~5}
</code>
</pre>
</td>
</tr>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
map.put(cle03, "2..");
</code>
</pre>
</td>
<td>
<pre class="language-java">
<code class="language-java">
table[0].size() == {1:MCS:0~=1~2~3~4~5}
table[1].size() == {1:MCS:=0~1~2~3~4~5}
table[2].size() == {1:MCS:=0~1~2~3~4~5}
table[3].size() == {1:MCS:0~1~=2~3~4~5}
</code>
</pre>
</td>
</tr>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
map.put(cle01, "56q2");
</code>
</pre>
</td>
<td>
<pre class="language-java">
<code class="language-java">
table[0].size() == {1:MCS:0~=1~2~3~4~5}
table[1].size() == {1:MCS:=0~1~2~3~4~5}
table[2].size() == {1:MCS:=0~1~2~3~4~5}
table[3].size() == {1:MCS:0~1~=2~3~4~5}
</code>
</pre>
</td>
</tr>


<tr>
<td>
<pre class="language-java">
<code class="language-java">
map.put(cle02, "2sdsdf");
</code>
</pre>
</td>
<td>
<pre class="language-java">
<code class="language-java">
table[0].size() == {1:MCS:0~=1~2~3~4~5}
table[1].size() == {1:MCS:=0~1~2~3~4~5}
table[2].size() == {1:MCS:=0~1~2~3~4~5}
table[3].size() == {1:MCS:0~1~=2~3~4~5}
</code>
</pre>
</td>
</tr>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
map.put(cle03, "!!");
</code>
</pre>
</td>
<td>
<pre class="language-java">
<code class="language-java">
table[0].size() == {1:MCS:0~=1~2~3~4~5}
table[1].size() == {1:MCS:=0~1~2~3~4~5}
table[2].size() == {1:MCS:=0~1~2~3~4~5}
table[3].size() == {1:MCS:0~1~=2~3~4~5}
</code>
</pre>
</td>
</tr>




</table>






# Fonction de hachage valide ou pas

Pour chaque fonction de hachage ci-bas, indiquer:

* il s'agit d'une fonction de hachage valide
* il ne s'agit **pas** d'une fonction de hachage valide

<table>
<tr>
<td>
<pre class="language-java">
<code class="language-java">
private String valeur;

public int indice(){
    return 0;
}
</code>
</pre>
</td>
<td>
Valide
</td>
</tr>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
private String valeur;

public int indice(){
    int indice = 0;

    if(valeur.length() > 2){
        indice = (int) (valeur.charAt(0) + valeur.charAt(1));
    }

    return indice;
}
</code>
</pre>
</td>
<td>
Valide
</td>
</tr>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
private char[] valeurs;

public int indice(){
    return valeurs.length;
}
</code>
</pre>
</td>
<td>
Valide
</td>
</tr>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
private char[] valeurs;

public int indice(String nomUsager){
    return valeurs.length + nomUsager.length();
}
</code>
</pre>
</td>
<td>
Non valide
</td>
</tr>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
private boolean valeur;

public int indice(){
    int indice = alea.nextInt(100);
    if(valeur){
        indice = 0;
    }
    return indice;
}
</code>
</pre>
</td>
<td>
Non valide
</td>
</tr>




</table>

# Fonction de hachage efficace ou pas

Pour chaque fonction de hachage ci-bas, indiquer:

* il s'agit d'une fonction de hachage efficace
* il ne s'agit **pas** d'une fonction de hachage efficace
* il ne s'agit **même pas** d'une fonction de hachage valide

<table>
<tr>
<td>
<pre class="language-java">
<code class="language-java">
private String valeur;

public int indice(){
    return new (int) Date().getTime();
}
</code>
</pre>
</td>
<td>
Non valide
</td>
</tr>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
private String valeur;

public int indice(){
    int indice = 0;

    for(int i = 2; i < 12; i++){
        int indiceChar = valeur.length() / i;
        if(indiceChar < valeur.length()){
            indice += (int) valeur.charAt(i);
        }
    }

    return indice;
}
</code>
</pre>
</td>
<td>
Efficace
</td>
</tr>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
private char[] valeurs;

public int indice(){
    return 0;
}
</code>
</pre>
</td>
<td>
Inefficace
</td>
</tr>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
private char[] valeurs;

public int indice(String nomUsager){
    return valeurs.length + nomUsager.length();
}
</code>
</pre>
</td>
<td>
Non valide
</td>
</tr>

<tr>
<td>
<pre class="language-java">
<code class="language-java">
private boolean valeur;

public int indice(){
    int indice = 0;
    if(valeur){
        indice = 1;
    }
    return indice;
}
</code>
</pre>
</td>
<td>
Efficace
</td>
</tr>




</table>


