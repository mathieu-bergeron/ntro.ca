public class VueFileAttente extends ViewFx {
	
	@FXML
	private Button boutonOuvrirPartie;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Ntro.assertNotNull("boutonOuvrirPartie", boutonOuvrirPartie);

	}
}
