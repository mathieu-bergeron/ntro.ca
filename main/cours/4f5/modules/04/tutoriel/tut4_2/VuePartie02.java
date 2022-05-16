public class VuePartie extends ViewFx {
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	    
	    // ...

		installerEvtAfficherFileAttente();
	}


	private void installerEvtAfficherFileAttente() {

		boutonQuitterPartie.setOnAction(evtFx -> {

			System.out.println("[VuePartie] clic: " + evtFx.getEventType());

		});
	}
}
