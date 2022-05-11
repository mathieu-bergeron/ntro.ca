public class MsgDemarrerPartie extends MessageNtro {
    
    private String nomPremierJoueur;
    private String nomDeuxiemeJoueur;

    public String getNomPremierJoueur() {
        return nomPremierJoueur;
    }

    public void setNomPremierJoueur(String nomPremierJoueur) {
        this.nomPremierJoueur = nomPremierJoueur;
    }

    public String getNomDeuxiemeJoueur() {
        return nomDeuxiemeJoueur;
    }

    public void setNomDeuxiemeJoueur(String nomDeuxiemeJoueur) {
        this.nomDeuxiemeJoueur = nomDeuxiemeJoueur;
    }

    public MsgDemarrerPartie(){

    }

    public void appliquerA(ModelePartie partie) {
        partie.setNomPremierJoueur(nomPremierJoueur);
        partie.setNomDeuxiemeJoueur(nomDeuxiemeJoueur);

        partie.demarrer();
    }

    public boolean estCeUnJoueur(String nomUsager) {
        return nomPremierJoueur.equals(nomUsager) || nomDeuxiemeJoueur.equals(nomUsager);
    }
}
