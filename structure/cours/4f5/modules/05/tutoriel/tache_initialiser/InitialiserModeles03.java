public class InitialiserModeles {
    
    public static void creerTaches(BackendTasks tasks) {
        
        tasks.taskGroup("InitialiserModeles")
        
              .contains(subTasks -> {
                  
                    initialiserModeleFileAttente(subTasks);

              });
    }

    // ...
