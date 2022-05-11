package dessin.modeles.valeurs;

import ca.ntro.app.models.Value;

public class Forme implements Value {
	
	private int centreX;
	private int centreY;

	public int getCentreX() {
		return centreX;
	}

	public void setCentreX(int centreX) {
		this.centreX = centreX;
	}

	public int getCentreY() {
		return centreY;
	}

	public void setCentreY(int centreY) {
		this.centreY = centreY;
	}
	
	
	public Forme() {
	}

	

}
