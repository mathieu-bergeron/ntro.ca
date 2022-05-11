public class VuePartie extends ViewFx {

    //...
    
    // ajouter
    private ActionsActivesParCadran actionsActivesParCadran = new ActionsActivesParCadran();
    

    // modifier
    private void installerEvtActionJoueur() {
        
        
        vboxPartie.addEventFilter(KeyEvent.KEY_PRESSED, evtFx -> {
            
            if(evtFx.getCode().equals(KeyCode.W)
                    && Cadran.siJoueGauche(Session.cadran)){
                
                actionsActivesParCadran.activer(Cadran.GAUCHE, Action.HAUT);

            }else if(evtFx.getCode().equals(KeyCode.S)
                    && Cadran.siJoueGauche(Session.cadran)){

                actionsActivesParCadran.activer(Cadran.GAUCHE, Action.BAS);

            }else if(evtFx.getCode().equals(KeyCode.UP)
                    && Cadran.siJoueDroite(Session.cadran)){

                actionsActivesParCadran.activer(Cadran.DROITE, Action.HAUT);

            }else if(evtFx.getCode().equals(KeyCode.DOWN)
                    && Cadran.siJoueDroite(Session.cadran)){

                actionsActivesParCadran.activer(Cadran.DROITE, Action.BAS);
            }
        });

        vboxPartie.addEventFilter(KeyEvent.KEY_RELEASED, evtFx -> {

            if(evtFx.getCode().equals(KeyCode.W)
                    && Cadran.siJoueGauche(Session.cadran)){

                actionsActivesParCadran.desactiver(Cadran.GAUCHE, Action.HAUT);

            }else if(evtFx.getCode().equals(KeyCode.S)
                    && Cadran.siJoueGauche(Session.cadran)){

                actionsActivesParCadran.desactiver(Cadran.GAUCHE, Action.BAS);

            }else if(evtFx.getCode().equals(KeyCode.UP)
                    && Cadran.siJoueDroite(Session.cadran)){

                actionsActivesParCadran.desactiver(Cadran.DROITE, Action.HAUT);

            }else if(evtFx.getCode().equals(KeyCode.DOWN)
                    && Cadran.siJoueDroite(Session.cadran)){

                actionsActivesParCadran.desactiver(Cadran.DROITE, Action.BAS);
            }
        });
    }

    // ajouter
    public void desactiverActions() {
        actionsActivesParCadran.toutDesactiver();
    }
