tasks.task(create(VueRacine.class))

	 .waitsFor(created(VueRacine.class))

	 .thenExecutesAndReturnsValue(inputs -> {

		 VueRacine vueRacine = inputs.get(created(VueRacine.class));
		 
		 return vueRacine;
	 });
