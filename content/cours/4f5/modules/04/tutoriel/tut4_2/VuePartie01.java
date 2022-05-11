public class VuePartie extends ViewFx {
	
	@FXML
	private Button boutonQuitterPartie;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Ntro.assertNotNull("boutonQuitterPartie", boutonQuitterPartie);
	}
}
