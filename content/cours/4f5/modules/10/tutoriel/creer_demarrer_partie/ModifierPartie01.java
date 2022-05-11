public class ModifierPartie {
    
    public static void creerTaches(BackendTasks tasks) {
        
        tasks.taskGroup("ModifierPartie")
        
             .waitsFor(model(ModelePartie.class))
        
              .contains(subTasks -> {
                  
                  ajouterPoint(subTasks);

                  // ajouter
                  demarrerPartie(subTasks);

              });
    }

    // ...

    // ajouter
    private static void demarrerPartie(BackendTasks tasks) {
        tasks.task("demarrerPartie")

             .waitsFor(message(MsgDemarrerPartie.class))
             
             .thenExecutes(inputs -> {

                 MsgDemarrerPartie msgDemarrerPartie = inputs.get(message(MsgDemarrerPartie.class));
                 ModelePartie      partie            = inputs.get(model(ModelePartie.class));

                 msgDemarrerPartie.appliquerA(partie);

             });
    }
