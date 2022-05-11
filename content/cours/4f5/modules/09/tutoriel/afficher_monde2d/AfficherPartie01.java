public class AfficherPartie {

    public static void creerTaches(FrontendTasks tasks) {
        
        creerDonneesVuePartie(tasks);

        // ajouter le groupe de tâches suivant
        tasks.taskGroup("AfficherPartie")

             .waitsFor(created(DonneesVuePartie.class))

             .andContains(subTasks -> {

                prochaineImagePartie(subTasks);

             });

    }

    // ...


    // ajouter la méthode
    private static void prochaineImagePartie(FrontendTasks subTasks) {

        subTasks.task("prochaineImagePartie")

                 .waitsFor(clock().nextTick())

                 .thenExecutes(inputs -> {
                    
                    DonneesVuePartie donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
                    VuePartie        vuePartie        = inputs.get(created(VuePartie.class));

                    // TODO: afficher le monde 2d
                });
    }
}
