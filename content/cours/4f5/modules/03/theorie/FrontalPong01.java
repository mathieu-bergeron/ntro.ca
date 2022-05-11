import pong.frontal.vues.VueRacine;

public class FrontalPong implements FrontendFx {

    @Override
    public void registerViews(ViewRegistrarFx registrar) {

        registrar.registerView(VueRacine.class, "/racine.xml");
    }
}
