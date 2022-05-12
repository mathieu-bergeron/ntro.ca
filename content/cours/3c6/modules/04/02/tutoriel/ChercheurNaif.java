public class ChercheurNaif<C extends Comparable<C>> implements Chercheur<C> {

	@Override
	public boolean siArbreContientValeur(Noeud<C> arbre, C valeur) {
		
		boolean siArbreContientValeur = false;

		if(arbre.valeur() != null && arbre.valeur().compareTo(valeur) == 0) {
			
			siArbreContientValeur = true;

		}else if(arbre.enfantGauche() != null && siArbreContientValeur(arbre.enfantGauche(), valeur)) {
			
			siArbreContientValeur = true;

		}else if(arbre.enfantDroit() != null && siArbreContientValeur(arbre.enfantDroit(), valeur)) {
			
			siArbreContientValeur = true;

		}
		
		return siArbreContientValeur;
	}
}
