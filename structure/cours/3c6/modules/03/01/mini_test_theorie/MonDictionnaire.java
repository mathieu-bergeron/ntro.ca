public class MonDictionnaire implements Dictionnaire {

	{1:MCS:Comparable~=String~void~Integer~∅}[] cles;
	{1:MCS:=Comparable~String~void~Integer~∅}[] valeurs;

	public MonDictionnaire(String[] cles, Comparable[] valeurs) {
		this.cles = cles;
		this.valeurs = valeurs;
	}

	@Override
	public {1:MCS:=Comparable~String~void~Integer~∅} obtenirValeur({1:MCS:Comparable~=String~void~Integer~∅} cle) {
		int indice = trouverIndicePourCle(cle);
		return valeurs[indice];
	}

	private int trouverIndicePourCle(String cle) {
	    /* ... */
	}

	@Override
	public {1:MCS:Comparable~String~=void~Integer~∅} modifierValeur({1:MCS:Comparable~=String~void~Integer~∅} cle, {1:MCS:=Comparable~String~void~Integer~∅} valeur) {
		int indice = trouverIndicePourCle(cle);
		valeurs[indice] = valeur;
	}

	@Override
	public Comparable valeurMinimale() {
		Comparable valeurMinimale = null;
		
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
	public {1:MCS:Comparable~=String~void~Integer~∅} trouverCle({1:MCS:=Comparable~String~void~Integer~∅} valeur) {
		int indice = trouverIndicePourValeur(valeur);
		return cles[indice];
	}

	private int trouverIndicePourValeur(Comparable valeur) {
	    /* ... */
	}
}
