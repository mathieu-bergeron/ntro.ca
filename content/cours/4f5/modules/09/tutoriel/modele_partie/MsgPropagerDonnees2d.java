public class MsgPropagerDonnees2d extends MessageNtro {
    
    private MondePong2d mondePong2d;

    // générer les méthodes get/set

    public MsgPropagerDonnees2d() {
    }

    public void appliquerA(ModelePartie partie) {
        partie.copierDonnesDe(mondePong2d);
    }
}
