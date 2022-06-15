public class FrontalPong implements FrontendFx {

    // ...

	@Override
	public void registerViews(ViewRegistrarFx registrar) {

        // ...

		registrar.registerView(VueFileAttente.class, "/file_attente.xml");

	}

    // ...
}
