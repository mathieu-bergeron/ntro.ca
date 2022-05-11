public class VueFileAttente extends ViewFx {

    // ...

    private void installerMsgAjouterRendezVous() {

        MsgAjouterRendezVous msgAjouterRendezVous = NtroApp.newMessage(MsgAjouterRendezVous.class);

        boutonAjouterRendezVous.setOnAction(evtFx -> {

            // modifier pour utiliser Session.nomUsager
            msgAjouterRendezVous.setNomPremierJoueur(Session.nomUsager);
            msgAjouterRendezVous.send();

        });
    }
