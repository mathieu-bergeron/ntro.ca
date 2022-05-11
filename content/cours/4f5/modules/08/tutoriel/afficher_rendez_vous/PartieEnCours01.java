public class PartieEnCours extends RendezVous {

    // ...

	@Override
	public FragmentRendezVous creerFragment(ViewLoader<FragmentRendezVous> viewLoaderRendezVous, 
			                                ViewLoader<FragmentPartieEnCours> viewLoaderPartieEnCours) {
		
		return viewLoaderPartieEnCours.createView();
	}

    @Override
	public void afficherSur(FragmentRendezVous fragmentRendezVous) {
		super.afficherSur(fragmentRendezVous);
		
		FragmentPartieEnCours fragmentPartieEnCours = (FragmentPartieEnCours) fragmentRendezVous;
		
		fragmentPartieEnCours.afficherNomDeuxiemeJoueur(nomDeuxiemeJoueur);

	}
