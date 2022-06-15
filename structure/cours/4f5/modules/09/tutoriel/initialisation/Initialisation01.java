public class Initialisation {
    
    public static void creerTaches(FrontendTasks tasks) {
        
        tasks.taskGroup("Initialisation")

             .contains(subTasks -> {


                 // ...


                // coller ici
                creerVuePartie(subTasks);


             });
    }

    // coller la méthode ici
    private static void creerVueRacine(FrontendTasks tasks) {
        //...
    }


    // ...
