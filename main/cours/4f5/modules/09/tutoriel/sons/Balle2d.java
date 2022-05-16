import javafx.scene.media.AudioClip;

public class Balle2d extends ObjetPong2d {

    // ...
	
	// ajouter
	private AudioClip sonPoc = new AudioClip(Balle2d.class.getResource("/poc.wav").toString());

	// ...
	

	// ajouter
	private void jouerSonPoc() {
	    sonPoc.play();
	}

	private void balleRebondiSurPalette(Palette2d palette) {
	    // ajouter
		jouerSonPoc();

		//...
	}

	private void balleRebondiSurPlancher() {
	    // ajouter
		jouerSonPoc();

        // ...
	}


	private void balleRebondiSurPlafond() {
	    // ajouter
		jouerSonPoc();

        // ...
	}


	// ...
