public class AfficherFileAttente {

    // ...

	private static void afficherFileAttente(FrontendTasks tasks) {

		tasks.task("afficherFileAttente")
		
			 .waitsFor(modified(ModeleFileAttente.class))

             // ajouter
			 .waitsFor(viewLoader(FragmentRendezVous.class))
			 .waitsFor(viewLoader(FragmentPartieEnCours.class))


		     .executes(inputs -> {

		         // ... 
		         
		     });
	}
}
