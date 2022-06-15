public class AfficherPartie {


    //...

    private static void reagirActionJoueur(FrontendTasks subTasks) {

        subTasks.task("reagirActionJoueur")

                .waitsFor(event(EvtActionJoueur.class))
                
                .thenExecutes(inputs -> {
                    
                    DonneesVuePartie donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
                    EvtActionJoueur  evtActionJoueur  = inputs.get(event(EvtActionJoueur.class));
                    
                    evtActionJoueur.appliquerA(donneesVuePartie);

                    // ajouter
                    MsgPropagerActionJoueur msgPropagerActionJoueur = NtroApp.newMessage(MsgPropagerActionJoueur.class);

                    // ajouter
                    evtActionJoueur.copierActionDans(msgPropagerActionJoueur);

                    // ajouter: broadcast!
                    msgPropagerActionJoueur.broadcast();

                });
    }
