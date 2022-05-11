package dessin.frontal.vues.fragments;

import java.net.URL;
import java.util.ResourceBundle;

import ca.ntro.app.views.ViewFx;
import ca.ntro.core.initialization.Ntro;
import dessin.frontal.vues.controles.CanvasForme;
import dessin.modeles.valeurs.Forme;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class FragmentCollaborateur extends ViewFx {

	@FXML
	private HBox conteneurCollaborateur;

	@FXML
	private CanvasForme canvasForme;
	
	@FXML
	private Label labelNomCollaborateur;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Ntro.assertNotNull("labelNomCollaborateur", labelNomCollaborateur);
		Ntro.assertNotNull("conteneurCollaborateur", conteneurCollaborateur);
		Ntro.assertNotNull("canvasForme", canvasForme);
		
		canvasForme.setWorldWidth(400);
		canvasForme.setWorldHeight(400);
		canvasForme.setPosition(Pos.CENTER_RIGHT);
	}

	public void afficherNom(String nom) {
		labelNomCollaborateur.setText(nom);
	}

	public void afficherForme(Forme forme) {
		canvasForme.afficherForme(forme);
	}

}
