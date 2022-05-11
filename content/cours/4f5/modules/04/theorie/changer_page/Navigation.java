tasks.task("afficherVuePartie")

	 .waitsFor(created(VuePartie.class))

	 .waitsFor(event(EvtAfficherPartie.class))
	  
	 .thenExecutes(inputs -> {

		 VueRacine vueRacine = inputs.get(created(VueRacine.class));
		 VuePartie vuePartie = inputs.get(created(VuePartie.class));
		  
		 vueRacine.afficherSousVue(vuePartie);
	 });
