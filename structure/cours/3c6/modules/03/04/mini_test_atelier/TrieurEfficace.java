public class TrieurEfficace<C extends Comparable<C>> implements Trieur<C> {

	@Override
	public Tableau<C> trier(Tableau<C> tableau) {
		
		Tableau<C> resultat = null;
		
		if(tableau.{1:MCS:=longueur()~siVide()~∅} {1:MCS:=&lt;&equals;~&lt;~&gt~∅} {1:MCS:=1~0~2~-1~∅}) {

			resultat = tableau;

		}else {

			resultat = {1:MCS:=trierLongTableau~trier~∅}(tableau);
		}

		return resultat;
	}

	private Tableau<C> trierLongTableau(Tableau<C> tableau) {

		Tableau<C> resultat;

		int longueur = tableau.{1:MCS:=longueur()~siVide()~longueur()-1~∅};
		int pivot = {1:MCS:=longueur/2~longueur-1~longueur/4~∅};

		Tableau<C> gauche = sousTableau(tableau, {1:MCS:=0~1~2~pivot~longueur()~∅}, {1:MCS:=pivot~pivot/2~pivot-1~longueur~∅});
		Tableau<C> droite = sousTableau(tableau, {1:MCS:=pivot~0~1~2~longueur()~∅}, {1:MCS:=longueur~0~pivot~∅});

		gauche = {1:MCS:=trier~trierLongTableau~∅}({1:MCS:=gauche~tableau~∅});
		droite = {1:MCS:=trier~trierLongTableau~∅}({1:MCS:=droite~tableau~∅});
		
		resultat = {1:MCS:=fusionner~fusionnerLongsTableaux~∅}(gauche, droite);

		return resultat;
	}
	
	private Tableau<C> sousTableau(Tableau<C> tableau, int debutSegment, int finSegment){

		Tableau<C> resultat = new MonTableau<C>();
		
		for(int i = {1:MCS:=debutSegment~0~finSegment~∅}; i < {1:MCS:=finSegment~tableau.longueur()~n~debutSegment~∅}; i++) {
			resultat.ajouter(tableau.obtenirValeur({1:MCS:=i~0~∅}));
		}
		
		return resultat;
	}

	public Tableau<C> fusionner(Tableau<C> gauche, Tableau<C> droite) {
		
		Tableau<C> resultat = fusionnerLongsTableaux(gauche, droite);
		
		resultat = deplacerElementsRestants(gauche, resultat);

		resultat = deplacerElementsRestants(droite, resultat);
		
		return resultat;
	}

	private Tableau<C> fusionnerLongsTableaux(Tableau<C> gauche, Tableau<C> droite) {
		
		Tableau<C> resultat = new MonTableau<C>();

		while({1:MCS:=!~∅}gauche.siVide() {1:MCS:=&amp;&amp;~||~∅} {1:MCS:=!~∅}droite.siVide()) {
			
			if(gauche.obtenirValeur({1:MCS:=0~1~i~∅}).compareTo(droite.obtenirValeur({1:MCS:=0~1~i~∅})) {1:MCS:=&lt;~&gt;~&equals~∅} {1:MCS:=0~-1~1~∅}) {
				
				resultat = deplacerPremierElement(gauche, resultat);


			}else {

				resultat = deplacerPremierElement(droite, resultat);
			}
		}
		
		return resultat;
	}
	
	private Tableau<C> deplacerPremierElement(Tableau<C> source, Tableau<C> destination) {
		destination.ajouter(source.obtenirValeur({1:MCS:=0~-1~1~i~source.longueur()~source.longueur()-1~∅}));
		source.retirer({1:MCS:=0~-1~1~i~source.longueur()~source.longueur()-1~∅});
		
		return destination;
	}

	private Tableau<C> deplacerElementsRestants(Tableau<C> source, Tableau<C> destination) {
		while({1:MCS:=!~∅}source.{1:MCS:=siVide()~longueur()~∅}) {
			deplacerPremierElement(source, destination);
		}
		
		return destination;
	}
}
