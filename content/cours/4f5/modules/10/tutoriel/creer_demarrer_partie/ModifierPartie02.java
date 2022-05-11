public class ModifierPartie {
    
    // ...

    private static void demarrerPartie(BackendTasks tasks) {
        tasks.task("demarrerPartie")

             .waitsFor(message(MsgDemarrerPartie.class))
             
             .thenExecutes(inputs -> {

                 MsgDemarrerPartie msgDemarrerPartie = inputs.get(message(MsgDemarrerPartie.class));
                 ModelePartie      partie            = inputs.get(model(ModelePartie.class));

                 msgDemarrerPartie.appliquerA(partie);

                 // ajouter
                 msgDemarrerPartie.broadcast();
             });
    }
