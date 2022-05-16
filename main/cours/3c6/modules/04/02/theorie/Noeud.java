package tutoriels.tutoriel4_2;

public interface Noeud<C extends Comparable<C>> {
	
	Noeud<C> parent();
	Noeud<C> enfantGauche();
	Noeud<C> enfantDroit();
	C valeur();

	void insererValeur(C valeur);

}
