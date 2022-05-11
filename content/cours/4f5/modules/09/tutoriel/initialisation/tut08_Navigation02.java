public class Navigation {

    // ...

    private static void afficherVuePartie(FrontendTasks tasks) {

        tasks.task("afficherVuePartie")
        
            // retirer la dépendance
             .waitsFor(created(VuePartie.class))

             // ...

             .thenExecutes(inputs -> {

                 // ...
             });
    }
