# Comprhension abstrait et interface

Pour chaque type de l'atelier 2.5, choisir la ou les affirmations correctes. Choisir `∅` si l'affirmation n'est pas correcte.

* `Animal`
    * {1:MCS:=La classe est abstraite parce qu'on veut qu'un animal spécifie aussi l'espèce et la race~∅}
    * {1:MCS:La classe n'implante aucune interface. Ce sera fait dans les sous-classes~=∅}
    * {1:MCS:=C'est cette classe qui implante les interfaces. Les méthodes publiques seront ensuites héritées ou redéfinies dans les sous-classes.~∅}
    * {1:MCS:La classe contient uniquement des méthodes abstraites~=∅}
    * {1:MCS:=Une méthode abstraite dans cette classe retourne de l'information spécifique à l'espèce ou la race~∅}
    * {1:MCS:On peut créer un objet `Animal`~=∅}
    * {1:MCS:On peut appeler des méthodes de `Animal`~=∅}
* `Chat`
    * `{1:MCS:=La classe est abstraite parce qu'on veut qu'un chat spécifie aussi la race~∅}`
    * {1:MCS:=La classe n'implante aucune interface. C'est déjà fait dans une classe parent~∅}
    * {1:MCS:C'est cette classe qui implante les interfaces. Les méthodes publiques seront ensuites héritées ou redéfinies dans les sous-classes.~=∅}
    * {1:MCS:La classe contient uniquement des méthodes abstraites~=∅}
    * {1:MCS:=Une méthode abstraite dans cette classe retourne de l'information spécifique à la race de chat~∅}
    * {1:MCS:On peut créer un objet `Chat`~=∅}
    * {1:MCS:=On peut appeler des méthodes de `Chat`~∅}
* `Chien`
    * `{1:MCS:=La classe est abstraite parce qu'on veut qu'un chien spécifie aussi la race~∅}`
    * {1:MCS:=La classe n'implante aucune interface. C'est déjà fait dans une classe parent~∅}
    * {1:MCS:C'est cette classe qui implante les interfaces. Les méthodes publiques seront ensuites héritées ou redéfinies dans les sous-classes.~=∅}
    * {1:MCS:La classe contient uniquement des méthodes abstraites~=∅}
    * {1:MCS:=Une méthode abstraite dans cette classe retourne de l'information spécifique à la race de chien~∅}
    * {1:MCS:On peut créer un objet `Chien`~=∅}
    * {1:MCS:=On peut appeler des méthodes de `Chien`~∅}


# Questions précises

En sélectionnant les bonnes options, construire des signatures valides pour l'atelier 2.5.

Chosir `∅` si l'option n'est pas valide.

<pre>
public {1:MCS:=abstract~∅} {1:MCS:=class~∅} Animal {1:MCS:extends~=∅} {1:MCS:Dormeur~Chat~=∅}{1:MCS: , ~=∅}{1:MCS:Formateur~Chien~=∅} {1:MCS:=implements~∅} {1:MCS:=Dormeur~∅}{1:MCS:= , ~∅}{1:MCS:=Formateur~∅} {




    {1:MCS:=@Override~∅}
    public {1:MCS:abstract~=∅} void dormir(int heures) {1:MCS:={/*...*/\}~;}




    {1:MCS:=@Override~∅}
    public {1:MCS:abstract~=∅} String formater() {1:MCS:={/*...*/\}~;}




    {1:MCS:@Override~=∅}
    protected {1:MCS:=abstract~∅} String typeDeCri() {1:MCS:{/*...*/\}~=;}




    {1:MCS:@Override~=∅}
    protected {1:MCS:=abstract~∅} String nomAnimal() {1:MCS:{/*...*/\}~=;}




    {1:MCS:@Override~=∅}
    protected {1:MCS:=abstract~∅} int heuresMinimalesDeSommeil() {1:MCS:{/*...*/\}~=;}
}






public {1:MCS:=abstract~∅} {1:MCS:=class~∅} Chat {1:MCS:=extends~∅} {1:MCS:Dormeur~=Animal~∅}{1:MCS: , ~=∅}{1:MCS:Formateur~=∅} {1:MCS:implements~=∅} {1:MCS:Dormeur~=∅}{1:MCS: , ~=∅}{1:MCS:Formateur~=∅} {


    {1:MCS:=@Override~∅}
    protected {1:MCS:abstract~=∅} int heuresMinimalesDeSommeil() {1:MCS:={/*...*/\}~;}


    {1:MCS:=@Override~∅}
    protected {1:MCS:abstract~=∅} String typeDeCri() {1:MCS:={/*...*/\}~;}





}
</pre>


