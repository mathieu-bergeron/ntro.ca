public class MonDictionnaire {1:MCS:=&lt;~∅}{1:MCS:=C~∅}{1:MCS:=extends~∅}{1:MCS:=Comparable~∅}{1:MCS:=&lt;~∅}{1:MCS:=C~∅}{1:MCS:=&gt;~∅}{1:MCS:=&gt;~∅} implements Dictionnaire {1:MCS:=&lt;~∅}{1:MCS:=C~Comparable~C extends Comparable~∅}{1:MCS:=&gt;~∅} {

    private {1:MCS:C~Comparable~=String~Integer~∅}[] cles;
	private {1:MCS:=C~Comparable~String~Integer~∅}[] valeurs;

	public MonDictionnaire({1:MCS:C~Comparable~=String~Integer~∅}[] cles, {1:MCS:=C~Comparable~String~Integer~∅}[] valeurs) {
		this.cles = cles;
		this.valeurs = valeurs;
	}

	@Override
	public {1:MCS:=C~Comparable~String~Integer~void~∅} obtenirValeur({1:MCS:C~Comparable~=String~Integer~∅} cle) {
		int indice = trouverIndicePourCle(cle);
		return valeurs[indice];
	}

	@Override
	public {1:MCS:C~Comparable~String~Integer~=void~∅} modifierValeur({1:MCS:C~Comparable~=String~Integer~∅} cle, {1:MCS:=C~Comparable~String~Integer~∅} valeur) {
		int indice = trouverIndicePourCle(cle);
		valeurs[indice] = valeur;
	}

	@Override
	public {1:MCS:=C~Comparable~String~Integer~void~∅} valeurMinimale() {
		{1:MCS:=C~Comparable~String~Integer~∅} valeurMinimale = null;
		
		if(valeurs.length > 0) {
			valeurMinimale = valeurs[0];
		}
		
		for(int i = 1; i < valeurs.length; i++) {
			if(valeurs[i].{1:MCS:=compareTo~equals~∅}({1:MCS:=valeurMinimale~valeurs[i+1]~∅}) {1:MCS:=&lt~&gt~&equals;~∅} {1:MCS:=0~-1~+1~∅}) {
				valeurMinimale = valeurs[i];
			}
		}
		
		return valeurMinimale;
	}

	@Override
	public {1:MCS:C~Comparable~=String~Integer~void~∅} trouverCle(C valeur) {
		int indice = trouverIndicePourValeur(valeur);
		return cles[indice];
	}

	private int trouverIndicePourCle(String cle) {
	    /* ... */
	}

	private int trouverIndicePourValeur(C valeur) {
	    /* ... */
	}

}
