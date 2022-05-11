public class EvtActionJoueur extends EventNtro {

    // ...

    // ajouter
    public void copierActionDans(MsgPropagerActionJoueur msgPropagerActionJoueur) {
        msgPropagerActionJoueur.setActionJoueur(action);
    }
