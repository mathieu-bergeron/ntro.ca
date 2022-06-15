public class MsgAjouterPoint extends MessageNtro {
    
    private String cadran;
    private MondePong2d mondePong2d;

    // générer les méthodes get/set

    public void ajouterPointA(ModelePartie partie) {
        partie.ajouterPointPour(Cadran.valueOf(cadran));
    }

    public void copierDonneesDans(ModelePartie partie) {
        partie.copierDonnesDe(mondePong2d);
    }

}
