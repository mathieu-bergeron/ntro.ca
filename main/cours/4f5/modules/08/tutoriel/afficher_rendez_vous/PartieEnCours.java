package pong.modeles.valeurs;

import ca.ntro.app.frontend.ViewLoader;
import pong.frontal.vues.fragments.FragmentPartieEnCours;
import pong.frontal.vues.fragments.FragmentRendezVous;

public class PartieEnCours extends RendezVous {
	
	private String nomDeuxiemeJoueur;
	private String idPartie;

	public String getNomDeuxiemeJoueur() {
		return nomDeuxiemeJoueur;
	}

	public void setNomDeuxiemeJoueur(String nomDeuxiemeJoueur) {
		this.nomDeuxiemeJoueur = nomDeuxiemeJoueur;
	}

	public String getIdPartie() {
		return idPartie;
	}

	public void setIdPartie(String idPartie) {
		this.idPartie = idPartie;
	}
	
	
	

	public PartieEnCours() {
		super();
	}

	public PartieEnCours(String idRendezVous, 
			             String nomPremierJoueur,
			             String nomDeuxiemeJoueur,
			             String idPartie) {

		super(idRendezVous, nomPremierJoueur);

		setNomDeuxiemeJoueur(nomDeuxiemeJoueur);
		setIdPartie(idPartie);
	}


	@Override
	public FragmentRendezVous creerFragment(ViewLoader<FragmentRendezVous> viewLoaderRendezVous, 
			                      ViewLoader<FragmentPartieEnCours> viewLoaderPartieEnCours) {
		
		return viewLoaderPartieEnCours.createView();
	}

	public void afficherSur(FragmentRendezVous vueRendezVous) {
		super.afficherSur(vueRendezVous);
		
		FragmentPartieEnCours vuePartieEnCours = (FragmentPartieEnCours) vueRendezVous;
		
		vuePartieEnCours.afficherNomDeuxiemeJoueur(nomDeuxiemeJoueur);

	}
	
	
	@Override
	public String toString() {
		return super.toString() + " Vs " + nomDeuxiemeJoueur;
	}

}
