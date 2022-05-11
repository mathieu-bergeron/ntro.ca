public class MsgCreerPartie extends MessageNtro {
    
    private String idRendezVous;
    private String nomDeuxiemeJoueur;

    public String getIdRendezVous() {
        return idRendezVous;
    }

    public void setIdRendezVous(String idRendezVous) {
        this.idRendezVous = idRendezVous;
    }

    public String getNomDeuxiemeJoueur() {
        return nomDeuxiemeJoueur;
    }

    public void setNomDeuxiemeJoueur(String nomDeuxiemeJoueur) {
        this.nomDeuxiemeJoueur = nomDeuxiemeJoueur;
    }

    public MsgCreerPartie() {
    }

    public MsgDemarrerPartie appliquerA(ModeleFileAttente fileAttente) {
        return fileAttente.creerPartie(idRendezVous, nomDeuxiemeJoueur);
    }

}
