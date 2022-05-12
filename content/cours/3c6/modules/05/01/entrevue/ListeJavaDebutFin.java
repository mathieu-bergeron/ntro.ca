public class ListeJavaDebutFin<E extends Object> extends ListeJava<E> {
	
	private final int TAILLE_INITIALE = 100;

	private E[] grosTableau = nouveauTableau(/*...*/);
	private int indicePremierElement = /*...*/
	private int indiceDernierElement = /*...*/

	@Override
	public int size() {
		return /*...*/
	}

	@Override
	public int indexOf(Object o) {
		int position = -1;

		for(/*...*/) {
			if(elements[i].equals(o)) {
				position = /*...*/
				break;
			}
		}

		return position;
	}
