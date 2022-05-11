public class PongLocal implements NtroClientFx {

    // ...

    @Override
    public void registerBackend(BackendRegistrar registrar) {

        // modifier pour utiliser DorsalPong local
        registrar.registerBackend(new DorsalPong());

    }

}
