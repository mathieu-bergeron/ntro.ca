public class ChercheurNaif<C extends Comparable<C>> implements Chercheur<C> {

	@Override
	public int trouverIndicePourValeur(Tableau<C> tableau, C valeur) {
		int indice = -1;

		for(int i = 0; i < tableau.longueur(); i++) {
			if(tableau.obtenirValeur(i).compareTo(valeur) == 0) {
				indice = i;
				break;
			}
		}

		return indice;
	}
}
