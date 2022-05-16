public class RendezVous implements Value {

    // ...

	public FragmentRendezVous creerFragment(ViewLoader<FragmentRendezVous> viewLoaderRendezVous, 
			                                ViewLoader<FragmentPartieEnCours> viewLoaderPartieEnCours) {
		
		return viewLoaderRendezVous.createView();
	}

	public void afficherSur(FragmentRendezVous fragmentRendezVous) {

		fragmentRendezVous.afficherNomPremierJoueur(nomPremierJoueur);
		
	}
