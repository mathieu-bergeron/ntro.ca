public class MondePong2d extends World2dFx<ObjetPong2d, MondePong2d> {
    
    public static final double LARGEUR_MONDE = 640;
    public static final double HAUTEUR_MONDE = 360;

    @Override
    protected void initialize() {
        setWidth(LARGEUR_MONDE);
        setHeight(HAUTEUR_MONDE);

        paletteGauche = new Palette2d(30);
        paletteDroite = new Palette2d(LARGEUR_MONDE - 40);
        balle = new Balle2d(paletteGauche, paletteDroite);
        
        addObject2d(paletteGauche);
        addObject2d(paletteDroite);
        addObject2d(balle);
        
        /*
        for(int i = 0; i < 100; i++) {
            addObject2d(new Balle2d(paletteGauche, paletteDroite));
        }*/
    }
