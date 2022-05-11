public class ModifierFileAttente {
    
    public static void creerTaches(BackendTasks tasks) {
        
        tasks.taskGroup("ModifierFileAttente")
        
             .waitsFor("InitialiserModeles")
        
              .contains(subTasks -> {
                  
                    ajouterRendezVous(subTasks);

                    // ajouter
                    creerPartie(subTasks);

              });
    }


    // ...
    

    // ajouter
    private static void creerPartie(BackendTasks tasks) {
        tasks.task("creerPartie")

             .waitsFor(message(MsgCreerPartie.class))
             
             .thenExecutes(inputs -> {

                 MsgCreerPartie       msgCreerPartie = inputs.get(message(MsgCreerPartie.class));
                 ModeleFileAttente    fileAttente    = inputs.get(model(ModeleFileAttente.class));

                 MsgDemarrerPartie msgDemarrerPartie = msgCreerPartie.appliquerA(fileAttente);

             });
    }

}
