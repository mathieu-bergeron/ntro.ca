public class MonModificateurDeFichier implements ModificateurDeFichier {

	@Override
	public EcrireDansFichier modifierObjet(MonObjetJson 
	                                       objetDejaEcrit, 
	                                       String cle, 
	                                       ValeurJson nouvelleValeur) { 

		int decalage = 0;
		String aEcrire = "";

		// [À COMPLÉTER]

		return new EcrireDansFichier(decalage,aEcrire);
	}
}
