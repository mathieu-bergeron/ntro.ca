public class Navigation {

    public static void creerTaches(FrontendTasks tasks) {

        tasks.taskGroup("Navigation")
        
             .waitsFor("Initialisation")

             .andContains(subTasks -> {

                 afficherVueFileAttente(subTasks);

                 creerVuePartie(subTasks);
                 afficherVuePartie(subTasks);

             });
    }
}
