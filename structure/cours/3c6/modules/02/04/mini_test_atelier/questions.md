---
title: ""
weight: 1
bookHidden: true
---


# Assigner les visibilités

Considérer la hiérarchie de classes de l'atelier:

<center>
<img src="hierarchie_animaux.svg" width="600px">
</center>

Pour chaque méthode, indiquer **selon l'atelier**:

* La visibilité de la méthode
* Si la méthode est redéfinie, dans quelles classes
    * choisir `∅` lorsqu'une réponse ne s'applique pas

<br>


1. La méthode `void dormir()` est `{1:MCS:~=public~protected~private}` et est redéfinie dans: 
    * `{1:MCS:~Chat~=∅}`
    * `{1:MCS:~Chien~=∅}`
    * `{1:MCS:~ChatGouttiere~=∅}`
    * `{1:MCS:~ChatPersan~=∅}`
    * `{1:MCS:~Bouledogue~=∅}`
    * `{1:MCS:~Shihtzu~=∅}`

1. La méthode `String formater()` est `{1:MCS:~=public~protected~private}` et est redéfinie dans: 
    * `{1:MCS:~Chat~=∅}`
    * `{1:MCS:~Chien~=∅}`
    * `{1:MCS:~ChatGouttiere~=∅}`
    * `{1:MCS:~ChatPersan~=∅}`
    * `{1:MCS:~Bouledogue~=∅}`
    * `{1:MCS:~Shihtzu~=∅}`

1. La méthode `String typeDeCri()` est `{1:MCS:~public~=protected~private}` et est redéfinie dans: 
    * `{1:MCS:~=Chat~∅}`
    * `{1:MCS:~=Chien~∅}`
    * `{1:MCS:~ChatGouttiere~=∅}`
    * `{1:MCS:~=ChatPersan~∅}`
    * `{1:MCS:~Bouledogue~=∅}`
    * `{1:MCS:~Shihtzu~=∅}`

1. La méthode `String nomAnimal()` est `{1:MCS:~public~=protected~private}` et est redéfinie dans: 
    * `{1:MCS:~Chat~=∅}`
    * `{1:MCS:~Chien~=∅}`
    * `{1:MCS:~=ChatGouttiere~∅}`
    * `{1:MCS:~=ChatPersan~∅}`
    * `{1:MCS:~=Bouledogue~∅}`
    * `{1:MCS:~=Shihtzu~∅}`

1. La méthode `int heuresMinimalesDeSommeil()` est `{1:MCS:~public~=protected~private}` et est redéfinie dans: 
    * `{1:MCS:~=Chat~∅}`
    * `{1:MCS:~=Chien~∅}`
    * `{1:MCS:~ChatGouttiere~=∅}`
    * `{1:MCS:~=ChatPersan~∅}`
    * `{1:MCS:~Bouledogue~=∅}`
    * `{1:MCS:~Shihtzu~=∅}`

# Compréhension attribut

Dans `Animal`, on a l'attribut suivant:

<pre>
VISIBILITÉ int heuresTotalesDeSommeil;
</pre>

Choisir chaque affirmation *vraie* au sujet de cet attribut.
Choisir `∅` si l'affirmation est fausse.

* {1:MCS:=L'attribut est `private`~∅}
* {1:MCS:L'attribut est `protected`~=∅}
* {1:MCS:L'attribut est `public`~=∅}
* {1:MCS:=L'attribut représente l'état d'un objet `Animal`~=∅}
* {1:MCS:On devrait pouvoir le modifier directement de partout dans le programme~=∅}
* {1:MCS:=En général, on modifie cet attribut indirectement, en passant par des appels de méthodes~∅}
* {1:MCS:=Garder l'attribut caché aide à écrire du code plus lisible~∅}
* {1:MCS:Rendre l'attribut public aide à penser à déléguer vers la classe `Animal`~=∅}
