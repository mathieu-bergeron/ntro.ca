---
title: ""
weight: 1
bookHidden: true
---


Considérer l'application de dessins collaboratifs.

Considérer le modèle suivant:

<center>
    <img width="500px" src="https://ciboulot.ca/cegep/420-4F5-MO/examens/01/A_Up0m2PvzbQggaOmWFlCm/modele/ModeleDessin.png"/>
</center>


Compléter le code `.java` ci-bas.

Choisir `∅` si une option n'est pas utile.


## Compléter la classe `ModeleDessin`

<code>
<pre>

public class ModeleDessin {1:MCS:=implements~extends~∅} {1:MCS:=Model~Value~Forme~Cercle~Rectangle~∅} {
	
	private List<{1:MCS:=Forme~Cercle~Rectangle~∅}> {1:MCS:=formes~lesFormes~maListe~∅} = new ArrayList<>();

	public List<{1:MCS:=Forme~Cercle~Rectangle~∅}> {1:MCS:=getFormes~getLesFormes~getMaListe~formes~lesFormes~maListe}() {
		return {1:MCS:=formes~lesFormes~maListe~∅};
	}

	public void {1:MCS:=setFormes~setLesFormes~setMaListe~formes~lesFormes~maListe}(List<{1:MCS:=Forme~Cercle~Rectangle~∅}> valeur) {
		this.{1:MCS:=formes~lesFormes~maListe~∅} = valeur;
	}
	
	{1:MCS:=public ModeleDessin() &#123;~∅}

    {1:MCS:=&#125~∅}
}



</pre>
</code>

## Compléter la classe `Forme`

<code>
<pre>
public class Forme {1:MCS:=implements~extends~∅} {1:MCS:Model~=Value~Forme~Cercle~Rectangle~∅} {
	
	{1:MCS:=private int centreX~∅};
	{1:MCS:=private int centreY~∅};
	{1:MCS:private int rayon~=∅};
	{1:MCS:private boolean rempli~=∅};

	{1:MCS:=public Forme() &#123;~∅}

    {1:MCS:=&#125~∅}

	{1:MCS:=public int~∅} {1:MCS:=getCentreX~centreX~∅}{1:MCS:=() &#123;~∅}
		{1:MCS:=return centreX;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public void~∅} {1:MCS:=setCenterX~centreX~∅}{1:MCS:=(int valeur) &#123;~∅}
		{1:MCS:=this.centreX&#61;valeur;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public int~∅} {1:MCS:=getCentreY~centreY~∅}{1:MCS:=() &#123;~∅}
		{1:MCS:=return centreY;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public void~∅} {1:MCS:=setCenterY~centreY~∅}{1:MCS:=(int valeur) &#123;~∅}
		{1:MCS:=this.centreY&#61;valeur;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:public int~=∅} {1:MCS:getRayon~rayon~=∅}{1:MCS:() &#123;~=∅}
		{1:MCS:return rayon;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public void~=∅} {1:MCS:setRayon~rayon~=∅}{1:MCS:(int valeur) &#123;~=∅}
		{1:MCS:this.rayon&#61;valeur;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public boolean~=∅} {1:MCS:getRempli~rempli~isRempli~=∅}{1:MCS:() &#123;~=∅}
		{1:MCS:return rempli;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public void~=∅} {1:MCS:setRempli~rempli~=∅}{1:MCS:(boolean valeur) &#123;~=∅}
		{1:MCS:this.rempli&#61;valeur;~=∅}
    {1:MCS:&#125~=∅}
}
</pre>
</code>

## Compléter la classe `Cercle`

<code>
<pre>
public class Cercle {1:MCS:implements~=extends~∅} {1:MCS:Model~Value~=Forme~Cercle~Rectangle~∅} {
	
	{1:MCS:private int centreX~=∅};
	{1:MCS:private int centreY~=∅};
	{1:MCS:=private int rayon~∅};
	{1:MCS:=private boolean rempli~∅};

	{1:MCS:=public Cercle() &#123;~∅}

    {1:MCS:=&#125~∅}

	{1:MCS:public int~=∅} {1:MCS:getCentreX~centreX~=∅}{1:MCS:() &#123;~=∅}
		{1:MCS:return centreX;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public void~=∅} {1:MCS:setCenterX~centreX~=∅}{1:MCS:(int valeur) &#123;~=∅}
		{1:MCS:this.centreX&#61;valeur;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public int~=∅} {1:MCS:getCentreY~centreY~=∅}{1:MCS:() &#123;~=∅}
		{1:MCS:return centreY;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public void~=∅} {1:MCS:setCenterY~centreY~=∅}{1:MCS:(int valeur) &#123;~=∅}
		{1:MCS:this.centreY&#61;valeur;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:=public int~∅} {1:MCS:=getRayon~rayon~∅}{1:MCS:=() &#123;~∅}
		{1:MCS:=return rayon;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public void~∅} {1:MCS:=setRayon~rayon~∅}{1:MCS:=(int valeur) &#123;~∅}
		{1:MCS:=this.rayon&#61;valeur;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public boolean~∅} {1:MCS:=getRempli~rempli~isRempli~∅}{1:MCS:=() &#123;~∅}
		{1:MCS:=return rempli;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public void~∅} {1:MCS:=setRempli~rempli~∅}{1:MCS:=(boolean valeur) &#123;~∅}
		{1:MCS:=this.rempli&#61;valeur;~∅}
    {1:MCS:=&#125~∅}

}
</pre>
</code>

## Compléter la classe `Rectangle`

<!--

<code>
<pre>
public class Cercle {1:MCS:=implements~extends~∅} {1:MCS:Model~=Value~∅} {
	
	{1:MCS:private int centreX~=∅};
	{1:MCS:private int centreY~=∅};
	{1:MCS:=private int rayon~∅};
	{1:MCS:=private boolean rempli~∅};
	{1:MCS:private int largeur~=∅};
	{1:MCS:private int hauteur~=∅};

	{1:MCS:=public Cercle() &#123;~∅}

    {1:MCS:=&#125~∅}

	{1:MCS:public int~=∅} {1:MCS:getCentreX~centreX~=∅}{1:MCS:() &#123;~=∅}
		{1:MCS:return centreX;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public void~=∅} {1:MCS:setCenterX~centreX~=∅}{1:MCS:(int valeur) &#123;~=∅}
		{1:MCS:this.centreX&#61;valeur;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public int~=∅} {1:MCS:getCentreY~centreY~=∅}{1:MCS:() &#123;~=∅}
		{1:MCS:return centreY;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public void~=∅} {1:MCS:setCenterY~centreY~=∅}{1:MCS:(int valeur) &#123;~=∅}
		{1:MCS:this.centreY&#61;valeur;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:=public int~∅} {1:MCS:=getRayon~rayon~∅}{1:MCS:=() &#123;~∅}
		{1:MCS:=return rayon;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public void~∅} {1:MCS:=setRayon~rayon~∅}{1:MCS:=(int valeur) &#123;~∅}
		{1:MCS:=this.rayon&#61;valeur;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public boolean~∅} {1:MCS:=getRempli~rempli~isRempli~∅}{1:MCS:=() &#123;~∅}
		{1:MCS:=return rempli;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public void~∅} {1:MCS:=setRempli~rempli~∅}{1:MCS:=(boolean valeur) &#123;~∅}
		{1:MCS:=this.rempli&#61;valeur;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:public int~=∅} {1:MCS:getLargeur~largeur~=∅}{1:MCS:() &#123;~=∅}
		{1:MCS:return largeur;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public void~=∅} {1:MCS:setLargeur~largeur~=∅}{1:MCS:(int valeur) &#123;~=∅}
		{1:MCS:this.largeur&#61;valeur;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public int~=∅} {1:MCS:getHauteur~hauteur~=∅}{1:MCS:() &#123;~=∅}
		{1:MCS:return hauteur;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public void~=∅} {1:MCS:setHauteur~hauteur~=∅}{1:MCS:(int valeur) &#123;~=∅}
		{1:MCS:this.hauteur&#61;valeur;~=∅}
    {1:MCS:&#125~=∅}

}
</pre>
</code>


-->
