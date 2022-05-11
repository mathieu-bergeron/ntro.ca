public class Balle2d extends ObjetPong2d {

    // ajouter
    private static final double EPSILON = 1;
    

    // ...

    // ajouter
    @Override
    public void onTimePasses(double secondsElapsed) {
        super.onTimePasses(secondsElapsed);
        
        if(balleFrappeMurGauche()) {

            balleRebondiSurMurGauche();
            
        }else if(balleFrappeMurDroit()) {

            balleRebondiSurMurDroit();

        }else if(balleFrappePlafond()) {
            
            balleRebondiSurPlafond();
            
        }else if(balleFrappePlancher()) {

            balleRebondiSurPlancher();
        }
    }
