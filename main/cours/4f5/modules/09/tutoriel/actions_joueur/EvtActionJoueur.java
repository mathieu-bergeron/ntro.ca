public class EvtActionJoueur extends EventNtro {
    
    private ActionJoueur action;

    // générer les méthodes get/set

    public EvtActionJoueur() {
    }

    public void appliquerA(DonneesVuePartie donneesVuePartie) {
        action.appliquerA(donneesVuePartie);
    }

}
