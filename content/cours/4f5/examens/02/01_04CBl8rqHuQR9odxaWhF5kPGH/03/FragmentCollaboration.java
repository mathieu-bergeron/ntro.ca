package dessin.frontal.vues.fragments;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import ca.ntro.app.NtroApp;
import ca.ntro.app.views.ViewFx;
import ca.ntro.core.initialization.Ntro;
import dessin.Session;
import dessin.frontal.evenements.EvtAfficherVueDessin;
import dessin.messages.MsgAjouterCollaborateur;
import dessin.modeles.valeurs.Collaborateur;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class FragmentCollaboration extends ViewFx {
	
	private String texteDessin;
	private String idCollaboration;
	
	@FXML
	private Label labelTitreDessin;
	
	@FXML
	private Button boutonAjouterCollaborateur;

	@FXML
	private Button boutonOuvrirDessin;
	
	@FXML
	private VBox conteneurCollaborateurs;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		Ntro.assertNotNull("boutonAjouterCollaborateur", boutonAjouterCollaborateur);
		Ntro.assertNotNull("boutonOuvrirDessin", boutonOuvrirDessin);
		Ntro.assertNotNull("conteneurCollaborateurs", conteneurCollaborateurs);
		Ntro.assertNotNull("labelTitreDessin", labelTitreDessin);
		
		texteDessin = labelTitreDessin.getText();
		
		installerMsgAjouterCollaborateur();
		installerEvtAfficherDessin();
	}

	private void installerMsgAjouterCollaborateur() {

		MsgAjouterCollaborateur msgAjouterCollaborateur = NtroApp.newMessage(MsgAjouterCollaborateur.class);
		
		boutonAjouterCollaborateur.setOnAction(evtFx -> {

			msgAjouterCollaborateur.setIdCollaboration(idCollaboration);
			msgAjouterCollaborateur.setCollaborateur(new Collaborateur(Session.nomUsager,Session.forme));

			msgAjouterCollaborateur.send();
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

	private String couleurAleatoire() {

		List<String> choixDeCouleur = List.of("#B1740F", 
					                          "#FFD07B", 
					                          "#FDB833", 
					                          "#296EB4", 
					                          "#1789FC");

		return Ntro.random().choice(choixDeCouleur);
		
	}

	private void installerEvtAfficherDessin() {

		EvtAfficherVueDessin evtNtro = NtroApp.newEvent(EvtAfficherVueDessin.class);
		
		boutonOuvrirDessin.setOnAction(evtFx -> {
			
			evtNtro.trigger();
			
		});
	}

	public void effacerLesCollaborateurs() {
		conteneurCollaborateurs.getChildren().clear();
		
	}

	public void ajouterCollaborateur(FragmentCollaborateur fragmentCollaborateur) {
		if(!conteneurCollaborateurs.getChildren().isEmpty()) {
			conteneurCollaborateurs.getChildren().add(ressortVertical());
		}
		conteneurCollaborateurs.getChildren().add(fragmentCollaborateur.rootNode());
	}

	public Pane ressortVertical() {
		Pane ressort = new Pane();
		ressort.getStyleClass().add("petit-espace-vertical");
		VBox.setVgrow(ressort, Priority.ALWAYS);
		return ressort;
	}

	public void identifier(String idCollaboration) {
		this.idCollaboration = idCollaboration;

		labelTitreDessin.setText(texteDessin + " " + idCollaboration);
	}


}
