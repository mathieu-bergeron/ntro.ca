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

En choisissant les bonnes options, compléter l'implantation d'une paire générique **avec paramètre de type**

Choisir `∅` si l'option n'est pas utile.

$[java ./Paire]()

$[java ./MaPaire]()



# Re-coder le plantage

* Choisir uniquement les options qui mènent à des **erreurs de compilation**

* Choisir `∅` si les options ne mènent pas à une erreur de compilation


<pre>
Paire{1:MCS:=⟨Integer〉~⟨String〉~∅} paireEntiers = new MaPaire<>(1, 2);
Paire{1:MCS:⟨Integer〉~=⟨String〉~∅} paireChaines = new MaPaire<>("a", "b");
{1:MCS:=paireEntiers.~∅}{1:MCS:=modifierGauche("a");~modifierGauche(2);~modifierDroite(4);~∅}
{1:MCS:paireEntiers.~=paireChaines~∅}{1:MCS:=modifierGauche(1);~∅}
{1:MCS:paireEntiers.~=∅}{1:MCS:obtenirPlusPetit();~=∅}
{1:MCS:paireChaines.~=∅}{1:MCS:obtenirPlusPetit();~=∅}
</pre>

