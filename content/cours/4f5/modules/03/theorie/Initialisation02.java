tasks.task("installerVueRacine")

	  .waitsFor(window())
	  
	  .waitsFor(created(VueRacine.class))
	  
	  .thenExecutes(inputs -> {
		  
		  VueRacine vueRacine = inputs.get(created(VueRacine.class));
		  Window    window    = inputs.get(window());

		  window.installRootView(vueRacine);
      });
