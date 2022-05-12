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



# Re-coder Paire et MaPaire

En choisissant les bonnes options, compléter l'implantation d'une paire **générique**

Choisir `∅` si l'option n'est pas utile.

$[java ./Paire]()

$[java ./MaPaire]()





# Re-coder le plantage

En choisissant les bonnes options, compléter la méthode `planter` avec le **minimum** d'instructions nécessaires pour provoquer une erreur d'exécution.

Choisir `∅` si l'option n'est pas utile.

<pre>
Paire paire = new MaPaire(1, 2);
{1:MCS:=paire.~∅}{1:MCS:=modifierGauche("a");~modifierGauche(2);~modifierDroite(4);~∅}
{1:MCS:=paire.~∅}{1:MCS:=obtenirPlusPetit();~∅}
</pre>

