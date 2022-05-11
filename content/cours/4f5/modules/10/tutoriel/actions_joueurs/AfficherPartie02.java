public class AfficherPartie {

    public static void creerTaches(FrontendTasks tasks) {
        
        creerDonneesVuePartie(tasks);
        
        tasks.taskGroup("AfficherPartie")

             .waitsFor(created(DonneesVuePartie.class))

             .andContains(subTasks -> {

                // ...

                // ajouter
                recevoirActionAutreJoueur(subTasks);

             });
    }

    // ...

    private static void recevoirActionAutreJoueur(FrontendTasks tasks) {
        tasks.task("recevoirActionAutreJoueur")

             .waitsFor(message(MsgPropagerActionJoueur.class))
             
             .thenExecutes(inputs -> {

                    DonneesVuePartie        donneesVuePartie        = inputs.get(created(DonneesVuePartie.class));
                    MsgPropagerActionJoueur msgPropagerActionJoueur = inputs.get(message(MsgPropagerActionJoueur.class));
                    
                    msgPropagerActionJoueur.appliquerActionJoueurA(donneesVuePartie);

             });
    }

