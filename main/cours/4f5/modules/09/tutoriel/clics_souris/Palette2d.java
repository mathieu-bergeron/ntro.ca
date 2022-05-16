public class Palette2d extends ObjetPong2d {

    // ajouter l'attribut
	private boolean selectionnee;


	@Override
	public void draw(GraphicsContext gc) {

		gc.save();

        // ajouter
		if(selectionnee) {
			gc.setFill(Color.CYAN);
		}

		gc.fillRect(getTopLeftX(),
				    getTopLeftY(),
				    getWidth(), 
				    getHeight());
		
		gc.restore();
	}
	
	
	@Override
	protected boolean onMouseEvent(MouseEvent evtFx, double x, double y) {

		selectionnee = !selectionnee;

		return true;
	}

	public void deselectionner() {
		selectionnee = false;
	}

	// ...

}
