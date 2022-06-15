public class MondePong2d extends World2dFx<ObjetPong2d, MondePong2d> {
    
    public static final double LARGEUR_MONDE = 640;
    public static final double HAUTEUR_MONDE = 360;

    @Override
    protected void initialize() {
        setWidth(LARGEUR_MONDE);
        setHeight(HAUTEUR_MONDE);

        // ...
    }
