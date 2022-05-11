public class ModifierFileAttente {
    
    public static void creerTaches(BackendTasks tasks) {
        
        tasks.taskGroup("ModifierFileAttente")
        
             .waitsFor("InitialiserModeles")
        
              .contains(subTasks -> {
                  
                    ajouterRendezVous(subTasks);
                    creerPartie(subTasks);

              });
    }


    private static void ajouterRendezVous(BackendTasks tasks) {
        tasks.task("ajouterRendezVous")

             .waitsFor(message(MsgAjouterRendezVous.class))
             
             .thenExecutes(inputs -> {

                 MsgAjouterRendezVous msgAjouterRendezVous = inputs.get(message(MsgAjouterRendezVous.class));
                 ModeleFileAttente    fileAttente          = inputs.get(model(ModeleFileAttente.class));

                 msgAjouterRendezVous.ajouterA(fileAttente);
             });
    }

    private static void creerPartie(BackendTasks tasks) {
        tasks.task("creerPartie")

             .waitsFor(message(MsgCreerPartie.class))
             
             .thenExecutes(inputs -> {

                 MsgCreerPartie       msgCreerPartie = inputs.get(message(MsgCreerPartie.class));
                 ModeleFileAttente    fileAttente    = inputs.get(model(ModeleFileAttente.class));

                 MsgDemarrerPartie msgDemarrerPartie = msgCreerPartie.appliquerA(fileAttente);
                 if(msgDemarrerPartie != null) {
                     msgDemarrerPartie.send();
                 }
             });
    }

}
