public class MondePong2d extends World2dFx<ObjetPong2d, MondePong2d> {
    
    // ...

    public void demarrerPartie() {
        balle.choisirEtatInitial();

        // ajouter
        etatInitialPalettes();
    }

    // ajouter
    private void etatInitialPalettes() {
        paletteGauche.etatInitial(30);
        paletteDroite.etatInitial(LARGEUR_MONDE - 40);
    }
