public class VuePartie extends ViewFx {
    
    @FXML
    private VBox vboxPartie;

    // ...
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ...

        // ajouter
        Ntro.assertNotNull("vboxPartie", vboxPartie);
        
        // ajouter
        installerEvtActionJoueur();
    }

    // ajouter
    private void installerEvtActionJoueur() {
        
        EvtActionJoueur evtNtro = NtroApp.newEvent(EvtActionJoueur.class);
        
        vboxPartie.addEventFilter(KeyEvent.KEY_PRESSED, evtFx -> {
            
            if(evtFx.getCode().equals(KeyCode.W)) {
                
                evtNtro.setAction(new ActionJoueur(Cadran.GAUCHE, Action.HAUT));
                evtNtro.trigger();

            }else if(evtFx.getCode().equals(KeyCode.S)) {

                evtNtro.setAction(new ActionJoueur(Cadran.GAUCHE, Action.BAS));
                evtNtro.trigger();

            }else if(evtFx.getCode().equals(KeyCode.UP)) {

                evtNtro.setAction(new ActionJoueur(Cadran.DROITE, Action.HAUT));
                evtNtro.trigger();

            }else if(evtFx.getCode().equals(KeyCode.DOWN)) {

                evtNtro.setAction(new ActionJoueur(Cadran.DROITE, Action.BAS));
                evtNtro.trigger();
            }
        });

        vboxPartie.addEventFilter(KeyEvent.KEY_RELEASED, evtFx -> {
            
            if(evtFx.getCode().equals(KeyCode.W)
                    || evtFx.getCode().equals(KeyCode.S)) {

                evtNtro.setAction(new ActionJoueur(Cadran.GAUCHE, Action.ARRET));
                evtNtro.trigger();

            }else if(evtFx.getCode().equals(KeyCode.UP)
                    || evtFx.getCode().equals(KeyCode.DOWN)) {

                evtNtro.setAction(new ActionJoueur(Cadran.DROITE, Action.ARRET));
                evtNtro.trigger();
            }
        });
    }
