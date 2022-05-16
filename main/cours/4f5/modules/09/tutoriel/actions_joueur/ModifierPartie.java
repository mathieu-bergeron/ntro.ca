public class ModifierPartie {
    
    public static void creerTaches(BackendTasks tasks) {
        
        tasks.taskGroup("ModifierPartie")
        
             .waitsFor(model(ModelePartie.class))
        
              .contains(subTasks -> {
                  
                    ajouterPoint(subTasks);
                  
                    // ajouter
                    recevoirDonnees2d(subTasks);

              });
    }

    private static void recevoirDonnees2d(BackendTasks tasks) {
        tasks.task("recevoirDonnees2d")

             .waitsFor(message(MsgPropagerDonnees2d.class))
             
             .thenExecutes(inputs -> {

                 MsgPropagerDonnees2d msgEtatPong2d = inputs.get(message(MsgPropagerDonnees2d.class));
                 ModelePartie         partie        = inputs.get(model(ModelePartie.class));
                 
                 msgEtatPong2d.appliquerA(partie);
             });
    }
