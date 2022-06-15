private static void creerVuePartie(FrontendTasks tasks) {

    tasks.task(create(VuePartie.class))

         .waitsFor(viewLoader(VuePartie.class))

         .thenExecutesAndReturnsValue(inputs -> {
             
             ViewLoader<VuePartie> viewLoader = inputs.get(viewLoader(VuePartie.class));
             
             VuePartie vuePartie = viewLoader.createView();

             return vuePartie;
         });
}

private static void afficherVuePartie(FrontendTasks tasks) {

    tasks.task("afficherVuePartie")
    
         .waitsFor(created(VuePartie.class))

         .waitsFor(event(EvtAfficherPartie.class))
          
         .thenExecutes(inputs -> {

             VueRacine vueRacine = inputs.get(created(VueRacine.class));
             VuePartie vuePartie = inputs.get(created(VuePartie.class));
              
             vueRacine.afficherSousVue(vuePartie);
         });
}

private static void afficherVueFileAttente(FrontendTasks tasks) {

    tasks.task("afficherVueFileAttente")
    
          .waitsFor(event(EvtAfficherFileAttente.class))
          
          .thenExecutes(inputs -> {
              
              VueRacine      vueRacine      = inputs.get(created(VueRacine.class));
              VueFileAttente vueFileAttente = inputs.get(created(VueFileAttente.class));
              
              vueRacine.afficherSousVue(vueFileAttente);

          });
}
