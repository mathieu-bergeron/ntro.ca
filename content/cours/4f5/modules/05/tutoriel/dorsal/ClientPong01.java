public class ClientPong implements NtroClientFx {

    // ...

	@Override
	public void registerBackend(BackendRegistrar registrar) {

		registrar.registerBackend(new DorsalPong());

	}
