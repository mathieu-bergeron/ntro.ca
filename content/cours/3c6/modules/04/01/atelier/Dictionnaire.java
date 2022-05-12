public interface Dictionnaire<V extends Object> {

	int taille();

	V recupererValeur(String cle);

	void entreposerValeur(String cle, V nouvelleValeur);

}
