public class Balle2d extends ObjetPong2d {

    // ...
    
    @Override
    public void onTimePasses(double secondsElapsed) {
        // comportement par défaut
        super.onTimePasses(secondsElapsed);
        
        // comportement spécifique à la balle
        if(balleFrappeMurGauche()) {

            balleRebondiSurMurGauche();
            
        } else if(balleFrappeMurDroit()) {

            balleRebondiSurMurDroit();

        } // ...
    }
