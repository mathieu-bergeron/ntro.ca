public class VueRacine extends ViewFx {

    // ...

	public void afficherSousVue(ViewFx sousVue) {

		Pane racineSousVue = sousVue.rootNode();

		rootNode().getChildren().clear();
		rootNode().getChildren().add(racineSousVue);
	}

	// ...

}
