package pong.modeles;

import java.util.ArrayList;
import java.util.List;

import ca.ntro.app.models.Model;
import pong.frontal.vues.VueFileAttente;

public class ModeleFileAttente implements Model {
	
	private String idFileAttente = "filePrincipale";

	private long prochainIdRendezVous = 1;

	private List<RendezVous> rendezVousDansOrdre = new ArrayList<>();
	//private Map<String, RendezVous> rendezVousParId = new HashMap<>();

	public long getProchainIdRendezVous() {
		return prochainIdRendezVous;
	}

	public void setProchainIdRendezVous(long prochainIdRendezVous) {
		this.prochainIdRendezVous = prochainIdRendezVous;
	}

	public List<RendezVous> getRendezVousDansOrdre() {
		return rendezVousDansOrdre;
	}

	public void setRendezVousDansOrdre(List<RendezVous> rendezVousDansOrdre) {
		this.rendezVousDansOrdre = rendezVousDansOrdre;
	}

	public String getIdFileAttente() {
		return idFileAttente;
	}

	public void setIdFileAttente(String idFileAttente) {
		this.idFileAttente = idFileAttente;
	}


	/*
	public Map<String, RendezVous> getRendezVousParId() {
		return rendezVousParId;
	}

	public void setRendezVousParId(Map<String, RendezVous> rendezVousParId) {
		this.rendezVousParId = rendezVousParId;
	}
	*/
	


	public ModeleFileAttente() {
	}


	public void ajouterRendezVousPour(String nomPremierJoueur) {
		String idRendezVous = genererIdRendezVous();
		RendezVous rendezVous = new RendezVous(idRendezVous, nomPremierJoueur);

		rendezVousDansOrdre.add(rendezVous);
	}

	private String genererIdRendezVous() {
		String idRendezVous = String.valueOf(prochainIdRendezVous);
		prochainIdRendezVous++;

		return idRendezVous;
	}
	

	public void afficherSur(VueFileAttente vueFileAttente) {

		vueFileAttente.afficherMessage(this.toString());

	}
	
	public String toString() {

		StringBuilder builder = new StringBuilder();
		int numeroRendezVous = 1;
		
		for(RendezVous rendezVous : rendezVousDansOrdre) {

			builder.append(numeroRendezVous);
			builder.append(". ");
			builder.append(rendezVous.toString());
			builder.append("\n");

			numeroRendezVous++;
		}

		return builder.toString();
	}

}
