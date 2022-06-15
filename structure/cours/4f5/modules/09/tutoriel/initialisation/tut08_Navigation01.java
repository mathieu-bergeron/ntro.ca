public class Navigation {
    
    public static void creerTaches(FrontendTasks tasks) {

        tasks.taskGroup("Navigation")
        
             .waitsFor("Initialisation")

             .andContains(subTasks -> {

                 // ...


                 // copier dans Initialisation
                 creerVuePartie(subTasks);


             });
    }

    // copier dans Initialisation
    private static void creerVuePartie(FrontendTasks tasks) {
        // ...
    }
