public class ClientPong implements NtroClientFx {
    
    public static void main(String[] args) {
        NtroClientFx.launch(args);
    }

    @Override
    public void registerFrontend(FrontendRegistrarFx registrar) {
        // même chose
    }

    @Override
    public void registerMessages(MessageRegistrar registrar) {
        // même chose
    }

    @Override
    public void registerModels(ModelRegistrar registrar) {
        // même chose
    }

    @Override
    public void registerBackend(BackendRegistrar registrar) {
        registrar.registerBackend(new DorsalPongDistant());
    }
}
