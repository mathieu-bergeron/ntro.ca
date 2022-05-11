public class AfficherPartie {
    
    public static boolean partieAffichee = false;
    public static boolean partieSurPause = false;

    public static void creerTaches(FrontendTasks tasks) {
        
        creerDonneesVuePartie(tasks);
        
        tasks.taskGroup("AfficherPartie")

             .waitsFor(created(DonneesVuePartie.class))

             .andContains(subTasks -> {

                observerModelePartie(subTasks);
                
                reagirActionJoueur(subTasks);

                reagirClicSouris(subTasks);

                prochaineImagePartie(subTasks);

             });
    }


    private static void creerDonneesVuePartie(FrontendTasks tasks) {

        tasks.task(create(DonneesVuePartie.class))
        
             .waitsFor("Initialisation")    

             .executesAndReturnsCreatedValue(inputs -> {
                 
                 return new DonneesVuePartie();
             });
    }

    private static void prochaineImagePartie(FrontendTasks subTasks) {

        subTasks.task("prochaineImagePartie")

                .waitsFor(clock().nextTick())
        
                .thenExecutes(inputs -> {

                    if(partieAffichee && !partieSurPause) {

                        Tick             tick             = inputs.get(clock().nextTick());
                        DonneesVuePartie donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
                        VuePartie        vuePartie        = inputs.get(created(VuePartie.class));
                        
                        donneesVuePartie.reagirTempsQuiPasse(tick.elapsedTime());
                        donneesVuePartie.afficherSur(vuePartie);
                    }
                });
    }

    private static void reagirActionJoueur(FrontendTasks subTasks) {

        subTasks.task("reagirActionJoueur")

                .waitsFor(event(EvtActionJoueur.class))
                
                .thenExecutes(inputs -> {
                    
                    DonneesVuePartie donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
                    EvtActionJoueur  evtActionJoueur  = inputs.get(event(EvtActionJoueur.class));
                    
                    boolean siNouvelleAction =  evtActionJoueur.appliquerA(donneesVuePartie);
                    
                    if(siNouvelleAction) {

                        donneesVuePartie.incrementerVersion();
                        
                        MsgPropagerDonnees2d msgPropagerDonnees2d = NtroApp.newMessage(MsgPropagerDonnees2d.class);
                        donneesVuePartie.copierDonneesDans(msgPropagerDonnees2d);
                        msgPropagerDonnees2d.send();
                    }
                });
    }

    private static void reagirClicSouris(FrontendTasks subTasks) {

        subTasks.task("reagirClicSouris")

                .waitsFor(event(EvtClicSouris.class))
                
                .thenExecutes(inputs -> {
                    
                    DonneesVuePartie donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
                    EvtClicSouris    evtClicSouris    = inputs.get(event(EvtClicSouris.class));

                    evtClicSouris.appliquerA(donneesVuePartie);

                });
    }

    private static void observerModelePartie(FrontendTasks subTasks) {

        subTasks.task("observerModelePartie")

                .waitsFor(modified(ModelePartie.class))

                .thenExecutes(inputs -> {
                    
                    VuePartie              vuePartie        = inputs.get(created(VuePartie.class));
                    DonneesVuePartie       donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
                    Modified<ModelePartie> modifiedPartie   = inputs.get(modified(ModelePartie.class));
                    
                    ModelePartie modelePartie = modifiedPartie.currentValue();

                    modelePartie.afficherInfoPartieSur(vuePartie);
                    
                    if(modelePartie.siVersionPlusGrandeQue(donneesVuePartie)) {
                        modelePartie.copierDonneesDans(donneesVuePartie);
                    }
                });
    }
}
