package agenda.modeles;

import java.util.ArrayList;
import java.util.List;

import ca.ntro.app.models.Model;
import agenda.modeles.valeurs.Rencontre;

public class ModeleAgenda implements Model {
	
	private List<Rencontre> rencontre = new ArrayList<>();

	public List<Rencontre> getRencontre() {
		return rencontre;
	}

	public void setRencontre(List<Rencontre> rencontre) {
		this.rencontre = rencontre;
	}

	public ModeleAgenda() {
	}

	public void initialiser() {

	}
}
