
    private void installerMsgAjouterRendezVous() {

        boutonAjouterRendezVous.setOnAction(evtFx -> {

            // ajouter le nom du joueur!
            msgAjouterRendezVous.setNomPremierJoueur(nomAleatoire());
            msgAjouterRendezVous.send();

        });
    }
    

    private String nomAleatoire() {
        
        List<String> choixDeNoms = List.of("Alice", 
                                           "Bob", 
                                           "Chaaya", 
                                           "Dominic", 
                                           "√Člisabeth", 
                                           "Firas", 
                                           "Gregson",
                                           "Hana",
                                           "Ichiro",
                                           "Jun");

        return Ntro.random().choice(choixDeNoms);
    }
   
