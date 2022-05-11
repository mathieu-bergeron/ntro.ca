import static ca.ntro.app.tasks.frontend.FrontendTasks.*;

public class AfficherFileAttente {
    
    public static void creerTaches(FrontendTasks tasks) {

        tasks.taskGroup("AfficherFileAttente")
        
             .waitsFor("Initialisation")

             .andContains(subTasks -> {
                 
                 afficherFileAttente(subTasks);

             });
    }

    private static void afficherFileAttente(FrontendTasks tasks) {

        tasks.task("afficherFileAttente")
        
             .waitsFor(modified(ModeleFileAttente.class))

             .executes(inputs -> {
                 
                 VueFileAttente              vueFileAttente = inputs.get(created(VueFileAttente.class));
                 Modified<ModeleFileAttente> fileAttente    = inputs.get(modified(ModeleFileAttente.class));

                 ModeleFileAttente ancienneFile = fileAttente.previousValue();
                 ModeleFileAttente fileCourante = fileAttente.currentValue();

                 // Prêt à afficher les rendez-vous!
                 
             });
    }
}
