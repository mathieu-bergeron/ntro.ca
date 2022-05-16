import static ca.ntro.app.tasks.backend.BackendTasks.*;

public class ModifierPartie {
    
    public static void creerTaches(BackendTasks tasks) {
        
        tasks.taskGroup("ModifierPartie")
        
             .waitsFor(model(ModelePartie.class))
        
              .contains(subTasks -> {
                  
                    ajouterPoint(subTasks);
                  
              });
    }

    private static void ajouterPoint(BackendTasks tasks) {

        tasks.task("ajouterPoint")

             .waitsFor(message(MsgAjouterPoint.class))

             .thenExecutes(inputs -> {
                 
                 MsgAjouterPoint msgAjouterPoint = inputs.get(message(MsgAjouterPoint.class));
                 ModelePartie    partie          = inputs.get(model(ModelePartie.class));
                 
                 msgAjouterPoint.copierDonneesDans(partie);
                 msgAjouterPoint.ajouterPointA(partie);

             });
    }

}
