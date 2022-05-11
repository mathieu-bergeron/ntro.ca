package dessin.frontal.vues.controles;

import ca.ntro.app.views.controls.canvas.World2dCanvas;
import dessin.modeles.valeurs.Forme;
import dessin.modeles.valeurs.Rectangle;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;

public class CanvasForme extends World2dCanvas {
	
	private Color couleur = Color.CYAN;
	private Forme forme = new Rectangle();

	@Override
	protected void initialize() {
		setPosition(Pos.CENTER_RIGHT);
	}

	@Override
	protected void onInitialSize(double initialWidth, double initialHeight) {
		super.onInitialSize(initialWidth, initialHeight);

		dessinerForme();
	}


	@Override
	protected void onNewSize(double oldWidth, double oldHeight, double newWidth, double newHeight) {
		super.onNewSize(oldWidth, oldHeight, newWidth, newHeight);

		dessinerForme();
	}

	private void dessinerForme() {
		clearCanvas();
		
		getGc().save();
		
		forme.setTopLeftX(0.1 * getWorldWidth());
		forme.setTopLeftY(0.1 * getWorldHeight());
		forme.setWidth(0.8 * getWorldWidth());
		forme.setHeight(0.8 * getWorldHeight());
		
		forme.draw(getGc());
		
		getGc().restore();
	}

	public void afficherForme(Forme forme) {
		this.forme = forme;
	}
}
