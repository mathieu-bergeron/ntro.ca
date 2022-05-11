tasks.task(create(VueRacine.class))

	 .waitsFor(viewLoader(VueRacine.class))
	 
	 .thenExecutesAndReturnsValue(inputs -> {

		 ViewLoader<VueRacine> viewLoader = inputs.get(viewLoader(VueRacine.class));
		 
		 VueRacine vueRacine = viewLoader.createView();
		 
		 return vueRacine;
	 });
