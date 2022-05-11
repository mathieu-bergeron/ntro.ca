public class VueFileAttente extends ViewFx {

    private void installerMsgAjouterRendezVous() {

        MsgAjouterRendezVous msgAjouterRendezVous = NtroApp.newMessage(MsgAjouterRendezVous.class);

        boutonAjouterRendezVous.setOnAction(evtFx -> {

            // un message par clic
            msgAjouterRendezVous.send()

        });

    }
   
