public class Navigation {
    
    public static void creerTaches(FrontendTasks tasks) {

        tasks.taskGroup("Navigation")
        
             .waitsFor("Initialisation")

             .andContains(subTasks -> {

                 afficherVueFileAttente(subTasks);

                 afficherVuePartie(subTasks);

                 demarrerPartie(subTasks);

             });
    }


    private static void demarrerPartie(FrontendTasks tasks) {

        tasks.task("demarrerPartie")
        
             .waitsFor(message(MsgDemarrerPartie.class))
              
             .thenExecutes(inputs -> {

                 VueRacine vueRacine                 = inputs.get(created(VueRacine.class));
                 VuePartie vuePartie                 = inputs.get(created(VuePartie.class));
                 MsgDemarrerPartie msgDemarrerPartie = inputs.get(message(MsgDemarrerPartie.class));
                 
                 if(msgDemarrerPartie.estCeUnJoueur(Session.nomUsager)) {
                     afficherPartie(vueRacine, vuePartie);
                 }
             });
    }

    private static void afficherPartie(VueRacine vueRacine, VuePartie vuePartie) {
        vueRacine.afficherSousVue(vuePartie);
         
         AfficherPartie.partieAffichee = true;
         AfficherPartie.partieSurPause = false;
    }


    private static void afficherVuePartie(FrontendTasks tasks) {

        tasks.task("afficherVuePartie")
        
             .waitsFor(event(EvtAfficherPartie.class))
              
             .thenExecutes(inputs -> {

                 VueRacine vueRacine = inputs.get(created(VueRacine.class));
                 VuePartie vuePartie = inputs.get(created(VuePartie.class));
                 
                 afficherPartie(vueRacine, vuePartie);

             });
    }

    private static void afficherVueFileAttente(FrontendTasks tasks) {

        tasks.task("afficherVueFileAttente")
        
              .waitsFor(event(EvtAfficherFileAttente.class))
              
              .thenExecutes(inputs -> {

                  AfficherPartie.partieAffichee = false;
                  AfficherPartie.partieSurPause = true;
                  
                  VueRacine      vueRacine      = inputs.get(created(VueRacine.class));
                  VueFileAttente vueFileAttente = inputs.get(created(VueFileAttente.class));
                  
                  vueRacine.afficherSousVue(vueFileAttente);

              });
    }
}
