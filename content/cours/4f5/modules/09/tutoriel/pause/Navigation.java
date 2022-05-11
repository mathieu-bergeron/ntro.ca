public class Navigation {

    // ...

	private static void afficherVuePartie(FrontendTasks tasks) {

		tasks.task("afficherVuePartie")
		
		     .waitsFor(event(EvtAfficherPartie.class))
		      
		     .thenExecutes(inputs -> {

		    	 VueRacine vueRacine = inputs.get(created(VueRacine.class));
		    	 VuePartie vuePartie = inputs.get(created(VuePartie.class));
		    	  
		    	 vueRacine.afficherSousVue(vuePartie);
		    	 
		    	 // ajouter
		    	 AfficherPartie.partieAffichee = true;
		    	 AfficherPartie.partieSurPause = false;
		     });
	}

	private static void afficherVueFileAttente(FrontendTasks tasks) {

		tasks.task("afficherVueFileAttente")
		
		      .waitsFor(event(EvtAfficherFileAttente.class))
		      
		      .thenExecutes(inputs -> {

		    	  
		    	  VueRacine      vueRacine      = inputs.get(created(VueRacine.class));
		    	  VueFileAttente vueFileAttente = inputs.get(created(VueFileAttente.class));
		    	  
		    	  vueRacine.afficherSousVue(vueFileAttente);

		    	   // ajouter
				  AfficherPartie.partieAffichee = false;
				  AfficherPartie.partieSurPause = true;

		      });
	}

	// ...
