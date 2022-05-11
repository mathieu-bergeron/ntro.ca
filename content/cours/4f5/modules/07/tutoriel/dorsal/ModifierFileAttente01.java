import static ca.ntro.app.tasks.backend.BackendTasks.*;

public class ModifierFileAttente {
    
    public static void creerTaches(BackendTasks tasks) {
        
        tasks.taskGroup("ModifierFileAttente")
        
             .waitsFor("InitialiserModeles")
        
             .andContains(subTasks -> {

                  // Ajouter ici chaque tâche 
                  // qui modifie le modèle
                  

              });
    }
