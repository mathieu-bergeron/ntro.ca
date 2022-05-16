import static ca.ntro.app.tasks.frontend.FrontendTasks.*;

public class AfficherPartie {

    public static void creerTaches(FrontendTasks tasks) {
        
        creerDonneesVuePartie(tasks);

    }

    private static void creerDonneesVuePartie(FrontendTasks tasks) {

        tasks.task(create(DonneesVuePartie.class))
        
             .waitsFor("Initialisation")

             .executesAndReturnsCreatedValue(inputs -> {
                 
                 return new DonneesVuePartie();
             });
    }
}
