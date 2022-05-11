package agenda.modeles.valeurs;

public class Scolaire extends Rencontre {
	
	private String nomDuCours;
	private String nomDuDevoir;

	public String getNomDuCours() {
		return nomDuCours;
	}

	public void setNomDuCours(String nomDuCours) {
		this.nomDuCours = nomDuCours;
	}

	public String getNomDuDevoir() {
		return nomDuDevoir;
	}

	public void setNomDuDevoir(String nomDuDevoir) {
		this.nomDuDevoir = nomDuDevoir;
	}


	public Scolaire() {
		super();
	}
}
