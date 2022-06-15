public class MonArbre<C extends Comparable<C>> extends Arbre<C> {

	private Noeud<C> racine;

	@Override
	public void ajouter(C valeur) {
		if(racine == null) {
			racine = new MonNoeud<C>(valeur);
		}else {
			racine.inserer(valeur);
		}
	}

	@Override
	public void retirer(C valeur) {

		if(racine != null 
		        && racine.siFeuille() 
		        && racine.valeur().equals(valeur)) {

			racine = null;

		}else {

			Noeud<C> aRetirer = trouverNoeud(valeur);

			if(aRetirer != null) {
				aRetirer.seRetirer();
			}
		}
	}

	@Override
	public Noeud<C> racine() {
		return racine;
	}

	@Override
	public Noeud<C> trouverNoeud(C valeur) {
		Noeud<C> noeudCherche = null;

		if(racine != null) {
			noeudCherche = trouverNoeud(racine, valeur);
		}
		
		return noeudCherche;
	}
	
	private Noeud<C> trouverNoeud(Noeud<C> curseur, C valeur){
		Noeud<C> noeudCherche = null;

        if(curseur.valeur() != null 
                && curseur.valeur().compareTo(valeur) == 0) {

        	noeudCherche = curseur;

        }else if(curseur.enfantGauche() != null 
                && valeur.compareTo(curseur.valeur()) < 0) {
        	
        	noeudCherche = trouverNoeud(curseur.enfantGauche(), valeur);

        }else if(curseur.enfantDroit() != null 
                && valeur.compareTo(curseur.valeur()) > 0) {

        	noeudCherche = trouverNoeud(curseur.enfantDroit(), valeur);

        }

        return noeudCherche;
	}

	@Override
	public List<Noeud<C>> tousLesNoeuds() {
		List<Noeud<C>> lesNoeuds = new ArrayList<>();

		if(racine != null) {
			lesNoeuds = tousLesNoeuds(racine);
		}
		
		return lesNoeuds;
	}
	
	private List<Noeud<C>> tousLesNoeuds(Noeud<C> curseur){
		List<Noeud<C>> lesNoeuds = new ArrayList<>();
		
		if(curseur.enfantGauche() != null) {
			lesNoeuds.addAll(tousLesNoeuds(curseur.enfantGauche()));
		}
		
		lesNoeuds.add(curseur);
		
		if(curseur.enfantDroit() != null) {
			lesNoeuds.addAll(tousLesNoeuds(curseur.enfantDroit()));
		}
		
		return lesNoeuds;
	}

	@Override
	public int nombreDeNoeuds() {
		return tousLesNoeuds().size();
	}
}
