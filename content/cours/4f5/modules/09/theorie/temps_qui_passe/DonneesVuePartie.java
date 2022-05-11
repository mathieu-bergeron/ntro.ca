public class DonneesVuePartie implements ViewData {
    
    private static long CALCULER_FPS_A_CHAQUE_X_MILLISECONDES = 200;

    private long horodatageDernierCalculFps = Ntro.time().nowMilliseconds();
    private long imagesAfficheesDepuisDernierCalculFps = 0;
    private String fpsCourant = "0";

    private MondePong2d mondePong2d = new MondePong2d();

    public void copierDonnesDe(MondePong2d mondePong2d) {
        this.mondePong2d.copyDataFrom(mondePong2d);
    }

    public void copierDonneesDans(MsgPropagerDonnees2d msgPropagerEtatPong2d) {
        msgPropagerEtatPong2d.setMondePong2d(mondePong2d);
    }

    public void reagirTempsQuiPasse(double secondesEcoulees) {
        mondePong2d.onTimePasses(secondesEcoulees);
    }

    public void afficherSur(VuePartie vuePartie) {
        calculerFpsSiNecessaire();

        vuePartie.viderCanvas();
        vuePartie.afficherImagesParSeconde("FPS " + fpsCourant);
        vuePartie.afficherPong2d(mondePong2d);
        
        imagesAfficheesDepuisDernierCalculFps++;
    }

    private void calculerFpsSiNecessaire() {
        long horodatageMaintenant = Ntro.time().nowMilliseconds();
        long millisecondesEcoulees = horodatageMaintenant - horodatageDernierCalculFps;
        
        if(millisecondesEcoulees > CALCULER_FPS_A_CHAQUE_X_MILLISECONDES) {
            calculerFpsMaintenant(millisecondesEcoulees);

            imagesAfficheesDepuisDernierCalculFps = 0;
            horodatageDernierCalculFps = horodatageMaintenant;
        }
    }
    
    private void calculerFpsMaintenant(long millisecondesEcoulees) {
        double secondesEcoulees = millisecondesEcoulees / 1E3;
        double fps = imagesAfficheesDepuisDernierCalculFps / secondesEcoulees;
        fpsCourant = String.valueOf(Math.round(fps));
    }

    public boolean appliquerActionJoueur(Cadran cadran, Action action) {
        return mondePong2d.appliquerActionJoueur(cadran, action);
    }

    public void reagirClicSouris(MouseEvent evtFx, double x, double y) {
        mondePong2d.dispatchMouseEvent(evtFx, x,y);
    }

    public void incrementerVersion() {
        mondePong2d.incrementerVersion();
    }

    public boolean siVersionPlusGrandeOuEgaleA(MondePong2d mondePong2d2) {
        return this.mondePong2d.siVersionPlusPetiteQue(mondePong2d2);
    }

}
