public static void creerTaches(FrontendTasks tasks) {

	afficherFenetre(tasks);
	
	creerVueRacine(tasks);
	creerVueFileAttente(tasks);
	
	installerVueRacine(tasks);
	installerVueFileAttente(tasks);

}

private static void installerVueFileAttente(FrontendTasks tasks) {

	tasks.task("installerVueFileAttente")
	
		  .waitsFor(created(VueRacine.class))

		  .waitsFor(created(VueFileAttente.class))
		  
		  .thenExecutes(inputs -> {
		      
		      VueRacine      vueRacine      = inputs.get(created(VueRacine.class));
		      VueFileAttente vueFileAttente = inputs.get(created(VueFileAttente.class));
		      
		      vueRacine.afficherSousVue(vueFileAttente);

		  });
}

private static void creerVueFileAttente(FrontendTasks tasks) {
	tasks.task(create(VueFileAttente.class))

		 .waitsFor(viewLoader(VueFileAttente.class))

		 .thenExecutesAndReturnsValue(inputs -> {
		     
		     ViewLoader<VueFileAttente> viewLoader = inputs.get(viewLoader(VueFileAttente.class));
		     
		     VueFileAttente vueFileAttente = viewLoader.createView();
		     
		     return vueFileAttente;
		 });
}
}
