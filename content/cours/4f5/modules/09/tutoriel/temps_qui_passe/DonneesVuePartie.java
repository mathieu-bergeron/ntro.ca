public class DonneesVuePartie implements ViewData {

    private static long CALCULER_FPS_A_CHAQUE_X_MILLISECONDES = 200;

    private long horodatageDernierCalculFps = Ntro.time().nowMilliseconds();
    private long imagesAfficheesDepuisDernierCalculFps = 0;

    private MondePong2d mondePong2d = new MondePong2d();
    private String fpsCourant = "0";

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

    public void reagirTempsQuiPasse(double elapsedTime) {
        mondePong2d.onTimePasses(elapsedTime);
    }

}
