public class FrontalPong implements FrontendFx {

    // ...


	@Override
	public void registerViews(ViewRegistrarFx registrar) {


        // ...

		registrar.registerDefaultResources("/chaines_fr.properties");

		registrar.registerResources(NtroApp.locale("en"), 
		                            "/chaines_en.properties");

        // ...

	}


	// ...
}
