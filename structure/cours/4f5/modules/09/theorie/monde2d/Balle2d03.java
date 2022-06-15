public class Balle2d extends ObjetPong2d {

    // ...
   

    private boolean balleFrappePlancher() {
        return collidesWith(0,                        // x
                            getWorld().getHeight(),   // y
                            getWorld().getWidth(),    // largeur
                            1);                       // hauteur
    }
