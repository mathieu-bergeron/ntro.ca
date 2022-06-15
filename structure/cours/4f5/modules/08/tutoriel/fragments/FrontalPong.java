public class FrontalPong implements FrontendFx {

    // ...
    

    @Override
    public void registerViews(ViewRegistrarFx registrar) {

        // ...
        
        registrar.registerView(FragmentRendezVous.class, "/fragments/rendez_vous.xml");
        registrar.registerView(FragmentPartieEnCours.class, "/fragments/partie_en_cours.xml");
    }
