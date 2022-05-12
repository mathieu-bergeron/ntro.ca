public class ChercheurEfficace<C extends Comparable<C>> implements Chercheur<C> {

	@Override
	public int trouverIndicePourValeur(Tableau<C> tableau, C valeur) {
		return rechercheBinaire(tableau, valeur, 0, tableau.longueur());
	}
	
	private int rechercheBinaire(Tableau<C> tableau, 
	                             C valeur, 
	                             int debutSegment, 
	                             int finSegment) {
		int indice = -1;
		
		int tailleSegment = finSegment - debutSegment;

		if(tailleSegment == 1 
		        && tableau.obtenirValeur(debutSegment).compareTo(valeur) == 0) {

			indice = debutSegment;

		}else if(tailleSegment > 1) {
			
			indice = rechercheBinaireGrandSegment(tableau, 
					                              valeur, 
					                              debutSegment, 
					                              finSegment, 
					                              tailleSegment);
		}
		
		return indice;
	}

	private int rechercheBinaireGrandSegment(Tableau<C> tableau, 
			                                 C valeur, 
			                                 int debutSegment, 
			                                 int finSegment, 
			                                 int tailleSegment) {
		int indice;

		int pivot = debutSegment + tailleSegment / 2;
		
		C valeurPivot = tableau.obtenirValeur(pivot);
		
		if(valeur.compareTo(valeurPivot) == 0) {
			
			indice = pivot;
			
		}else if(valeur.compareTo(valeurPivot) < 0){
			
			indice = rechercheBinaire(tableau, valeur, debutSegment, pivot);
			
		}else {

			indice = rechercheBinaire(tableau, valeur, pivot+1, finSegment);
		}

		return indice;
	}
}
