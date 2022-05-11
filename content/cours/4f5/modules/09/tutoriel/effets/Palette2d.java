import javafx.scene.effect.InnerShadow;

public class Palette2d extends ObjetPong2d {
	
	// ajouter
	private static final double SECONDES_UN_EFFET = 0.4;
	
	// ajouter
	private double secondesRestantesPourEffet = 0;
    private InnerShadow innerShadow = new InnerShadow();

    // ...
    
    // ajouter
	public void onTimePasses(double secondsElapsed) {
		super.onTimePasses(secondsElapsed);
		
		if(secondesRestantesPourEffet > 0) {
			secondesRestantesPourEffet -= secondsElapsed;
		}
	}


	@Override
	public void draw(GraphicsContext gc) {

		gc.save();

		if(selectionnee) {
			gc.setFill(Color.CYAN);
		}
		
		// ajouter
		if(secondesRestantesPourEffet > 0) {
			innerShadow.setOffsetX(getWidth() * secondesRestantesPourEffet / SECONDES_UN_EFFET);
		    innerShadow.setOffsetY(0);
		    innerShadow.setColor(Color.DARKBLUE);
			gc.setEffect(innerShadow);
		}

		gc.fillRect(getTopLeftX(),
				    getTopLeftY(),
				    getWidth(), 
				    getHeight());
		
		gc.restore();
	}
	
	// ajouter
	public void insererEffet() {
		secondesRestantesPourEffet = SECONDES_UN_EFFET;
	}

	// ...
}
