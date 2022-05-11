public class Initialisation {

    // ...
    
	private static void afficherFenetre(FrontendTasks tasks) {
		tasks.task("afficherFenetre")
		
		     .waitsFor(window())
		     
		     .thenExecutes(inputs -> {


		    	 Window window = (Window) inputs.get(window());

		    	 window.show();

		    	 
		    	 // ajouter
		    	 WindowFx windowFx = (WindowFx) window;
		    	 
				 EvtActionJoueur evtActionJoueur = NtroApp.newEvent(EvtActionJoueur.class);
				 
		    	 windowFx.getPrimaryStage().focusedProperty().addListener(new ChangeListener<Boolean>() {
					@Override
					public void changed(ObservableValue<? extends Boolean> observable, 
							            Boolean oldValue,
							            Boolean fenetreActive) {
						
						if(fenetreActive) {

							AfficherPartie.partieSurPause = AfficherPartie.partieAffichee ? false : true;
							
						}else {

							AfficherPartie.partieSurPause = true;

							evtActionJoueur.setAction(new ActionJoueur(Cadran.GAUCHE, Action.ARRET));
							evtActionJoueur.trigger();

							evtActionJoueur.setAction(new ActionJoueur(Cadran.DROITE, Action.ARRET));
							evtActionJoueur.trigger();

						}
					}
				});
		     });
	}
}
