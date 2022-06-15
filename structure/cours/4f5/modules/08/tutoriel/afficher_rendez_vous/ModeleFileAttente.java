package pong.modeles;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ca.ntro.app.frontend.ViewLoader;
import ca.ntro.app.models.Model;
import pong.frontal.vues.VueFileAttente;
import pong.frontal.vues.fragments.FragmentPartieEnCours;
import pong.frontal.vues.fragments.FragmentRendezVous;
import pong.modeles.valeurs.RendezVous;

public class ModeleFileAttente implements Model {

	private transient Date dateOuverture;

	private String heureOuverture;
	
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

	public String getHeureOuverture() {
		return heureOuverture;
	}

	public void setHeureOuverture(String heureOuverture) {
		this.heureOuverture = heureOuverture;
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
	

	public void afficherSur(VueFileAttente vueFileAttente, 
			                ViewLoader<FragmentRendezVous> viewLoaderRendezVous,
			                ViewLoader<FragmentPartieEnCours> viewLoaderPartieEnCours) {
		
		vueFileAttente.viderListeRendezVous();
		
		for(RendezVous rendezVous : rendezVousDansOrdre) {
			
			FragmentRendezVous fragmentRendezVous = rendezVous.creerFragment(viewLoaderRendezVous, viewLoaderPartieEnCours);

			rendezVous.afficherSur(fragmentRendezVous);

			vueFileAttente.ajouterRendezVous(fragmentRendezVous);
		}
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

	public void initialiser() {
		dateOuverture = new Date();
		heureOuverture = new SimpleDateFormat("EEEE HH:mm").format(dateOuverture);
	}

}
