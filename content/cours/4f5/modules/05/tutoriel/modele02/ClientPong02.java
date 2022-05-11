public class ClientPong implements NtroClientFx {

    // ...

	@Override
	public void registerModels(ModelRegistrar registrar) {

        // ...

		registrar.registerValue(PartieEnCours.class);

	}
}
