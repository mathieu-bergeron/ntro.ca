public class ModeleFileAttente implements Model {


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
