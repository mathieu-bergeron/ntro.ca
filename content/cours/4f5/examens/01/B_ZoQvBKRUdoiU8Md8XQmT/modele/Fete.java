package agenda.modeles.valeurs;

public class Fete extends Rencontre {
	
	private int nombreInvites;
	private boolean nourritureFournie;
	
	
	public int getNombreInvites() {
		return nombreInvites;
	}

	public void setNombreInvites(int nombreInvites) {
		this.nombreInvites = nombreInvites;
	}

	public boolean getNourritureFournie() {
		return nourritureFournie;
	}

	public void setNourritureFournie(boolean nourritureFournie) {
		this.nourritureFournie = nourritureFournie;
	}
	

	public Fete() {
		super();
	}
	
}
