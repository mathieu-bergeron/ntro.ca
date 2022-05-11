public class DorsalPongDistant extends RemoteBackendNtro {

    @Override
    public void registerServer(ServerRegistrar registrar) {
        // spécifier le serveur auquel
        // se connecter
        registrar.registerPort(8002);
        registrar.registerName("localhost");
    }

}
