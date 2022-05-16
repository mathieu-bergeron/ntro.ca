tasks.task("reagirEvtAfficherPartie")

	 .waitsFor(event(EvtAfficherPartie.class))
	  
	 .thenExecutes(inputs -> {

         // TODO: réagir à l'événement Ntro
        
	 });
