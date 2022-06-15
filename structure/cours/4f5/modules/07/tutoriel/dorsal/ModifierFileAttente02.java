import static ca.ntro.app.tasks.backend.BackendTasks.*;

public class ModifierFileAttente {
    
    public static void creerTaches(BackendTasks tasks) {
        
        tasks.taskGroup("ModifierFileAttente")
        
             .waitsFor("InitialiserModeles")
        
             .andContains(subTasks -> {
                  
                    ajouterRendezVous(subTasks);

              });
    }

    private static void ajouterRendezVous(BackendTasks tasks) {
        tasks.task("ajouterRendezVous")

             .waitsFor(message(MsgAjouterRendezVous.class))
             
             .thenExecutes(inputs -> {

                 MsgAjouterRendezVous msgAjouterRendezVous = inputs.get(message(MsgAjouterRendezVous.class));
                 ModeleFileAttente    fileAttente          = inputs.get(model(ModeleFileAttente.class));

                 // Prêt à ajouter un rendez-vous!
               
             });
    }
}
