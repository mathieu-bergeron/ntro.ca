public class VueFileAttente extends ViewFx {

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        // ...

        // À retirer
        installerEvtAfficherPartie();
    }


    // À retirer
    private void installerEvtAfficherPartie() {
        
        EvtAfficherPartie evtNtro = NtroApp.newEvent(EvtAfficherPartie.class);

        boutonOuvrirPartie.setOnAction(evtFx -> {
            
            evtNtro.trigger();
        });
    }

    // À retirer
    public void afficherMessage(String message) {
        labelMessage.setText(message);
    }


    // ...
}
