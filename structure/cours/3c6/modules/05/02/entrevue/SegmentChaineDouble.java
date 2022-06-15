public class SegmentChaineDouble<E> {
	
	private E[] valeurs;
	private int indiceDerniereValeur = -1;

	private SegmentChaineDouble<E> suivant = this;
	private SegmentChaineDouble<E> precedent = this;

	public int taille() {
	    // TODO
	}
	
	public boolean siPlein() {
	    // TODO
	}

	public boolean siDoitAjouterSegment() {
	    // TODO
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
		    // TODO: déplacer le dernier élément de ce segment
		    //       vers le début du prochain segment
		}
	}
