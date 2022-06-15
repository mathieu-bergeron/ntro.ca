public class Navigation {
    
    public static void creerTaches(FrontendTasks tasks) {

        tasks.taskGroup("Navigation")
        
             .waitsFor("Initialisation")

             .andContains(subTasks -> {

                 afficherVueFileAttente(subTasks);

                 afficherVuePartie(subTasks);
                 
                 // ajouter
                 demarrerPartie(subTasks);

             });
    }

    // ...

    // ajouter
    private static void demarrerPartie(FrontendTasks tasks) {

        tasks.task("demarrerPartie")
        
             .waitsFor(message(MsgDemarrerPartie.class))
              
             .thenExecutes(inputs -> {

                 VueRacine vueRacine                 = inputs.get(created(VueRacine.class));
                 VuePartie vuePartie                 = inputs.get(created(VuePartie.class));
                 MsgDemarrerPartie msgDemarrerPartie = inputs.get(message(MsgDemarrerPartie.class));
                 
                 if(msgDemarrerPartie.estCeUnJoueur(Session.nomUsager)) {

                    vueRacine.afficherSousVue(vuePartie);

                 }
             });
    }
