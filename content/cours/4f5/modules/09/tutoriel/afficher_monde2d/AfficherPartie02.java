public class AfficherPartie {

    // ...

    private static void prochaineImagePartie(FrontendTasks subTasks) {

        subTasks.task("prochaineImagePartie")

                 .waitsFor(clock().nextTick())

                 .thenExecutes(inputs -> {
                    
                    DonneesVuePartie donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
                    VuePartie        vuePartie        = inputs.get(created(VuePartie.class));
                        
                    // ajouter
                    donneesVuePartie.afficherSur(vuePartie);

                });
    }

}
