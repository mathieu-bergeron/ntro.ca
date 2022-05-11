public class Balle2d extends ObjetPong2d {

    

    @Override
    public void initialize() {
        setWidth(10);
        setHeight(10);
        
        choisirEtatInitial();
    }

    private void choisirEtatInitial() {

        setTopLeftY(10);
        setSpeedY(100 + Ntro.random().nextInt(20));

        if(Ntro.random().nextBoolean()) {

            setTopLeftX(100);
            setSpeedX(100 + Ntro.random().nextInt(20));
            
        }else {

            setTopLeftX(MondePong2d.LARGEUR_MONDE - 100 - getWidth());
            setSpeedX(-100 - Ntro.random().nextInt(20));

        }
    }
    
    @Override
    public void onTimePasses(double secondsElapsed) {
        super.onTimePasses(secondsElapsed);
        
        if(balleFrappeMurGauche()) {

            choisirEtatInitial();
            ajouterPoint(Cadran.DROITE);
            
        } else if(balleFrappeMurDroit()) {

            choisirEtatInitial();
            ajouterPoint(Cadran.GAUCHE);

        } 

        // ...
        
    }

    // ajouter
    private void ajouterPoint(Cadran cadran) {
        MsgAjouterPoint msgAjouterPoint = NtroApp.newMessage(MsgAjouterPoint.class);
        msgAjouterPoint.setMondePong2d(getWorld());
        msgAjouterPoint.setCadran(cadran.name());
        msgAjouterPoint.send();
    }

