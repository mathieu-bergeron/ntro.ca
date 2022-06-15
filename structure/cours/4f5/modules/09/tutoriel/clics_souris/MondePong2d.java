public class MondePong2d extends World2dFx<ObjetPong2d, MondePong2d> {

    // ...

	@Override
	protected void onMouseEventNotConsumed(MouseEvent evtFx, double x, double y) {
		paletteGauche.deselectionner();
		paletteDroite.deselectionner();
	}
