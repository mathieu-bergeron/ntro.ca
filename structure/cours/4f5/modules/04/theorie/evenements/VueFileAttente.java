public class VueFileAttente extends ViewFx {
	
	
	@FXML
	private Button boutonOuvrirPartie;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Ntro.asserter().assertNotNull("boutonOuvrirPartie", boutonOuvrirPartie);
		
		installerEvtAfficherPartie();
	}

	private void installerEvtAfficherPartie() {
		
		EvtAfficherPartie evtNtro = NtroApp.newEvent(EvtAfficherPartie.class);

		boutonOuvrirPartie.setOnAction(evtFx -> {

			evtNtro.trigger();

		});
	}

}
