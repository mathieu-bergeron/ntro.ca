public class PongLocal implements NtroClientFx {
    
    public static void main(String[] args) {
        NtroClientFx.launch(args);
    }

    @Override
    public void registerFrontend(FrontendRegistrarFx registrar) {

        registrar.registerFrontend(new FrontalPong());

    }

    @Override
    public void registerMessages(MessageRegistrar registrar) {

        Declarations.declarerMessages(registrar);

    }

    @Override
    public void registerModels(ModelRegistrar registrar) {

        Declarations.declarerModeles(registrar);
    }

    @Override
    public void registerBackend(BackendRegistrar registrar) {

        registrar.registerBackend(new DorsalPong());

    }

}
