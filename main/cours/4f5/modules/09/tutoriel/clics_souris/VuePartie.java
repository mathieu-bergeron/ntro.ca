public class VuePartie extends ViewFx {

    // ...
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	    // ...

	    // ajouter
		installerEvtClicSouris();
	}

    // ajouter
	private void installerEvtClicSouris() {

		EvtClicSouris evtClicSouris = NtroApp.newEvent(EvtClicSouris.class);
		
		canvasPartie.addMouseEventFilter(MouseEvent.MOUSE_CLICKED, 
		                                  (evtFx, worldX, worldY) -> {
			
			            evtClicSouris.setEvtFx(evtFx);
			            evtClicSouris.setX(worldX);
			            evtClicSouris.setY(worldY);

			            evtClicSouris.trigger();
		});
	}
