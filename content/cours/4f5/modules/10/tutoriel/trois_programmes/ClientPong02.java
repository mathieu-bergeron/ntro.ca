public class ClientPong implements NtroClientFx {

    // ...

    @Override
    public void registerBackend(BackendRegistrar registrar) {

        // modifier pour utiliser DorsalPongDistant
        registrar.registerBackend(new DorsalPongDistant());
    }

}
