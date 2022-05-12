# Question 01

Pour les méthodes de l'accepteur, indiquer chaque fragment de code qui est nécessaire pour implanter la méthode.

Choisir `∅` si le fragment n'est pas utile.


<pre>

public boolean accepterLesChats(Animal animal):
    {1:MCS:=animal instanceof Chat~∅}
    {1:MCS:((Chat) animal)~=∅}
    {1:MCS:((ChatGouttiere) animal)~=∅}
    {1:MCS:((ChatPersan) animal)~=∅}
    {1:MCS:animal instanceof Chien~=∅}
    {1:MCS:((Chien) animal)~=∅}
    {1:MCS:((Bouledogue) animal)~=∅}
    {1:MCS:((Dalmatien) animal)~=∅}
    {1:MCS:((Sishtzu) animal)~=∅}

public boolean accepterLesBonsChasseurs(Animal animal):
    {1:MCS:=animal instanceof Chat~∅}
    {1:MCS:=((Chat) animal).nombreOiseauxAttrapes()~∅}
    {1:MCS:animal instanceof Chien~=∅}
    {1:MCS:((Chien) animal)~=∅}
    {1:MCS:((Bouledogue) animal)~=∅}
    {1:MCS:((Dalmatien) animal)~=∅}
    {1:MCS:((Sishtzu) animal)~=∅}

public boolean accepterLesJappeurs(Animal animal):
    {1:MCS:animal instanceof Chat~=∅}
    {1:MCS:((Chat) animal)~=∅}
    {1:MCS:((ChatGouttiere) animal)~=∅}
    {1:MCS:((ChatPersan) animal)~=∅}
    {1:MCS:=animal.typeDeCri()~∅}
    
</pre>

