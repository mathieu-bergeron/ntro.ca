public class AfficherPartie {
	
	public static void creerTaches(FrontendTasks tasks) {
		
		creerDonneesVuePartie(tasks);
		
		tasks.taskGroup("AfficherPartie")

		     .waitsFor(created(DonneesVuePartie.class))

		     .andContains(subTasks -> {


                 // ...
                

                 // ajouter
				reagirClicSouris(subTasks);

		     });
	}


    // ajouter
	private static void reagirClicSouris(FrontendTasks tasks) {

		tasks.task("reagirClicSouris")

		        .waitsFor(event(EvtClicSouris.class))
		        
		        .thenExecutes(inputs -> {
		        	
		        	DonneesVuePartie donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
		        	EvtClicSouris    evtClicSouris    = inputs.get(event(EvtClicSouris.class));

		        	evtClicSouris.appliquerA(donneesVuePartie);

		        });
	}
