public interface Tableau<C extends Comparable<C>> {
	
	void initialiserTableau(C[] valeurs);
	C valeurMaximale();
}
