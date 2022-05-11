public class Balle2d extends ObjetPong2d {
	
	// ajouter
	private static final double DUREE_ANIMATION = 2.5;

    // ajouter
	private double secondes_restantes_animation = 0;

	@Override
	public void onTimePasses(double secondsElapsed) {
		super.onTimePasses(secondsElapsed);

		// ajouter
		
		if(secondes_restantes_animation > 0) {
			secondes_restantes_animation -= secondsElapsed;
		}

		// ...
		
	}


    // modifier
	private void balleRebondiSurPalette(Palette2d palette) {

	    // ...
		
		// ajouter
		palette.insererEffet();
	}

	@Override
	public void draw(GraphicsContext gc) {
		
		// ajouter
		double echelonnage = 1.0;
		if(secondes_restantes_animation > 0) {
			double pourcentage_ecoule_animation = secondes_restantes_animation / DUREE_ANIMATION;
			echelonnage = 1 + 2*Math.sin(Math.PI * pourcentage_ecoule_animation);
		}

        // ajouter la multiplication *echelonnage
		gc.drawImage(image,
				     getTopLeftX(),
				     getTopLeftY(),
				     getWidth() * echelonnage,
				     getHeight() * echelonnage);

	}
	
	// ajouter
	public void demarrerAnimation() {
		secondes_restantes_animation = DUREE_ANIMATION;
	}

	// ...
