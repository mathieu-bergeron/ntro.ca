public class MsgCreerPartie extends MessageNtro {
    
    private String idRendezVous;
    private String nomDeuxiemeJoueur;

    // générer les méthodes get/set

    public MsgCreerPartie() {
    }

    public MsgDemarrerPartie appliquerA(ModeleFileAttente fileAttente) {
        return fileAttente.creerPartie(idRendezVous, nomDeuxiemeJoueur);
    }

}
