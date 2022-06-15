public class Balle2d extends ObjetPong2d {

    // ...
   
    private boolean balleFrappePalette(Palette2d palette) {
        return collidesWith(palette);
    }

