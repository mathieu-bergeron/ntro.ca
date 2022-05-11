public class MsgPropagerActionJoueur extends MessageNtro {
    
    private ActionJoueur actionJoueur;

    // générer les méthodes get/set

    public MsgPropagerActionJoueur() {
    }

    public void appliquerActionJoueurA(ModelePartie partie) {
        actionJoueur.appliquerA(partie);
    }

    public void appliquerActionJoueurA(DonneesVuePartie donneesVuePartie) {
        actionJoueur.appliquerA(donneesVuePartie);
    }

}
