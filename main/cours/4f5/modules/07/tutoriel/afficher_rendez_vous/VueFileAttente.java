package pong.frontal.vues;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import ca.ntro.app.NtroApp;
import ca.ntro.app.views.ViewFx;
import ca.ntro.core.initialization.Ntro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import pong.frontal.evenements.EvtAfficherPartie;
import pong.messages.MsgAjouterRendezVous;

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
		installerMsgAjouterRendezVous();
	}


	private void installerEvtAfficherPartie() {
		
		EvtAfficherPartie evtNtro = NtroApp.newEvent(EvtAfficherPartie.class);

		boutonOuvrirPartie.setOnAction(evtFx -> {
			
			evtNtro.trigger();
		});
	}

	private void installerMsgAjouterRendezVous() {

		MsgAjouterRendezVous msgAjouterRendezVous = NtroApp.newMessage(MsgAjouterRendezVous.class);

		boutonAjouterRendezVous.setOnAction(evtFx -> {

			msgAjouterRendezVous.setNomPremierJoueur(nomAleatoire());
			msgAjouterRendezVous.send();

		});
	}
	

	private String nomAleatoire() {
		
		List<String> choixDeNoms = List.of("Alice", 
				                           "Bob", 
				                           "Chaaya", 
				                           "Dominic", 
				                           "Élisabeth", 
				                           "Firas", 
				                           "Gregson",
				                           "Hana",
				                           "Ichiro",
				                           "Jun");

		return Ntro.random().choice(choixDeNoms);
	}
	
	public void afficherMessage(String message) {
		labelMessage.setText(message);
	}

}
