public class ModelePartie implements Model {

    // ...

    public void demarrer() {
        scorePremierJoueur = 0;
        scoreDeuxiemeJoueur = 0;
        
        mondePong2d.demarrerPartie();
    }
