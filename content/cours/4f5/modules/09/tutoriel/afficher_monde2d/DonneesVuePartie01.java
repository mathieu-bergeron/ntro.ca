public class DonneesVuePartie implements ViewData {

    // ...

    public void afficherSur(VuePartie vuePartie) {

        vuePartie.viderCanvas();
        vuePartie.afficherImagesParSeconde("FPS " + fpsCourant);
        vuePartie.afficherPong2d(mondePong2d);

    }
