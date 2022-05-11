package pong.frontal.vues.controles;

import ca.ntro.app.views.controls.canvas.World2dCanvas;

public class CanvasPartie extends World2dCanvas {
	
	@Override
	protected void initialize() {
		// optionnel
		setEpsilon(2);
	}

}
