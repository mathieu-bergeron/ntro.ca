public class Balle2d extends ObjetPong2d {

    // ...
    
    public void choisirEtatInitial() {

        setTopLeftY(10);
        setSpeedY(100 - Ntro.random().nextInt(20));

        if(Ntro.random().nextBoolean()) {

            setTopLeftX(100);
            setSpeedX(100 + Ntro.random().nextInt(20));
            
        }else {

            setTopLeftX(MondePong2d.LARGEUR_MONDE - 100 - getWidth());
            setSpeedX(-100 - Ntro.random().nextInt(20));

        }
    }
