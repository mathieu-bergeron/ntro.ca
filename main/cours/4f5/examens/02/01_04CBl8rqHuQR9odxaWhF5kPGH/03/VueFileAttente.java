package dessin.frontal.vues;

import java.net.URL;
import java.util.ResourceBundle;

import ca.ntro.app.NtroApp;
import ca.ntro.app.views.ViewFx;
import ca.ntro.core.initialization.Ntro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import dessin.frontal.vues.fragments.FragmentCollaboration;
import dessin.messages.MsgCreerCollaboration;

public class VueFileAttente extends ViewFx {
	
	
	@FXML
	private Button boutonCreerCollaboration;

	@FXML
	private Pane conteneurCollaborations;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Ntro.assertNotNull("boutonCreerCollaboration", boutonCreerCollaboration);
		Ntro.assertNotNull("conteneurCollaboration", conteneurCollaborations);

		installerMsgCreerCollaboration();
	}

	private void installerMsgCreerCollaboration() {
		
		MsgCreerCollaboration msgCreerCollaboration = NtroApp.newMessage(MsgCreerCollaboration.class);

		boutonCreerCollaboration.setOnAction(evtFx -> {

			msgCreerCollaboration.send();
		});
	}

	public void effacerLesCollaborations() {
		conteneurCollaborations.getChildren().clear();
	}

	public void ajouterCollaboration(FragmentCollaboration fragmentCollaboration) {
		if(!conteneurCollaborations.getChildren().isEmpty()) {
			conteneurCollaborations.getChildren().add(ressortHorizontal());
		}

		conteneurCollaborations.getChildren().add(fragmentCollaboration.rootNode());
	}
	
	public Pane ressortHorizontal() {
		Pane ressort = new Pane();
		ressort.getStyleClass().add("ressort-horizontal");
		HBox.setHgrow(ressort, Priority.ALWAYS);
		return ressort;
	}

}
