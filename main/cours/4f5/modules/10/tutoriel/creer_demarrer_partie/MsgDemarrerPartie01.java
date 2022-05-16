public class MsgDemarrerPartie extends MessageNtro {
    
    private String nomPremierJoueur;
    private String nomDeuxiemeJoueur;

    // générer les méthodes get/set

    public void appliquerA(ModelePartie partie) {
        partie.setNomPremierJoueur(nomPremierJoueur);
        partie.setNomDeuxiemeJoueur(nomDeuxiemeJoueur);

        partie.demarrer();
    }

    public boolean estCeUnJoueur(String nomUsager) {
        return nomPremierJoueur.equals(nomUsager) 
            || nomDeuxiemeJoueur.equals(nomUsager);
    }
}
