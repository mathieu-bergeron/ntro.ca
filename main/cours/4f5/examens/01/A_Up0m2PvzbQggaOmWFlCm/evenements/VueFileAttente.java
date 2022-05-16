package dessin.frontal.vues;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import ca.ntro.app.NtroApp;
import ca.ntro.app.views.ViewFx;
import ca.ntro.core.initialization.Ntro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import dessin.frontal.evenements.EvtAfficherFileAttente;
import dessin.frontal.evenements.EvtAfficherVueDessin;

public class VueFileAttente extends ViewFx {
	
	
	@FXML
	private Button boutonOuvrirPartie;

	@FXML
	private Button boutonAjouterRendezVous;

	@FXML
	private Label labelMessage;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Ntro.assertNotNull("boutonOuvrirPartie", boutonOuvrirPartie);
		Ntro.assertNotNull("boutonAjouterRendezVous", boutonAjouterRendezVous);
		Ntro.assertNotNull("labelMessage", labelMessage);

		installerEvtAfficherPartie();
	}

	private void installerEvtAfficherPartie() {
		
		EvtAfficherVueDessin evtNtro = NtroApp.newEvent(EvtAfficherVueDessin.class);

		boutonOuvrirPartie.setOnAction(evtFx -> {
			
			evtNtro.trigger();
		});
	}


}
