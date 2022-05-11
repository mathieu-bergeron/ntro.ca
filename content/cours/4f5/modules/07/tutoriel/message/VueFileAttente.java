public class VueFileAttente extends ViewFx {

    // ...

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ...

        installerMsgAjouterRendezVous();
    }


    private void installerMsgAjouterRendezVous() {

        MsgAjouterRendezVous msgAjouterRendezVous = NtroApp.newMessage(MsgAjouterRendezVous.class);

        boutonAjouterRendezVous.setOnAction(evtFx -> {

            msgAjouterRendezVous.setNomPremierJoueur(nomAleatoire());
            msgAjouterRendezVous.send();

        });
    }
    

    private String nomAleatoire() {
        
        List<String> choixDeNoms = List.of("Alice", 
                                           "Bob", 
                                           "Chaaya", 
                                           "Dominic", 
                                           "Élisabeth", 
                                           "Firas", 
                                           "Gregson",
                                           "Hana",
                                           "Ichiro",
                                           "Jun");

        return Ntro.random().choice(choixDeNoms);
    }
   
