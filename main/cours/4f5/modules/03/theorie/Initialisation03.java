tasks.task("installerVueFileAttente")

	  .waitsFor(created(VueRacine.class))

	  .waitsFor(created(VueFileAttente.class))
	  
	  .thenExecutes(inputs -> {
		  
		  VueRacine      vueRacine      = inputs.get(created(VueRacine.class));
		  VueFileAttente vueFileAttente = inputs.get(created(VueFileAttente.class));
		  
		  vueRacine.afficherSousVue(vueFileAttente);

	  });
