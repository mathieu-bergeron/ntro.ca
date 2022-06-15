public class Balle2d extends ObjetPong2d {

    // ajouter
    private static final double EPSILON = 1;

    // ...
   

    private boolean balleFrappePlancher() {
        return collidesWith(0,
                            getWorld().getHeight(),
                            getWorld().getWidth(),
                            1);
    }

    private boolean balleFrappePlafond() {
        return collidesWith(0,
                            0,
                            getWorld().getWidth(),
                            1);
    }

    private boolean balleFrappeMurDroit() {
        return collidesWith(getWorld().getWidth(),
                            0,
                            1,
                            getWorld().getHeight());
    }

    private boolean balleFrappeMurGauche() {
        return collidesWith(0,
                            0,
                            1,
                            getWorld().getHeight());
    }

    private void balleRebondiSurPlancher() {
        setTopLeftY(getWorld().getHeight() - this.getHeight() - EPSILON);
        setSpeedY(-getSpeedY());
    }

    private void balleRebondiSurPlafond() {
        setTopLeftY(0 + EPSILON);
        setSpeedY(-getSpeedY());
    }

    private void balleRebondiSurMurDroit() {
        setTopLeftX(getWorld().getWidth() - this.getWidth() - EPSILON);
        setSpeedX(-getSpeedX());
    }

    private void balleRebondiSurMurGauche() {
        setTopLeftX(0 + EPSILON);
        setSpeedX(-getSpeedX());
    }

}
