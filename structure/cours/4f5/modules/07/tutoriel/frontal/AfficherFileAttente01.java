import static ca.ntro.app.tasks.frontend.FrontendTasks.*;

public class AfficherFileAttente {
    
    public static void creerTaches(FrontendTasks tasks) {

        tasks.taskGroup("AfficherFileAttente")
        
             .waitsFor("Initialisation")

             .andContains(subTasks -> {
                 

                 // Prêt à observer le modèle
                   

             });
    }
