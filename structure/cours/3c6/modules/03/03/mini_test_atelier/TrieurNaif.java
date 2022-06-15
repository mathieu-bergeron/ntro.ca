public class TrieurNaif<C extends Comparable<C>> implements Trieur<C> {

	@Override
	public Tableau<C> trier(Tableau<C> {1:MCS:=entree~resultat~∅}) {
		Tableau<C> resultat = new MonTableau<C>({1:MCS:entree~entree.clone()~entree.getValeurs()~=∅});

		while({1:MCS:=!~∅}entree{1:MCS:=.siVide()~.longueur()==0~∅}) {

			C valeurMinimale = valeurMinimale(entree);
			entree.{1:MCS:=retirer~ajouter~∅}({1:MCS:=valeurMinimale~entree.obtenirValeur(0)~entree.obtenirValeur(entree.longueur()-1)~∅});
			resultat.{1:MCS:retirer~=ajouter~∅}({1:MCS:=valeurMinimale~entree.obtenirValeur(0)~entree.obtenirValeur(entree.longueur()-1)~∅});
		}

		return {1:MCS:=resultat~entree~∅};
	}
	
	private C valeurMinimale(Tableau<C> valeurs) {
		C valeurMinimale = {1:MCS:=null~0~""~∅};
		
		if(valeurs.longueur() {1:MCS:&lt;~=&gt;~&equals;&equals;~∅} {1:MCS:=0~-1~1~∅}) {
			valeurMinimale = valeurs.obtenirValeur({1:MCS:=0~-1~1~∅});
		}
		
		for(int i = 1; i < valeurs.{1:MCS:=longueur()~!siVide()~0~∅}; i++) {
			if(valeurs.obtenirValeur({1:MCS:=i~0~longueur()-1~∅}).compareTo({1:MCS:=valeurMinimale~0~""~∅}) {1:MCS:=&lt;~&gt;~&equals;&equals;~∅} {1:MCS:=0~-1~1~∅}) {
				valeurMinimale = valeurs.{1:MCS:=obtenirValeur(i)~obtenirValeur(0)~longueur()~∅};
			}
		}
		
		return valeurMinimale;
	}
}
