public class InitialiserModeles {
    
    // ...

    private static void initialiserModeleFileAttente(BackendTasks tasks) {

        tasks.task("initialiserModeleFileAttente")

             .waitsFor(model(ModeleFileAttente.class))
             
             .thenExecutes(inputs -> {

                 ModeleFileAttente fileAttente = inputs.get(model(ModeleFileAttente.class));

                 fileAttente.initialiser();

             });
    }
