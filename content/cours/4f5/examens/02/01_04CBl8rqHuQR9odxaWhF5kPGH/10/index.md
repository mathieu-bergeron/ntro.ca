---
title: ""
weight: 1
bookHidden: true
---


---
title: ""
weight: 1
# bookFlatSection: false
# bookToc: false
# bookHidden: false
# bookCollapseSection: false
# bookComments: false
# bookSearchExclude: false
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

Pour chaque classe ci-bas, indiquer où la classe devrait se situer dans l'arborescence de l'application de dessin collaboratif. 

Indiquer aussi pourquoi.

* Choisir `∅` si une option n'est pas nécessaire

<br>
<br>
<br>
<br>

La classe `ModeleFileAttente` 

* devrait être placée dans le paquet `dessin.{1:MCS:=.modeles~.dorsal~.frontal~.messages~.taches~.evenements~.vues~.monde_dessin2d~.valeurs}{1:MCS:.taches~.evenements~.vues~.monde_dessin2d~.valeurs~.modeles~.dorsal~.frontal~=∅}{1:MCS:.controles~.donnees~.fragments~=∅}`
* puisque la classe
    * {1:MCS:=contient des données utilisées par~∅}{1:MCS:=le frontal~une vue~∅}{1:MCS:=et~du frontal~∅}{1:MCS:=le dorsal~∅}
    * {1:MCS:contient des tâches exécutées par~=∅}{1:MCS:le frontal~=∅}{1:MCS:et~=∅}{1:MCS:le dorsal~=∅}

<br>
<br>
<br>
<br>

La classe `AfficherFileAttente` 

* devrait être placée dans le paquet `dessin.{1:MCS:.modeles~.dorsal~=.frontal~.messages~.taches~.evenements~.vues~.monde_dessin2d~.valeurs}{1:MCS:=.taches~.evenements~.vues~.monde_dessin2d~.valeurs~.modeles~.dorsal~.frontal~∅}{1:MCS:.controles~.donnees~.fragments~=∅}`
* puisque la classe
    * {1:MCS:contient des données utilisées par~=∅}{1:MCS:le frontal~une vue~=∅}{1:MCS:et~du frontal~=∅}{1:MCS:le dorsal~=∅}
    * {1:MCS:=contient des tâches exécutées par~∅}{1:MCS:=le frontal~∅}{1:MCS:et~=∅}{1:MCS:le dorsal~=∅}

<br>
<br>
<br>
<br>

La classe `DonneesVueFileAttente` 

* devrait être placée dans le paquet `dessin.{1:MCS:.modeles~.dorsal~=.frontal~.messages~.taches~.evenements~.vues~.monde_dessin2d~.valeurs}{1:MCS:.taches~.evenements~=.vues~.monde_dessin2d~.valeurs~.modeles~.dorsal~.frontal~∅}{1:MCS:.controles~=.donnees~.fragments~∅}`
* puisque la classe
    * {1:MCS:=contient des données utilisées par~∅}{1:MCS:le frontal~=une vue~∅}{1:MCS:et~=du frontal~∅}{1:MCS:le dorsal~=∅}
    * {1:MCS:contient des tâches exécutées par~=∅}{1:MCS:le frontal~=∅}{1:MCS:et~=∅}{1:MCS:le dorsal~=∅}

<br>
<br>
<br>
<br>

La classe `ModifierFileAttente` 

* devrait être placée dans le paquet `dessin.{1:MCS:.modeles~=.dorsal~.frontal~.messages~.taches~.evenements~.vues~.monde_dessin2d~.valeurs}{1:MCS:=.taches~.evenements~.vues~.monde_dessin2d~.valeurs~.modeles~.dorsal~.frontal~∅}{1:MCS:.controles~.donnees~.fragments~=∅}`
* puisque la classe
    * {1:MCS:contient des données utilisées par~=∅}{1:MCS:le frontal~une vue~=∅}{1:MCS:et~du frontal~=∅}{1:MCS:le dorsal~=∅}
    * {1:MCS:=contient des tâches exécutées par~∅}{1:MCS:le frontal~=∅}{1:MCS:et~=∅}{1:MCS:=le dorsal~∅}
