public class VuePartie extends ViewFx {

    // ...

    public void viderCanvas() {
        canvasPartie.clearCanvas();
    }

    public void afficherImagesParSeconde(String fps) {
        canvasPartie.displayFps(fps);
    }

    public void afficherPong2d(MondePong2d mondePong2d) {
        canvasPartie.displayWorld2d(mondePong2d);
    }
