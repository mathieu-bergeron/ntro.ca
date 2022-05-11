package dessin.frontal.vues.controles;

import ca.ntro.app.views.controls.canvas.World2dCanvas;

public class CanvasDessin extends World2dCanvas {

	@Override
	protected void initialize() {
		setEpsilon(2);
	}

}
