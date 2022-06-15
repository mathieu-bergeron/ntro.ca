public class FragmentRendezVous extends ViewFx {

    @FXML
    private Button boutonOuvrirPartie;
    
    @FXML
    private Label labelNomPremierJoueur;
    
    private String idRendezVous;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        Ntro.assertNotNull("boutonOuvrirPartie", boutonOuvrirPartie);
        Ntro.assertNotNull("labelNomPremierJoueur", labelNomPremierJoueur);

        installerMsgCreerPartieEtEvtAfficherPartie();
    }

    private void installerMsgCreerPartieEtEvtAfficherPartie() {
        
        EvtAfficherPartie evtAfficherPartie = NtroApp.newEvent(EvtAfficherPartie.class);
        MsgCreerPartie msgCreerPartie = NtroApp.newMessage(MsgCreerPartie.class);

        boutonOuvrirPartie.setOnAction(evtFx -> {
            
            envoyerMsgCreerPartie(msgCreerPartie);
            evtAfficherPartie.trigger();
        });
    }

    protected void envoyerMsgCreerPartie(MsgCreerPartie msgCreerPartie) {
        msgCreerPartie.setIdRendezVous(idRendezVous);
        msgCreerPartie.setNomDeuxiemeJoueur(Session.nomUsager);
        msgCreerPartie.send();
    }
    
    public void identifierRendezVous(String idRendezVous) {
        this.idRendezVous = idRendezVous;
    }

    public void afficherNomPremierJoueur(String nomPremierJoueur) {
        labelNomPremierJoueur.setText(nomPremierJoueur);
    }

}
