public class FrontalPong implements FrontendFx {

    //...

    @Override
    public void registerViews(ViewRegistrarFx registrar) {

        // ...

        // ajouter
        registrar.registerViewData(DonneesVuePartie.class);
    }
