package dessin.frontal;

import ca.ntro.app.NtroApp;
import ca.ntro.app.frontend.FrontendFx;
import ca.ntro.app.frontend.ViewRegistrarFx;
import ca.ntro.app.frontend.events.EventRegistrar;
import ca.ntro.app.tasks.frontend.FrontendTasks;
import dessin.frontal.evenements.EvtAfficherVueDessin;
import dessin.frontal.evenements.EvtAfficherFileAttente;
import dessin.frontal.taches.Initialisation;
import dessin.frontal.taches.Navigation;
import dessin.frontal.taches.QuestionExamen;
import dessin.frontal.vues.VueFileAttente;
import dessin.frontal.vues.VueDessin;
import dessin.frontal.vues.VueRacine;


public class FrontalDessin implements FrontendFx {
	
	@Override
	public void createTasks(FrontendTasks tasks) {
		
		Initialisation.creerTaches(tasks);
		Navigation.creerTaches(tasks);
		QuestionExamen.creerTaches(tasks);
	}

	@Override
	public void registerEvents(EventRegistrar registrar) {
		registrar.registerEvent(EvtAfficherVueDessin.class);
		registrar.registerEvent(EvtAfficherFileAttente.class);
	}

	@Override
	public void registerViews(ViewRegistrarFx registrar) {
		registrar.registerDefaultResources("/chaines_fr.properties");
		registrar.registerResources(NtroApp.locale("en"), "/chaines_en.properties");
		
		//registrar.registerStylesheet("/dev.css");
		registrar.registerStylesheet("/prod.css");
		
		registrar.registerView(VueRacine.class, "/racine.xml");
		registrar.registerView(VueFileAttente.class, "/file_attente.xml");
		registrar.registerView(VueDessin.class, "/dessin.xml");
	}

	@Override
	public void execute() {

	}

}
