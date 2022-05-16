public class AfficherPartie {
    
    public static void creerTaches(FrontendTasks tasks) {
        
        creerDonneesVuePartie(tasks);
        
        tasks.taskGroup("AfficherPartie")

             .waitsFor(created(DonneesVuePartie.class))

             .andContains(subTasks -> {

                 // ...

                // ajouter
                observerModelePartie(subTasks);


             });
    }

    private static void observerModelePartie(FrontendTasks tasks) {

        tasks.task("observerModelePartie")

                .waitsFor(modified(ModelePartie.class))

                .thenExecutes(inputs -> {
                    
                    VuePartie              vuePartie        = inputs.get(created(VuePartie.class));
                    DonneesVuePartie       donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
                    Modified<ModelePartie> modifiedPartie   = inputs.get(modified(ModelePartie.class));
                    
                    ModelePartie modelePartie = modifiedPartie.currentValue();

                    modelePartie.afficherInfoPartieSur(vuePartie);
                    modelePartie.copierDonneesDans(donneesVuePartie);

                });
    }
}
