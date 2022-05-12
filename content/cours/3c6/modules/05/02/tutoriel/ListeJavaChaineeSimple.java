public class ListeJavaChaineeSimple<E extends Object> extends ListeJava<E> {
	
	private int taille = 0;
	private ElementChaineSimple<E> tete = null;

	public ListeJavaChaineeSimple(Class<E> typeElement) {
		super(typeElement);
	}

	@Override
	public void add(E e) {
		insert(size(), e);
	}

	@Override
	public void addAll(E[] elements) {
		for(E e : elements) {
			add(e);
		}
	}
	
	private ElementChaineSimple<E> atteindreElement(int position) {
		ElementChaineSimple<E> element = tete;
		
		for(int i = 0; i < position; i++) {
			if(element != null) {
				element = element.suivant();
			}
		}

		return element;
	}

	@Override
	public void insert(int position, E e) {
		if(position == 0) {

			ElementChaineSimple<E> nouvelleTete = new ElementChaineSimple<E>(e);
			nouvelleTete.setSuivant(tete);

			tete = nouvelleTete;

		}else {
			
			ElementChaineSimple<E> element = atteindreElement(position - 1);
			element.insererApres(e);

		}

		taille++;
	}

	@Override
	public void set(int position, E e) {
		ElementChaineSimple<E> element = atteindreElement(position);
		
		element.set(e);
	}

	@Override
	public E get(int position) {
		ElementChaineSimple<E> element = atteindreElement(position);

		return element.valeur();
	}

	@Override
	public void clear() {
		tete = null;
		taille = 0;
	}

	@Override
	public int size() {
		return taille;
	}

	@Override
	public boolean isEmpty() {
		return taille == 0;
	}

	@Override
	public boolean contains(Object o) {
		int indice = indexOf(o);
		boolean contains = false;
		
		if(indice >= 0) {
			contains = true;
			
		}

		return contains;
	}

	@Override
	public int indexOf(Object o) {
		int indice = -1;
		
		ElementChaineSimple<E> curseur = tete;
		
		for(int i = 0; i < taille; i++) {
			if(curseur != null && curseur.valeur().equals(o)) {
				indice = i;
				break;
			}else if(curseur != null) {
				curseur = curseur.suivant();
			}else {
				break;
			}
		}

		return indice;
	}

	@Override
	public void removeValue(Object o) {
		
		if(tete != null && tete.valeur().equals(o)) {

			remove(0);
			
		}else if(tete != null){

			retirerValeurApresTete(o);

		}
	}

	private void retirerValeurApresTete(Object o) {

		ElementChaineSimple<E> curseur = tete;

		for(int i = 1; i < taille; i++) {

			ElementChaineSimple<E> suivant = curseur.suivant();

			if(suivant != null && suivant.valeur().equals(o)) {

				retirerElementApres(curseur);

			}else if(suivant != null) {

				curseur = suivant;

			}else {

				break;
			}
		}
	}
	
	private void retirerElementApres(ElementChaineSimple<E> curseur) {
		if(curseur.suivant() != null) {
			curseur.setSuivant(curseur.suivant().suivant());
		}
		
		taille--;
	}

	@Override
	public void remove(int position) {
		if(position == 0) {

			tete = tete.suivant();
			taille--;
			
		}else {

			ElementChaineSimple<E> curseur = atteindreElement(position - 1);
			retirerElementApres(curseur);
		}
	}
}
