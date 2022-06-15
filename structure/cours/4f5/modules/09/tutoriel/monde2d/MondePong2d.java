package pong.modeles.monde_pong2d;

import ca.ntro.app.world2d.World2dFx;
import javafx.scene.input.MouseEvent;

public class MondePong2d extends World2dFx<ObjetPong2d, MondePong2d> {
	
	public static final double LARGEUR_MONDE = 640;
	public static final double HAUTEUR_MONDE = 320;

	@Override
	protected void initialize() {
		setWidth(LARGEUR_MONDE);
		setHeight(HAUTEUR_MONDE);

		addObject2d(new Balle2d());
	}

	@Override
	protected void onMouseEventNotConsumed(MouseEvent evtFx, 
			                               double worldX, 
			                               double worldY) {
		
	}

}
