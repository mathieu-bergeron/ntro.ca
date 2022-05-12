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
</style>


# Coder la hauteur

* Pour équilibrer un arbre, on a besoin de la hauteur de chaque noeud
    * (pour décider si le déséquilibre est à gauche ou à droite)

* La hauteur d'un noeud est définie comme:
    * la longueur du chemin le plus long qu'on peut construire à partir du noeud

* Considérer l'interface `Noeud<C>`

    $[java ./Noeud]()

* Considérer par exemple l'arbre suivant:

    <center>
        <img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/05/04/entrevue/hauteur.svg"/>
    </center>
       
    * La hauteur du noeud `3` est `3` (chemin: `3->1->0` ou `3->1->2`)
    * La hauteur du noeud `1` est `2` (chemin: `1->0` ou `1->2`)
    * La hauteur du noeud `5` est `1` (chemin: `5`)

* Compléter la méthode qui calcule la hauteur:

<pre class="language-java">
<code class="language-java">
public int hauteur(Noeud&lt;C&gt; noeud){
    int hauteur = 0;

    // À COMPLÉTER

    return hauteur;
}
</code>
</pre>


* Recopier votre code ci-bas:


