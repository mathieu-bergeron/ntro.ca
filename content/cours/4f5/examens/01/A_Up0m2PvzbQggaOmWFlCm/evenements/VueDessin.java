package dessin.frontal.vues;

import java.net.URL;
import java.util.ResourceBundle;

import ca.ntro.app.NtroApp;
import ca.ntro.app.views.ViewFx;
import ca.ntro.core.initialization.Ntro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import dessin.frontal.evenements.EvtAfficherFileAttente;

public class VueDessin extends ViewFx {
	
	
	@FXML
	private Button boutonRetour;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Ntro.assertNotNull("boutonRetour", boutonRetour);
		
		installerEvtAfficherFileAttente();
	}


	private void installerEvtAfficherFileAttente() {
		
		EvtAfficherFileAttente evtNtro = NtroApp.newEvent(EvtAfficherFileAttente.class);

		boutonRetour.setOnAction(evtFx -> {

			evtNtro.trigger();
		});
	}

}
