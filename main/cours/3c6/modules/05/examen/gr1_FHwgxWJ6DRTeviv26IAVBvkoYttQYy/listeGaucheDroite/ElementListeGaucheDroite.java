public class ElementListeGaucheDroite<I extends Object> {

    boolean hasNext();

	ElementListeGaucheDroite<I> getNext();
	void setNext(ElementListeGaucheDroite<I> next);

	I getValue();
	void setValue(I value);

	// ajuster les pointeurs afin d'insérer 
	// un nouvel élément juste après l'élément courant
	void insererApres(ElementListeGaucheDroite<I> newNext);

	// ajuster les pointeurs afin de retirer
	// l'élément venant juste après
	void retirerApres();

}
