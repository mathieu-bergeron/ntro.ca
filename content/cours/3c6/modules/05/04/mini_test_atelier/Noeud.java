public interface Noeud<C extends Comparable<C>> {
	
	Noeud<C> parent();
	Noeud<C> enfantGauche();
	Noeud<C> enfantDroit();
	C valeur();

	void setValeur(C valeur);
	void setEnfantDroit(Noeud<C> enfant);
	void setEnfantGauche(Noeud<C> enfant);
	void setParent(Noeud<C> parent);

	Noeud<C> nouveauNoeud(C valeur, Noeud<C> parent);
	Noeud<C> nouveauNoeud(C valeur);

	void inserer(C valeur);

}
