public class DorsalPongDistant extends RemoteBackendNtro {

    @Override
    public void registerServer(ServerRegistrar registrar) {
        Declarations.declarerServeur(registrar);
    }

}
