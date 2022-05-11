public class Navigation {
    
    public static void creerTaches(FrontendTasks tasks) {

        tasks.taskGroup("Navigation")
        
             .waitsFor("Initialisation")

             .andContains(subTasks -> {

                 // on va avoir:
                 //
                 // afficherVueFileAttente(subTasks);
                 // creerVuePartie(subTasks);
                 // afficherVuePartie(subTasks);

             });
    }
}
