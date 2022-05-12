public interface Noeud<C extends Comparable<C>> {

	Noeud<C> enfantGauche();
	Noeud<C> enfantDroit();
	C valeur();
}
