package pong.messages;

import ca.ntro.app.messages.MessageNtro;
import pong.modeles.ModeleFileAttente;

public class MsgAjouterRendezVous extends MessageNtro {
	
	private String nomPremierJoueur;

	public String getNomPremierJoueur() {
		return nomPremierJoueur;
	}

	public void setNomPremierJoueur(String nomPremierJoueur) {
		this.nomPremierJoueur = nomPremierJoueur;
	}
	
	public MsgAjouterRendezVous() {
	}
	

	
	public void ajouterA(ModeleFileAttente fileAttente) {

		fileAttente.ajouterRendezVousPour(nomPremierJoueur);
	}

}
