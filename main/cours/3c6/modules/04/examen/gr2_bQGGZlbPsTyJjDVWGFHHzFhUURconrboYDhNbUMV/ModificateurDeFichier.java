public interface ModificateurDeFichier {
	
	EcrireDansFichier modifierObjet(MonObjetJson objetDejaEcrit,  
	                                String cle, 
	                                ValeurJson nouvelleValeur);

}
