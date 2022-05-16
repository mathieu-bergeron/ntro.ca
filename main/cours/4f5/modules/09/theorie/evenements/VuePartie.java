public class VuePartie extends ViewFx {
    
    // ...
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // ...
        
        installerEvtActionJoueur();
    }

    private void installerEvtActionJoueur() {
        
        EvtActionJoueur evtNtro = NtroApp.newEvent(EvtActionJoueur.class);
        
        canvasPartie.addEventFilter(KeyEvent.KEY_PRESSED, evtFx -> {
            
            if(evtFx.getCode().equals(KeyCode.W)) {
                
                evtNtro.setAction(new ActionJoueur(Cadran.GAUCHE, Action.HAUT));
                evtNtro.trigger();

            }else if(evtFx.getCode().equals(KeyCode.S)) {

                // ...
        });
    }
