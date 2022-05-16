public class AfficherPartie {
    
    public static void creerTaches(FrontendTasks tasks) {
        
        creerDonneesVuePartie(tasks);
        
        tasks.taskGroup("AfficherPartie")

             .waitsFor("Initialisation")

             .waitsFor(created(DonneesVuePartie.class))

             .andContains(subTasks -> {

                 // ...
                
                 // ajouter
                reagirActionJoueur(subTasks);

             });
    }



    private static void reagirActionJoueur(FrontendTasks tasks) {

        tasks.task("reagirActionJoueur")

                .waitsFor(event(EvtActionJoueur.class))
                
                .thenExecutes(inputs -> {
                    
                    DonneesVuePartie donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
                    EvtActionJoueur  evtActionJoueur  = inputs.get(event(EvtActionJoueur.class));
                    
                    evtActionJoueur.appliquerA(donneesVuePartie);

                });
    }
