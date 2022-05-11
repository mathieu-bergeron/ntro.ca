public class AfficherFileAttente {

    // ...

	private static void afficherFileAttente(FrontendTasks tasks) {

		tasks.task("afficherFileAttente")
		
			 .waitsFor(modified(ModeleFileAttente.class))

			 .waitsFor(viewLoader(FragmentRendezVous.class))

			 .waitsFor(viewLoader(FragmentPartieEnCours.class))

		     .executes(inputs -> {
		    	 
		    	 VueFileAttente                    vueFileAttente          = inputs.get(created(VueFileAttente.class));
		    	 Modified<ModeleFileAttente>       fileAttente             = inputs.get(modified(ModeleFileAttente.class));

		    	 // ajouter
		    	 ViewLoader<FragmentRendezVous>    viewLoaderRendezVous    = inputs.get(viewLoader(FragmentRendezVous.class));
		    	 ViewLoader<FragmentPartieEnCours> viewLoaderPartieEnCours = inputs.get(viewLoader(FragmentPartieEnCours.class));

		    	 // Prêt à afficher avec des fragments
		    	 
		     });
	}
}
