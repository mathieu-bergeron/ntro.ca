private static void afficherFenetre(FrontendTasks tasks) {

	tasks.task("afficherFenetre")
	
		 .waitsFor(window())

		 .thenExecutes(inputs -> {
		     
		     Window window = inputs.get(window());

		     window.show();

		 });
}

private static void creerVueRacine(FrontendTasks tasks) {
	tasks.task(create(VueRacine.class))

		 .waitsFor(viewLoader(VueRacine.class))
		 
		 .thenExecutesAndReturnsValue(inputs -> {

		     ViewLoader<VueRacine> viewLoader = inputs.get(viewLoader(VueRacine.class));
		     
		     VueRacine vueRacine = viewLoader.createView();
		     
		     return vueRacine;

		 });
}

private static void installerVueRacine(FrontendTasks tasks) {
	tasks.task("installerVueRacine")
	
		  .waitsFor(window())
		  
		  .waitsFor(created(VueRacine.class))
		  
		  .thenExecutes(inputs -> {
		      
		      VueRacine vueRacine = inputs.get(created(VueRacine.class));
		      Window    window    = inputs.get(window());

		      window.installRootView(vueRacine);

		  });
}

public static void creerTaches(FrontendTasks tasks) {

	afficherFenetre(tasks);

}

public static void creerTaches(FrontendTasks tasks) {

	afficherFenetre(tasks);

	creerVueRacine(tasks);
	installerVueRacine(tasks);
}
