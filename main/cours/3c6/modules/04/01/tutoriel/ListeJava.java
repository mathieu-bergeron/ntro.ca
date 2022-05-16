public interface ListeJava<V extends Object> {
	
	int longueur();

	V obtenirValeur(int indice);

	void modifierValeur(int indice, V nouvelleValeur);

	void ajouter(V nouvelleValeur); // ajoute à la fin
}
