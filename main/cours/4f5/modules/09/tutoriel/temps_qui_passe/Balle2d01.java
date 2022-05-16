public class Balle2d extends ObjetPong2d {

    // ...

    @Override
    public void initialize() {
        setTopLeftX(100);
        setTopLeftY(100);
        setWidth(10);
        setHeight(10);

        // ajouter
        setSpeedX(100 + Ntro.random().nextInt(100));
        setSpeedY(100 + Ntro.random().nextInt(100));
    }

    // ...
