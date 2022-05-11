public class Palette2d extends ObjetPong2d {
    
    private static final double DUREE_EFFET = 0.4;

    private double secondesRestantesPourEffet = 0;
    private InnerShadow innerShadow = new InnerShadow();

    @Override
    public void onTimePasses(double secondsElapsed) {
        // comportement par défaut
        super.onTimePasses(secondsElapsed);
        
        // noter que l'effet progresse
        if(secondesRestantesPourEffet > 0) {
            secondesRestantesPourEffet -= secondsElapsed;
        }
    }


    @Override
    public void draw(GraphicsContext gc) {

        gc.save();

        if(secondesRestantesPourEffet > 0) {
            innerShadow.setOffsetX(getWidth() * secondesRestantesPourEffet / DUREE_EFFET);
            innerShadow.setOffsetY(0);
            innerShadow.setColor(Color.DARKBLUE);
            gc.setEffect(innerShadow);
        }

        gc.fillRect(getTopLeftX(),
                    getTopLeftY(),
                    getWidth(), 
                    getHeight());
        
        gc.restore();
    }
    
    public void insererEffet() {
        secondesRestantesPourEffet = DUREE_EFFET;
    }
