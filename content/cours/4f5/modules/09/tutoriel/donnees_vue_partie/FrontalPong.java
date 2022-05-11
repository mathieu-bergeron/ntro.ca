public class FrontalPong implements FrontendFx {
    
    @Override
    public void createTasks(FrontendTasks tasks) {
        
        Initialisation.creerTaches(tasks);
        Navigation.creerTaches(tasks);
        AfficherFileAttente.creerTaches(tasks);
        AfficherPartie.creerTaches(tasks);

    }

    @Override
    public void registerEvents(EventRegistrar registrar) {
        registrar.registerEvent(EvtAfficherFileAttente.class);
        registrar.registerEvent(EvtAfficherPartie.class);
    }

    @Override
    public void registerViews(ViewRegistrarFx registrar) {
        registrar.registerDefaultResources("/chaines_fr.properties");
        registrar.registerResources(NtroApp.locale("en"), "/chaines_en.properties");
        
        //registrar.registerStylesheet("/dev.css");
        registrar.registerStylesheet("/prod.css");

        registrar.registerView(VueRacine.class, "/racine.xml");
        registrar.registerView(VueFileAttente.class, "/file_attente.xml");
        registrar.registerView(VuePartie.class, "/partie.xml");
        registrar.registerView(FragmentRendezVous.class, "/fragments/rendez_vous.xml");
        registrar.registerView(FragmentPartieEnCours.class, "/fragments/partie_en_cours.xml");

        registrar.registerViewData(DonneesVuePartie.class);
    }

    @Override
    public void execute() {

    }

}
