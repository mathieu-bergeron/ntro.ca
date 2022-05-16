public class   PairePourMap<K extends Comparable<K>, V extends Object> {
	
	public K cle;
	public V valeur;

	public MaPairePourMap(K cle, V valeur) {
		this.cle = cle;
		this.valeur = valeur;
	}

	@Override
	public int compareTo(PairePourMap<K, V> o) {

        int resultat = 0;

	    if({1:MCS:=cle.compareTo(o.cle) < 0~∅}
	            {1:MCS:&amp;&amp;~=∅} {1:MCS:valeur.compareTo(o.valeur) < 0~=∅}){

           {1:MCS:=resultat&equals;-1;~resultat&equals;-1;~resultat&equals;+1;~∅}

	    {1:MCS:&#125;~=∅} {1:MCS:else if(~=∅}{1:MCS:cle.compareTo(o.cle) < 0~=∅}
	            {1:MCS:&amp;&amp;~=∅} {1:MCS:valeur.compareTo(o.valeur) > 0~=∅}{1:MCS:){~=∅}
           {1:MCS:resultat&equals;-1;~resultat&equals;-1;~resultat&equals;+1;~=∅}

	    {1:MCS:&#125;~=∅} {1:MCS:else if(~=∅}{1:MCS:cle.compareTo(o.cle) > 0~=∅}
	            {1:MCS:&amp;&amp;~=∅} {1:MCS:valeur.compareTo(o.valeur) < 0~=∅}{1:MCS:){~=∅}

           {1:MCS:resultat&equals;-1;~resultat&equals;-1;~resultat&equals;+1;~=∅}

	    {1:MCS:=&#125;~∅} {1:MCS:=else if(~∅}{1:MCS:=cle.compareTo(o.cle) > 0~∅}
	            {1:MCS:&amp;&amp;~=∅} {1:MCS:valeur.compareTo(o.valeur) < 0~=∅}{1:MCS:=){~∅}

           {1:MCS:resultat&equals;-1;~resultat&equals;-1;~=resultat&equals;+1;~∅}

        {1:MCS:=&#125;~∅}

		return resultat;
	}
}
