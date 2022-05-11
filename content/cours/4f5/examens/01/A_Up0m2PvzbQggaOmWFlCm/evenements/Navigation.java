package dessin.frontal.taches;

import dessin.frontal.evenements.EvtAfficherVueDessin;
import dessin.frontal.evenements.EvtAfficherFileAttente;
import dessin.frontal.vues.VueFileAttente;
import dessin.frontal.vues.VueDessin;
import dessin.frontal.vues.VueRacine;
import ca.ntro.app.frontend.ViewLoader;
import ca.ntro.app.tasks.frontend.FrontendTasks;

import static ca.ntro.app.tasks.frontend.FrontendTasks.*;


public class Navigation {
	
	public static void creerTaches(FrontendTasks tasks) {

		tasks.taskGroup("Navigation")
		
		     .waitsFor("Initialisation")

		     .andContains(subTasks -> {

			     afficherVueDessin(subTasks);

		         creerVueFileAttente(subTasks);
			     afficherVueFileAttente(subTasks);

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

	private static void afficherVueFileAttente(FrontendTasks tasks) {

		tasks.task("afficherVueFileAttente")
		
		     .waitsFor(created(VueFileAttente.class))
		
		     .waitsFor(event(EvtAfficherFileAttente.class))

		     .thenExecutes(inputs -> {

		    	 VueRacine      vueRacine      = inputs.get(created(VueRacine.class));
		    	 VueFileAttente vueFileAttente = inputs.get(created(VueFileAttente.class));
		    	  
		    	 vueRacine.afficherSousVue(vueFileAttente);
		     });
	}

	private static void afficherVueDessin(FrontendTasks tasks) {

		tasks.task("afficherVueDessin")
		
		      .waitsFor(event(EvtAfficherVueDessin.class))
		      
		      .thenExecutes(inputs -> {
		    	  
		    	  VueRacine vueRacine = inputs.get(created(VueRacine.class));
		    	  VueDessin vueDessin = inputs.get(created(VueDessin.class));
		    	  
		    	  vueRacine.afficherSousVue(vueDessin);

		      });
	}
}