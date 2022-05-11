public class Palette2d extends ObjetPong2d {

    // ...

    // ajouter
    public void etatInitial(double topLeftX) {
        setTopLeftX(topLeftX);
        setTopLeftY(getWorld().getHeight()/2 - getHeight()/2);
        setSpeedX(0);
        setSpeedY(0);
    }

