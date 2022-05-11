public static void creerTaches(FrontendTasks tasks) {
	
	tasks.taskGroup("Initialisation")

		 .contains(subTasks -> {

			afficherFenetre(subTasks);
		     
			creerVueRacine(subTasks);
			installerVueRacine(subTasks);

			creerVueFileAttente(subTasks);
			installerVueFileAttente(subTasks);

		 });
}
