# Validité des constructeurs et des appels

Indiquer la validité de chaque constructeur et de chaque `new`. Choisir `∅` si le constructeur n'est pas valide.

<pre>
public class Vehicule {

    private double kilometrage;
    private String marque;

    public Vehicule(){

        this.kilometrage = 0.0;

    }{1:MCS:=Valide~∅}

    public Vehicule(double kilometrage){

        this.kilometrage = kilometrage;

    }{1:MCS:=Valide~∅}

    public Vehicule(double kilometrage, String marque){

        this.kilometrage = kilometrage;
        this.marque = marque;

    }{1:MCS:=Valide~∅}
}

public class Auto extends Vehicule {

    public Auto(){

    }{1:MCS:Valide~=∅}

    public Auto(){
        super();

    }{1:MCS:=Valide~∅}

    public Auto(){
        super(0.0);

    }{1:MCS:=Valide~∅}

    public Auto(double kilometrage){
        super(kilometrage);

    }{1:MCS:=Valide~∅}

    public Auto(double kilometrage, String marque){
        super(marque);

    }{1:MCS:Valide~=∅}

    public Auto(double kilometrage, String marque){
        super(kilometrage, marque);

    }{1:MCS:=Valide~∅}
}

public static void main(String[] args){

    new Vehicule("Nissan");        {1:MCS:Valide~=∅}
    new Auto("Tesla");             {1:MCS:Valide~=∅}

    new Vehicule(10.0);            {1:MCS:=Valide~∅}
    new Auto(12.0);                {1:MCS:=Valide~∅}

    new Vehicule(10.0, "Tesla");   {1:MCS:=Valide~∅}
    new Auto(12.0, "Nissan");      {1:MCS:=Valide~∅}
}
</pre>



# Comportement du mot clé super

Considérer le code suivant:

<pre>
public class GrandParent {

    public void afficher(){
        System.out.print("GP>");
    }

    public String formater(){
        return "GP>"
    }
}

public class Parent extends GrandParent {

    @Override
    public void afficher(){
        super.afficher();
        System.out.print("P>");
    }

    @Override
    public String formater(){
        return "P>" + super.formater();
    }
}

public class Enfant extends Parent {

    @Override
    public void afficher(){
        super.afficher();
        System.out.print("E>");
    }

    @Override
    public String formater(){
        return "E>" + super.formater();
    }
}
</pre>

Pour chaque appel ci-bas, construire le résultat. Choisir `∅` si l'option n'est pas utile.

* `new Enfant().formater()`: {1:MCS:"GP>"~"P>"~="E>"}{1:MCS:"GP>"~="P>"~"E>"~∅}{1:MCS:="GP>"~"P>"~"E>"~∅}
* `new Enfant().afficher()`: {1:MCS:="GP>"~"P>"~"E>"}{1:MCS:"GP>"~="P>"~"E>"~∅}{1:MCS:"GP>"~"P>"~="E>"~∅}
* `new Parent().formater()`: {1:MCS:"GP>"~="P>"~"E>"}{1:MCS:="GP>"~"P>"~"E>"~∅}{1:MCS:"P>"~"E>"~=∅}
* `new Parent().afficher()`: {1:MCS:="GP>"~"P>"~"E>"}{1:MCS:"GP>"~="P>"~"E>"}{1:MCS:"GP>"~"P>"~"E>"~=∅}
* `new GrandParent().formater()`: {1:MCS:="GP>"~"P>"~"E>"}{1:MCS:"GP>"~"P>"~"E>"~=∅}{1:MCS:"P>"~"E>"~=∅}
* `new GrandParent().afficher()`: {1:MCS:="GP>"~"P>"~"E>"}{1:MCS:"GP>"~"P>"~"E>"~=∅}{1:MCS:"P>"~"E>"~=∅}





