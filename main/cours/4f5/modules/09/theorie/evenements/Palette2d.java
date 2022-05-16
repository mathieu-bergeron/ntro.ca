public class Palette2d extends ObjetPong2d {

    private static final double VITESSE_PALETTE = 200;

    // ...
    
    public void monter() {
        setSpeedY(-VITESSE_PALETTE);
    }

    public void descendre() {
        setSpeedY(+VITESSE_PALETTE);
    }

    public void arreter() {
        setSpeedY(0);
    }
