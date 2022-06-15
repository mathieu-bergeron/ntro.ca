package dessin.frontal.taches;

import ca.ntro.app.tasks.frontend.FrontendTasks;
import ca.ntro.core.clock.Tick;
import ca.ntro.core.reflection.observer.Modified;
import dessin.frontal.evenements.EvtSouris;
import dessin.frontal.vues.VueDessin;
import dessin.frontal.vues.donnees.DonneesVueDessin;
import dessin.modeles.ModeleDessin;

import static ca.ntro.app.tasks.frontend.FrontendTasks.*;


public class AfficherDessin {

	public static void creerTaches(FrontendTasks tasks) {
		
		creerDonneesVueDessin(tasks);

		tasks.taskGroup("AfficherDessin")
		
		     .waitsFor(created(DonneesVueDessin.class))

		     .andContains(subTasks -> {
		    	 
		    	 observerDessin(subTasks);
		    	 
		    	 prochaineImageDessin(subTasks);
		    	 
		    	 reagirEvtSouris(subTasks);
		    	 

		     });
	}

	private static void observerDessin(FrontendTasks tasks) {
		
		tasks.task("observerDessin")

		     .waitsFor(modified(ModeleDessin.class))
		     
		     .thenExecutes(inputs -> {
		    	 
		    	 Modified<ModeleDessin> modifiedDessin   = inputs.get(modified(ModeleDessin.class));
		    	 DonneesVueDessin       donneesVueDessin = inputs.get(created(DonneesVueDessin.class));
		    	 
		    	 ModeleDessin dessin = modifiedDessin.currentValue();
		    	 
		    	 dessin.copierFormesDans(donneesVueDessin);
		    	 
		     });
	}

	private static void reagirEvtSouris(FrontendTasks tasks) {

		tasks.task("reagirEvtSouris")
		
		     .waitsFor(event(EvtSouris.class))
		     
		     .thenExecutes(inputs -> {
		    	 
		    	 EvtSouris        evtSouris        = inputs.get(event(EvtSouris.class));

		    	 DonneesVueDessin donneesVueDessin = inputs.get(created(DonneesVueDessin.class));
		    	 
		    	 evtSouris.appliquerA(donneesVueDessin);
		     });
	}

	private static void prochaineImageDessin(FrontendTasks tasks) {
		tasks.task("prochaineImageDessin")
		
		     .waitsFor(clock().nextTick())
		     
		     .thenExecutes(inputs -> {
		    	 
		    	 Tick             tick             = inputs.get(clock().nextTick());
		    	 DonneesVueDessin donneesVueDessin = inputs.get(created(DonneesVueDessin.class));
		    	 VueDessin        vueDessin        = inputs.get(created(VueDessin.class));
		    	 
		    	 donneesVueDessin.reagirTempsQuiPasse(tick.elapsedTime());
		    	 donneesVueDessin.afficherSur(vueDessin);
		    	 
		     });
		
	}

	private static void creerDonneesVueDessin(FrontendTasks tasks) {
		tasks.task(create(DonneesVueDessin.class))
		
		     .waitsFor("Initialisation")
		
		     .thenExecutesAndReturnsValue(inputs -> {

		    	 return new DonneesVueDessin();
		     });
	}

}
