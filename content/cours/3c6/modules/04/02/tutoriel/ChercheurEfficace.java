public class ChercheurEfficace<C extends Comparable<C>> implements Chercheur<C> {

	@Override
	public boolean siArbreContientValeur(Noeud<C> arbre, C valeur) {
		
		boolean siArbreContientValeur = false;

		if(arbre.valeur() != null && arbre.valeur().compareTo(valeur) == 0) {
			
			siArbreContientValeur = true;

		}else if(arbre.enfantGauche() != null && valeur.compareTo(arbre.valeur()) < 0) {
			
			siArbreContientValeur = siArbreContientValeur(arbre.enfantGauche(), valeur);

		}else if(arbre.enfantDroit() != null && valeur.compareTo(arbre.valeur()) > 0) {
			
			siArbreContientValeur = siArbreContientValeur(arbre.enfantDroit(), valeur);

		}

		return siArbreContientValeur;
	}

}
