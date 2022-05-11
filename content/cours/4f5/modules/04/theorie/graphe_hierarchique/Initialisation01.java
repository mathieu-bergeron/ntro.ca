public class Initialisation {
    
    public static void creerTaches(FrontendTasks tasks) {

        afficherFenetre(tasks);

        creerVueRacine(tasks);
        creerVueFileAttente(tasks);
        
        installerVueRacine(tasks);
        installerVueFileAttente(tasks);
    }
}

