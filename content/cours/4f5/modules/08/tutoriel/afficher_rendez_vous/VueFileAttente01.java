public class VueFileAttente extends ViewFx {

    // ajouter
	@FXML
	private VBox conteneurRendezVous;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

        // ajouter
		Ntro.assertNotNull("conteneurRendezVous", conteneurRendezVous);

		// ...
	}


    // ajouter
	public void viderListeRendezVous() {
		conteneurRendezVous.getChildren().clear();
	}

    // ajouter
	private Pane petitEspaceVertical() {

		Pane petitEspaceVertical = new Pane();

		petitEspaceVertical.getStyleClass().add("petit-espace-vertical");

		return petitEspaceVertical;
	}

    // ajouter
	public void ajouterRendezVous(FragmentRendezVous fragmentRendezVous) {

		conteneurRendezVous.getChildren().add(fragmentRendezVous.rootNode());

		conteneurRendezVous.getChildren().add(petitEspaceVertical());

	}

