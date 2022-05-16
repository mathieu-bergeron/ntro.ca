import static ca.ntro.app.tasks.frontend.FrontendTasks.*;

	
FrontendTasks tasks = //...

tasks.task("afficherVuePartie")

	 .waitsFor(created(VueRacine.class))

	 .waitsFor(created(VuePartie.class))

	 .waitsFor(event(EvtAfficherPartie.class))
	  
	 .thenExecutes(inputs -> {

		 VueRacine vueRacine = inputs.get(created(VueRacine.class));
		 VuePartie vuePartie = inputs.get(created(VuePartie.class));
		  
		 vueRacine.afficherSousVue(vuePartie);
	 });

tasks.task("afficherVuePartie")

.waitsFor(created(VueRacine.class))

.waitsFor(created(VuePartie.class))

.waitsFor(event(EvtAfficherPartie.class))

.thenExecutes(inputs -> {

     VueRacine vueRacine = inputs.get(created(VueRacine.class));
     VuePartie vuePartie = inputs.get(created(VuePartie.class));
      
     vueRacine.afficherSousVue(vuePartie);
});

VueRacine vueRacine = inputs.get(created(VueRacine.class));
VuePartie vuePartie = inputs.get(created(VuePartie.class));

vueRacine.afficherSousVue(vuePartie);
