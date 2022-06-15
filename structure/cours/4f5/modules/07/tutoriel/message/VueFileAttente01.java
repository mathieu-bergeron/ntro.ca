public class VueFileAttente extends ViewFx {

    // ...

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ...

        installerMsgAjouterRendezVous();
    }


    private void installerMsgAjouterRendezVous() {

        MsgAjouterRendezVous msgAjouterRendezVous = NtroApp.newMessage(MsgAjouterRendezVous.class);

    }
   
