public class FrontalPong implements FrontendFx {

    @Override
    public void registerViews(ViewRegistrarFx registrar) {

        // ...
        
        registrar.registerView(VuePartie.class, "/partie.xml");
        
    }
}
