public class AfficherPartie {

    public static void creerTaches(FrontendTasks tasks) {
        
        creerDonneesVuePartie(tasks);

        tasks.taskGroup("AfficherPartie")

             .waitsFor("Initialisation")

             .waitsFor(created(DonneesVuePartie.class))

             .andContains(subTasks -> {

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
                    
                    Tick             tick             = inputs.get(clock().nextTick());
                    DonneesVuePartie donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
                    VuePartie        vuePartie        = inputs.get(created(VuePartie.class));
                        
                    donneesVuePartie.reagirTempsQuiPasse(tick.elapsedTime());
                    donneesVuePartie.afficherSur(vuePartie);

                });
    }
}
