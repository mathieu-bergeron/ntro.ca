public class ModifierFileAttente {

    // ...
    
    private static void creerPartie(BackendTasks tasks) {
        tasks.task("creerPartie")

             .waitsFor(message(MsgCreerPartie.class))
             
             .thenExecutes(inputs -> {

                 MsgCreerPartie       msgCreerPartie = inputs.get(message(MsgCreerPartie.class));
                 ModeleFileAttente    fileAttente    = inputs.get(model(ModeleFileAttente.class));

                 MsgDemarrerPartie msgDemarrerPartie = msgCreerPartie.appliquerA(fileAttente);

                 // ajouter
                 if(msgDemarrerPartie != null) {
                     msgDemarrerPartie.send();
                 }
             });
    }
