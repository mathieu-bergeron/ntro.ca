public class MsgAjouterRendezVous extends MessageNtro {
    
    private String nomPremierJoueur;

    // ...
    
    public void ajouterA(ModeleFileAttente fileAttente) {

        fileAttente.ajouterRendezVousPour(nomPremierJoueur);

    }
}
