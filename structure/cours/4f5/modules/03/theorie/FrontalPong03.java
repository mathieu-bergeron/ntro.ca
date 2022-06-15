public class FrontalPong implements FrontendFx {

	@Override
	public void registerViews(ViewRegistrarFx registrar) {

        // Langue par défaut
		registrar.registerDefaultResources("/chaines_fr.properties");

		// Langue additionnelle
		registrar.registerResources(NtroApp.locale("en"), 
		                            "/chaines_en.properties");
	}
}
