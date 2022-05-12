public interface Tableau<C extends Comparable<C>> {

	int longueur();
	C obtenirValeur(int indice);
}
