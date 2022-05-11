package dessin.modeles.valeurs;

public class Cercle extends Forme {
	
	private int rayon;
	private boolean rempli;

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public boolean getRempli() {
		return rempli;
	}

	public void setRempli(boolean rempli) {
		this.rempli = rempli;
	}

	public Cercle() {
		super();
	}
}
