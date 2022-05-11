public class ServeurPong implements NtroServerJdk {

    public static void main(String[] args) {
        NtroServerJdk.launch(args);
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
        // le dorsal local, mais cette fois-ci
        // on l'exécute sur le serveur
        registrar.registerBackend(new DorsalPong());
    }

    @Override
    public void registerServer(ServerRegistrarJdkImpl registrar) {
        // spécifier le serveur auquel
        // se connecter
        registrar.registerPort(8002);
        registrar.registerName("localhost");
    }
}
