Considérer l'application d'agenda partagé.

Considérer le modèle suivant:

<center>
    <img width="500px" src="https://ciboulot.ca/cegep/420-4F5-MO/examens/01/B_ZoQvBKRUdoiU8Md8XQmT/modele/ModeleAgenda.png"/>
</center>


Compléter le code `.java` ci-bas.

Choisir `∅` si une option n'est pas utile.


## Compléter la classe `ModeleAgenda`

<code>
<pre>

public class ModeleAgenda {1:MCS:=implements~extends~∅} {1:MCS:=Model~Value~Rencontre~Fete~Scolaire~∅} {
	
	private List<{1:MCS:=Rencontre~Fete~Scolaire~∅}> {1:MCS:=rencontres~lesRencontres~maListe~∅} = new ArrayList<>();

	public List<{1:MCS:=Rencontre~Fete~Scolaire~∅}> {1:MCS:=getRencontres~getLesRencontres~getMaListe~rencontres~lesRencontres~maListe}() {
		return {1:MCS:=rencontres~lesRencontres~maListe~∅};
	}

	public void {1:MCS:=setRencontres~setLesRencontres~setMaListe~rencontres~lesRencontres~maListe}(List<{1:MCS:=Rencontre~Fete~Scolaire~∅}> valeur) {
		this.{1:MCS:=rencontres~lesRencontres~maListe~∅} = valeur;
	}
	
	{1:MCS:=public ModeleAgenda() &#123;~∅}

    {1:MCS:=&#125~∅}
}



</pre>
</code>

## Compléter la classe `Rencontre`

<code>
<pre>
public class Rencontre {1:MCS:=implements~extends~∅} {1:MCS:Model~=Value~Rencontre~Fete~Scolaire~∅} {
	
	{1:MCS:=private long horodatageDebut~∅};
	{1:MCS:=private long horodatageFin~∅};
	{1:MCS:private int nombreInvites~=∅};
	{1:MCS:private boolean nourritureFournie~=∅};

	{1:MCS:=public Rencontre() &#123;~∅}

    {1:MCS:=&#125~∅}

	{1:MCS:=public long~∅} {1:MCS:=getHorodatageDebut~horodatageDebut~∅}{1:MCS:=() &#123;~∅}
		{1:MCS:=return horodatageDebut;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public void~∅} {1:MCS:=setHorodatageDebut~horodatageDebut~∅}{1:MCS:=(long valeur) &#123;~∅}
		{1:MCS:=this.horodatageDebut&#61;valeur;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public long~∅} {1:MCS:=getHorodatageFin~horodatageFin~∅}{1:MCS:=() &#123;~∅}
		{1:MCS:=return horodatageFin;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public void~∅} {1:MCS:=setHorodatageFin~horodatageFin~∅}{1:MCS:=(long valeur) &#123;~∅}
		{1:MCS:=this.horodatageFin&#61;valeur;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:public int~=∅} {1:MCS:getNombreInvites~nombreInvites~=∅}{1:MCS:() &#123;~=∅}
		{1:MCS:return nombreInvites;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public void~=∅} {1:MCS:setNombreInvites~nombreInvites~=∅}{1:MCS:(int valeur) &#123;~=∅}
		{1:MCS:this.nombreInvites&#61;valeur;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public boolean~=∅} {1:MCS:getNourritureFournie~nourritureFournie~isNourritureFournie~=∅}{1:MCS:() &#123;~=∅}
		{1:MCS:return nourritureFournie;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public void~=∅} {1:MCS:setNourritureFournie~nourritureFournie~=∅}{1:MCS:(boolean valeur) &#123;~=∅}
		{1:MCS:this.nourritureFournie&#61;valeur;~=∅}
    {1:MCS:&#125~=∅}
}
</pre>
</code>

## Compléter la classe `Fete`

<code>
<pre>
public class Fete {1:MCS:implements~=extends~∅} {1:MCS:Model~Value~=Rencontre~Fete~Scolaire~∅} {
	
	{1:MCS:private int horodatageDebut~=∅};
	{1:MCS:private int horodatageFin~=∅};
	{1:MCS:=private int nombreInvites~∅};
	{1:MCS:=private boolean nourritureFournie~∅};

	{1:MCS:=public Fete() &#123;~∅}

    {1:MCS:=&#125~∅}

	{1:MCS:public long~=∅} {1:MCS:getHorodatageDebut~horodatageDebut~=∅}{1:MCS:() &#123;~=∅}
		{1:MCS:return horodatageDebut;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public void~=∅} {1:MCS:setHorodatageDebut~horodatageDebut~=∅}{1:MCS:(long valeur) &#123;~=∅}
		{1:MCS:this.horodatageDebut&#61;valeur;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public long~=∅} {1:MCS:getHorodatageFin~horodatageFin~=∅}{1:MCS:() &#123;~=∅}
		{1:MCS:return horodatageFin;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:public void~=∅} {1:MCS:setHorodatageFin~horodatageFin~=∅}{1:MCS:(long valeur) &#123;~=∅}
		{1:MCS:this.horodatageFin&#61;valeur;~=∅}
    {1:MCS:&#125~=∅}

	{1:MCS:=public int~∅} {1:MCS:=getNombreInvites~nombreInvites~∅}{1:MCS:=() &#123;~∅}
		{1:MCS:=return nombreInvites;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public void~∅} {1:MCS:=setNombreInvites~nombreInvites~∅}{1:MCS:=(int valeur) &#123;~∅}
		{1:MCS:=this.nombreInvites&#61;valeur;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public boolean~∅} {1:MCS:=getNourritureFournie~nourritureFournie~isNourritureFournie~∅}{1:MCS:=() &#123;~∅}
		{1:MCS:=return nourritureFournie;~∅}
    {1:MCS:=&#125~∅}

	{1:MCS:=public void~∅} {1:MCS:=setNourritureFournie~nourritureFournie~∅}{1:MCS:=(boolean valeur) &#123;~∅}
		{1:MCS:=this.nourritureFournie&#61;valeur;~∅}
    {1:MCS:=&#125~∅}

}
</pre>
</code>
