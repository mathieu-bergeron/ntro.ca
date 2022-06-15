---
title: ""
weight: 1
bookHidden: true
---


# Validité des signatures

Pour chaque déclaration, indiquer s'il s'agit:

* D'une déclaration valide d'interface
* D'une déclaration valide de classe abstraite
* Sinon choisir `∅`

<pre>
public interface Danseur { 

    void danser(double temps);
    void apprendreDanse(String style);

}{1:MCS:=interface valide~classe abstraite valide~∅}

public interface Coureur { 

    void courir(double temps);
    public double meilleurTemps(){
        return 27.4;
    }

}{1:MCS:interface valide~classe abstraite valide~=∅}

public abstract class DanseurAbstrait implements Danseur { 

    // ...

    @Override
    void danser(double temps){
        double vitesse = temps / monTempo();
        // ...
    }

    protected abstract int monTempo();

}{1:MCS:=interface valide~=classe abstraite valide~∅}

public class CoureurAbstrait implements Coureur { 

    //@Override
    protected double meilleurTemps();
}
{1:MCS:interface valide~classe abstraite valide~=∅}
</pre>


# Validité des appels

Considérer les signatures suivantes:

<pre>
public interface Connecteur {

    void connecter(String url);
}

public abstract class ConnecteurAbstrait implements Connecteur {

    public void ouvrirConnexion(String url){
        // ...
    }

    public abstract void nouvelleConnexion(String url);

    // ...
}

public class MonConnecteur extends ConnecteurAbstrait {
    // ...
}
</pre>

Pour chaque appel de méthode, indiquer si:

* L'appel est valide
* Sinon choisir `∅`

<pre>
{1:MCS:new Connecteur();~=∅}
{1:MCS:new ConnecteurAbstrait();~=∅}
{1:MCS:=new MonConnecteur();~∅}
{1:MCS:=((Connecteur) connecteur).connecter();~∅}
{1:MCS:=((ConnecteurAbstrait) connecteur).connecter();~∅}
{1:MCS:=((MonConnecteur) connecteur).connecter();~∅}
{1:MCS:((Connecteur) connecteur).ouvrirConnexion();~=∅}
{1:MCS:=((ConnecteurAbstrait) connecteur).ouvrirConnexion();~∅}
{1:MCS:=((MonConnecteur) connecteur).ouvrirConnexion();~∅}
{1:MCS:((Connecteur) connecteur).nouvelleConnexion();~=∅}
{1:MCS:((ConnecteurAbstrait) connecteur).nouvelleConnexion();~=∅}
{1:MCS:=((MonConnecteur) connecteur).nouvelleConnexion();~∅}
</pre>

