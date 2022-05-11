public class Balle2d extends ObjetPong2d {
    

    // ajouter les attributs
    private Palette2d paletteGauche;
    private Palette2d paletteDroite;

    // générer les méthodes get/set


    // ajouter
    public Balle2d() {
        super();
    }

    // ajouter
    public Balle2d(Palette2d paletteGauche, Palette2d paletteDroite) {
        super();
        
        setPaletteGauche(paletteGauche);
        setPaletteDroite(paletteDroite);
    }


    private boolean balleFrappePalette(Palette2d palette) {
        return collidesWith(palette);
    }


    @Override
    public void onTimePasses(double secondsElapsed) {
        super.onTimePasses(secondsElapsed);

        if(balleFrappeMurGauche()) {

            // ...
           

        // ajouter des nouveaux cas
        }else if(balleFrappePalette(paletteGauche)) {

            balleRebondiSurPalette(paletteGauche);

        }else if(balleFrappePalette(paletteDroite)) {

            balleRebondiSurPalette(paletteDroite);

        }
    }

    private void balleRebondiSurPalette(Palette2d palette) {

        if(getTopLeftX() < palette.getTopLeftX()) {

            setTopLeftX(palette.getTopLeftX() - getWidth() - EPSILON);

        } else {

            setTopLeftX(palette.getTopLeftX() + palette.getWidth() + EPSILON);

        }

        setSpeedX(-getSpeedX());
    }


    // ...
