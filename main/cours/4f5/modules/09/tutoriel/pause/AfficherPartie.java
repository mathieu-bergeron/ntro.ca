public class AfficherPartie {
	
	// ajouter
	public static boolean partieAffichee = false;

	// ajouter
	public static boolean partieSurPause = false;

	// ...

	private static void prochaineImagePartie(FrontendTasks subTasks) {

		subTasks.task("prochaineImagePartie")

		        .waitsFor(clock().nextTick())
		
		        .thenExecutes(inputs -> {

                    // ajouter la condition
		        	if(partieAffichee && !partieSurPause) {

						Tick             tick             = inputs.get(clock().nextTick());
						DonneesVuePartie donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
						VuePartie        vuePartie        = inputs.get(created(VuePartie.class));
						
						donneesVuePartie.reagirTempsQuiPasse(tick.elapsedTime());
						donneesVuePartie.afficherSur(vuePartie);
		        	}
		        });
