public interface Noeud<C extends Comparable<C>> {
	
	Noeud<C> parent();
	Noeud<C> enfantGauche();
	Noeud<C> enfantDroit();

	// ...
}
