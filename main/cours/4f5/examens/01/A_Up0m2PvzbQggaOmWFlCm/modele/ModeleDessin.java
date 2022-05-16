package dessin.modeles;

import java.util.ArrayList;
import java.util.List;

import ca.ntro.app.models.Model;
import dessin.modeles.valeurs.Forme;

public class ModeleDessin implements Model {
	
	private List<Forme> formes = new ArrayList<>();

	public List<Forme> getFormes() {
		return formes;
	}

	public void setFormes(List<Forme> formes) {
		this.formes = formes;
	}
	
	public ModeleDessin() {
	}

	public void initialiser() {

	}
}
