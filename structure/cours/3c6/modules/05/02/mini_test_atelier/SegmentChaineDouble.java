public class SegmentChaineDouble<E> {
	
	private E[] valeurs;
	private int indiceDerniereValeur = -1;

	private SegmentChaineDouble<E> suivant = this;
	private SegmentChaineDouble<E> precedent = this;

	public int taille() {
	    // Déjà codé
	}
	
	public boolean siPlein() {
	    // Déjà codé
	}

	public boolean siDoitAjouterSegment() {
	    // Déjà codé
	}

	public void inserer(int position, E e) {

		preparerInsertion();

		effectuerInsertion(position, e);
	}
	
	private void preparerInsertion() {
		if(siDoitAjouterSegment()) {
			ajouterSegment();
		}
		
		if(siPlein()) {
		    // Déjà codé
		}
	}

	private void ajouterSegment() {
		SegmentChaineDouble<E> nouveauSuivant = new SegmentChaineDouble<E>(typeElement);
		
		nouveauSuivant.{1:MCS:=setSuivant~setPrecedent~set}({1:MCS:=suivant~precedent~null~nouveauSuivant});
		nouveauSuivant.{1:MCS:=setPrecedent~setSuivant~set}({1:MCS:=this~suivant~precedent~nouveauSuivant});

		suivant.{1:MCS:=setPrecedent~setSuivant~set}({1:MCS:=nouveauSuivant~suivant~precedent~null~this});
		
		{1:MCS:=suivant~precedent~nouveauSuivant~∅} {1:MCS:=&equals;~∅} {1:MCS:=nouveauSuivant~suivant~precedent~this~null~∅};
	}

	private void decalerVersLaDroite(int debut, int fin) {
		for(int i = fin; i >= debut; i--) {
			valeurs[i+1] = valeurs[i];
		}
	}

	public void effectuerInsertion(int position, E e) {

		decalerVersLaDroite({1:MCS:=position~0~1~valeurs.length~valeurs.length-1}, {1:MCS:=indiceDerniereValeur - 1~position~0~1~valeurs.length~valeurs.length-1~indiceDerniereValeur});
		
		{1:MCS:=valeurs~elements~segments~suivant~precedent~∅}{1:MCS:=[position]~set(position,e);~insert(position,e);~∅} {1:MCS:=&equals;~∅} {1:MCS:=e;~∅}
		
		if({1:MCS:=indiceDerniereValeur~true~valeurs.length~position~∅} {1:MCS:=&lt;~&gt;~&equals;&equals;~∅} {1:MCS:=valeurs.length - 1~valeurs.length~indiceDerniereValeur~position~∅}) {
			{1:MCS:=indiceDerniereValeur++;~indiceDerniereValeur--;~indiceDerniereValeur = position;~position++;~position--;~∅}
		}
	}
}
