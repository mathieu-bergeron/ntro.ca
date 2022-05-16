public class Balle2d extends ObjetPong2d {
    
    private static final double DUREE_ANIMATION = 2.5;
    private static final double EPSILON = 1;
    
    private Media sonPoc = new Media(Balle2d.class.getResource("/poc.wav").toString());
    private Image image = new Image("/balle.png");
    private MsgAjouterPoint msgAjouterPoint = NtroApp.newMessage(MsgAjouterPoint.class);
    
    private double secondes_restantes_animation = 0;
    private boolean selectionnee;
    private Palette2d paletteGauche;
    private Palette2d paletteDroite;

    public boolean getSelectionnee() {
        return selectionnee;
    }

    public void setSelectionnee(boolean selectionnee) {
        this.selectionnee = selectionnee;
    }
    
    public Palette2d getPaletteGauche() {
        return paletteGauche;
    }

    public void setPaletteGauche(Palette2d paletteGauche) {
        this.paletteGauche = paletteGauche;
    }

    public Palette2d getPaletteDroite() {
        return paletteDroite;
    }

    public void setPaletteDroite(Palette2d paletteDroite) {
        this.paletteDroite = paletteDroite;
    }

    public Balle2d() {
        super();
    }

    public Balle2d(Palette2d paletteGauche, Palette2d paletteDroite) {
        super();
        
        setPaletteGauche(paletteGauche);
        setPaletteDroite(paletteDroite);
    }

    @Override
    public void initialize() {
        setWidth(10);
        setHeight(10);
        
        choisirEtatInitial();
    }

    private void choisirEtatInitial() {

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
    
    @Override
    public void onTimePasses(double secondsElapsed) {
        super.onTimePasses(secondsElapsed);
        
        if(secondes_restantes_animation > 0) {
            secondes_restantes_animation -= secondsElapsed;
        }
        
        
        if(balleFrappeMurGauche()) {

            //balleRebondiSurMurGauche();
            choisirEtatInitial();
            ajouterPoint(Cadran.DROITE);
            
        } else if(balleFrappeMurDroit()) {

            //balleRebondiSurMurDroit();
            choisirEtatInitial();
            ajouterPoint(Cadran.GAUCHE);

        }else if(balleFrappePalette(paletteGauche)) {
            
            balleRebondiSurPalette(paletteGauche);

        }else if(balleFrappePalette(paletteDroite)) {
            
            balleRebondiSurPalette(paletteDroite);
        }
        

        if(balleFrappePlafond()) {
            
            balleRebondiSurPlafond();
            
        }else if(balleFrappePlancher()) {

            balleRebondiSurPlancher();
        }
    }

    private void ajouterPoint(Cadran cadran) {
        getWorld().incrementerVersion();
        msgAjouterPoint.setMondePong2d(getWorld());
        msgAjouterPoint.setCadran(cadran.name());
        msgAjouterPoint.send();
    }

    private void balleRebondiSurPlancher() {
        jouerSonPoc();

        setTopLeftY(getWorld().getHeight() - this.getHeight() - EPSILON);
        setSpeedY(-getSpeedY());
    }

    private void jouerSonPoc() {
        new MediaPlayer(sonPoc).play();
    }

    private void balleRebondiSurPlafond() {
        jouerSonPoc();

        setTopLeftY(0 + EPSILON);
        setSpeedY(-getSpeedY());
    }

    private void balleRebondiSurMurDroit() {
        jouerSonPoc();

        setTopLeftX(getWorld().getWidth() - this.getWidth() - EPSILON);
        setSpeedX(-getSpeedX());
    }

    private void balleRebondiSurMurGauche() {
        jouerSonPoc();

        setTopLeftX(0 + EPSILON);
        setSpeedX(-getSpeedX());
    }

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

    private boolean balleFrappePalette(Palette2d palette) {
        return collidesWith(palette);
    }

    private void balleRebondiSurPalette(Palette2d palette) {
        jouerSonPoc();
        
        if(getTopLeftX() < palette.getTopLeftX()) {

            setTopLeftX(palette.getTopLeftX() - getWidth() - EPSILON);

        }else {

            setTopLeftX(palette.getTopLeftX() + palette.getWidth() + EPSILON);

        }
        
        setSpeedX(-getSpeedX());
        
        palette.insererEffet();
    }

    @Override
    public void draw(GraphicsContext gc) {
        
        double echelonnage = 1.0;
        if(secondes_restantes_animation > 0) {
            double pourcentage_ecoule_animation = secondes_restantes_animation / DUREE_ANIMATION;
            echelonnage = 1 + 2*Math.sin(Math.PI * pourcentage_ecoule_animation);
        }
        
        gc.drawImage(image,
                     getTopLeftX(),
                     getTopLeftY(),
                     getWidth() * echelonnage,
                     getHeight() * echelonnage);
        
        
        /*
        gc.fillArc(getTopLeftX(),
                   getTopLeftY(),
                   getWidth(), 
                   getHeight(), 
                   0, 
                   360, ArcType.CHORD);
                   */

    }
    
    public void demarrerAnimation() {
        secondes_restantes_animation = DUREE_ANIMATION;
    }

    @Override
    protected boolean onMouseEvent(MouseEvent evtFx, double x, double y) {
        return false;
    }

}
