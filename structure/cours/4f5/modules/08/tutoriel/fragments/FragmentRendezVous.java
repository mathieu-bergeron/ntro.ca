public class FragmentRendezVous extends ViewFx {

    @FXML
    private Button boutonOuvrirPartie;
    
    @FXML
    private Label labelNomPremierJoueur;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        Ntro.assertNotNull("boutonOuvrirPartie", boutonOuvrirPartie);
        Ntro.assertNotNull("labelNomPremierJoueur", labelNomPremierJoueur);

        installerEvtAfficherPartie();
    }

    private void installerEvtAfficherPartie() {
        
        EvtAfficherPartie evtNtro = NtroApp.newEvent(EvtAfficherPartie.class);

        boutonOuvrirPartie.setOnAction(evtFx -> {
            
            evtNtro.trigger();
        });
    }

    public void afficherNomPremierJoueur(String nomPremierJoueur) {
        labelNomPremierJoueur.setText(nomPremierJoueur);
    }

}
