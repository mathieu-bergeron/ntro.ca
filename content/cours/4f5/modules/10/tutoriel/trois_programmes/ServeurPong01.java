public class ServeurPong implements NtroServerJdk {
    
    public static void main(String[] args) {
        NtroServerJdk.launch(args);
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
    public void registerServer(ServerRegistrarJdkImpl registrar) {
        Declarations.declarerServeur(registrar);
    }

    @Override
    public void registerBackend(BackendRegistrar registrar) {
        registrar.registerBackend(new DorsalPong());
    }

}
