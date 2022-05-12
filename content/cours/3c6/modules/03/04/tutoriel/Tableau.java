public interface Tableau<C extends Comparable<C>> {

	boolean siVide();
	
	int longueur();

	C obtenirValeur(int indice);

	void modifierValeur(int indice, C nouvelleValeur);

	void ajouter(C nouvelleValeur); // ajoute à la fin

	void retirer(int indice);

	void retirer(C valeur);

}
