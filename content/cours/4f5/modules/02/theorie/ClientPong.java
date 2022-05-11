public class ClientPong implements NtroClientFx {
	
	public static void main(String[] args) {
		NtroClientFx.launch(args);
	}

	@Override
	public void registerFrontend(FrontendRegistrarFx registrar) {

		registrar.registerFrontend(new FrontalPong());
	}

	@Override
	public void registerMessages(MessageRegistrar registrar) {

	}

	@Override
	public void registerModels(ModelRegistrar registrar) {

	}

	@Override
	public void registerBackend(BackendRegistrar registrar) {

	}

}
