public class ElementChaineSimple<E> {
	
	private E valeur;

	private ElementChaineSimple<E> suivant = null;

	public ElementChaineSimple(E e) {
		this.valeur = e;
	}

	public ElementChaineSimple<E> suivant() {
		return suivant;
	}

	public E valeur() {
		return valeur;
	}
	
	public void set(E e) {
		this.valeur = e;
	}
	
	public void setSuivant(ElementChaineSimple<E> suivant) {
		this.suivant = suivant;
	}
	
	public void insererApres(E e) {

		ElementChaineSimple<E> nouveau = new ElementChaineSimple<E>(e);
		
		if(this.suivant != null) {
			nouveau.setSuivant(this.suivant);
		}
		
		this.suivant = nouveau;
	}
}
