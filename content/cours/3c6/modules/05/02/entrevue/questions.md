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



# Coder un SegmentChaineDouble

Re-considérer la structure de donnée hybride du mini-test de l'atelier:

<center>
    <img src="exemple.svg" width="100%">
</center>

* il s'agit d'une liste chaînée double, mais chaque maillon est un segment
* un segment contient un tableau de valeurs (possiblement avec de l'espace vide)

Pour insérer une nouvelle valeur dans un segment, il y a trois cas:

1. on décale les valeurs du segment vers la droite
1. on fait 1, mais il faut aussi déplacer la dernière valeur dans le prochain segment
1. on fait 1 et 2, mais il faut d'abord créer un nouveau segment vide

Voici des exemples des trois cas pour `insert(3,'w')`:

<table>
<tr>
<th>cas
</th>
<th>avant insertion
</th>
<th>après insertion
</th>
</tr>

<tr>
<td>1
</td>
<td><img src="avant00.svg"/>
</td>
<td><img src="apres00.svg"/>
</td>
</tr>

<tr>
<td>2
</td>
<td><img src="avant01.svg"/>
</td>
<td><img src="apres01.svg"/>
</td>
</tr>

<tr>
<td>3
</td>
<td><img src="avant02.svg"/>
</td>
<td><img src="apres02.svg"/>
</td>
</tr>


</table>



<br>
<br>

   
Copier-coller le code ci-bas et le compléter (partout où il y a des `TODO`).

$[java ./SegmentChaineDouble]()
