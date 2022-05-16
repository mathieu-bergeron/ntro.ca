public class FragmentRendezVous extends ViewFx {

    // ...

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ...
        

        // renommer
        installerMsgCreerPartieEvtAfficherPartie();
    }

    // renommer
    private void installerMsgCreerPartieEvtAfficherPartie() {
        
        // renommer
        EvtAfficherPartie evtAfficherPartie = NtroApp.newEvent(EvtAfficherPartie.class);

        // ajouter
        MsgCreerPartie msgCreerPartie = NtroApp.newMessage(MsgCreerPartie.class);

        boutonOuvrirPartie.setOnAction(evtFx -> {
            
            // ajouter
            envoyerMsgCreerPartie(msgCreerPartie);

            evtAfficherPartie.trigger();
        });
    }

    // créer méthode
    protected void envoyerMsgCreerPartie(MsgCreerPartie msgCreerPartie) {
        msgCreerPartie.setIdRendezVous(idRendezVous);
        msgCreerPartie.setNomDeuxiemeJoueur(Session.nomUsager);
        msgCreerPartie.send();
    }
