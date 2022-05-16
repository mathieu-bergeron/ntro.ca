public class MondePong2d extends World2dFx<ObjetPong2d, MondePong2d> {
    
    public static final double LARGEUR_MONDE = 640;
    public static final double HAUTEUR_MONDE = 360;
    
    private long version = 0;
    private Palette2d paletteGauche;
    private Palette2d paletteDroite;
    private Balle2d balle;


    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
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

    public Balle2d getBalle() {
        return balle;
    }

    public void setBalle(Balle2d balle) {
        this.balle = balle;
    }

    @Override
    protected void initialize() {
        setWidth(LARGEUR_MONDE);
        setHeight(HAUTEUR_MONDE);

        paletteGauche = new Palette2d();
        paletteDroite = new Palette2d();
        balle = new Balle2d(paletteGauche, paletteDroite);
        
        addObject2d(paletteGauche);
        addObject2d(paletteDroite);
        addObject2d(balle);
        
        etatInitialPalettes();

        /*
        for(int i = 0; i < 100; i++) {
            addObject2d(new Balle2d(paletteGauche, paletteDroite));
        }*/
    }

    private void etatInitialPalettes() {
        paletteGauche.etatInitial(30);
        paletteDroite.etatInitial(LARGEUR_MONDE - 40);
    }

    @Override
    public void draw(GraphicsContext gc) {

        dessinerTerrain(gc);
        
        super.draw(gc);
    }

    private void dessinerTerrain(GraphicsContext gc) {
        gc.save();
        gc.setStroke(Color.LIGHTGREY);
        gc.setLineWidth(1);

        dessinerBordureTerrain(gc);
        dessinerLigneMediane(gc);

        gc.restore();
    }

    private void dessinerLigneMediane(GraphicsContext gc) {
        double ligneX = getWidth() / 2;
        double nombreCases = 64;
        double tailleCase = getHeight() / nombreCases;

        for(int i = 0; i < nombreCases; i++) {
            if(i%2 == 0) {
                double ligneY = i*tailleCase;
                gc.strokeLine(ligneX, 
                              ligneY, 
                              ligneX, 
                              ligneY + tailleCase);
            }
        }
    }

    private void dessinerBordureTerrain(GraphicsContext gc) {
        gc.strokeRect(0, 0, getWidth(), getHeight());
    }
    
    
    public void incrementerVersion() {
        version++;
    }
    
    public void afficherSur(World2dCanvas canvasPartie) {
        canvasPartie.displayWorld2d(this);
    }

    public boolean appliquerActionJoueur(Cadran cadran, Action action) {
        Palette2d palette = paletteDuCadran(cadran);

        return appliquerActionJoueur(palette, action);
    }

    private boolean appliquerActionJoueur(Palette2d palette, Action action) {
        boolean siNouvelleAction = false;

        switch(action) {
        case HAUT:
            siNouvelleAction = palette.monter();
            break;

        case BAS:
            siNouvelleAction = palette.descendre();
            break;

        case ARRET:
            siNouvelleAction = palette.arreter();
        }

        return siNouvelleAction;
    }

    private Palette2d paletteDuCadran(Cadran cadran) {
        Palette2d palette;

        switch(cadran) {
        case GAUCHE:
        default:
            palette = paletteGauche;
            break;

        case DROITE:
            palette = paletteDroite;
            break;
        }

        return palette;
    }

    @Override
    protected void onMouseEventNotConsumed(MouseEvent evtFx, double x, double y) {
        paletteGauche.deselectionner();
        paletteDroite.deselectionner();
        balle.demarrerAnimation();
    }

    public boolean siVersionPlusPetiteOuEgaleA(MondePong2d mondePong2d2) {
        return mondePong2d2.siVersionPlusGrandeQue(version);
    }

    private boolean siVersionPlusGrandeQue(long version) {
        return this.version > version;
    }

    public void copierVersionDans(MondePong2d mondePong2d) {
        mondePong2d.setVersion(version);
    }

    public void demarrerPartie() {
        etatInitialPalettes();
        balle.choisirEtatInitial();
    }

    public boolean memeVersionQue(MondePong2d mondePong2d2) {
        return mondePong2d2.siVersionEst(version);
    }

    private boolean siVersionEst(long version) {
        return this.version == version;
    }

    public void copierBalleDe(Balle2d balle) {
        this.balle.copyDataFrom(balle);
    }

    public void copierBalleDans(MsgPropagerActionJoueur msgPropagerActionJoueur) {
        msgPropagerActionJoueur.setBalle(balle);
    }

}
