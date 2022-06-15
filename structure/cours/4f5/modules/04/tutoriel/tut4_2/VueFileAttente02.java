public class VueFileAttente extends ViewFx {
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	    // ...

		installerEvtAfficherPartie();
	}

	private void installerEvtAfficherPartie() {

		boutonOuvrirPartie.setOnAction(evtFx -> {
			
			System.out.println("[VueFileAttente] clic:" + evtFx.getEventType());

		});
	}
}
