public class DonneesVuePartie implements ViewData {

    // ajouter
    private static long CALCULER_FPS_A_CHAQUE_X_MILLISECONDES = 200;


    // ajouter
    private long horodatageDernierCalculFps = Ntro.time().nowMilliseconds();
    private long imagesAfficheesDepuisDernierCalculFps = 0;


    public void afficherSur(VuePartie vuePartie) {
        // ajouter
        calculerFpsSiNecessaire();

        vuePartie.viderCanvas();
        vuePartie.afficherImagesParSeconde("FPS " + fpsCourant);
        vuePartie.afficherPong2d(mondePong2d);
        
        // ajouter
        imagesAfficheesDepuisDernierCalculFps++;
    }

    // ajouter la méthode
    private void calculerFpsSiNecessaire() {
        long horodatageMaintenant = Ntro.time().nowMilliseconds();
        long millisecondesEcoulees = horodatageMaintenant - horodatageDernierCalculFps;
        
        if(millisecondesEcoulees > CALCULER_FPS_A_CHAQUE_X_MILLISECONDES) {
            calculerFpsMaintenant(millisecondesEcoulees);

            imagesAfficheesDepuisDernierCalculFps = 0;
            horodatageDernierCalculFps = horodatageMaintenant;
        }
    }
    
    // ajouter la méthode
    private void calculerFpsMaintenant(long millisecondesEcoulees) {
        double secondesEcoulees = millisecondesEcoulees / 1E3;
        double fps = imagesAfficheesDepuisDernierCalculFps / secondesEcoulees;
        fpsCourant = String.valueOf(Math.round(fps));
    }

}
