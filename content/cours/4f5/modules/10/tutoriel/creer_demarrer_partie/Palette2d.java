public class Palette2d extends ObjetPong2d {
    
    private static final double SECONDES_UN_EFFET = 0.4;
    private static final double VITESSE_PALETTE = 200;
    
    private boolean selectionnee;
    private double secondesRestantesPourEffet = 0;
    private InnerShadow innerShadow = new InnerShadow();

    public Palette2d() {
        super();
    }

    @Override
    public void initialize() {
        setWidth(10);
        setHeight(100);
    }

    public void etatInitial(double topLeftX) {
        setTopLeftX(topLeftX);
        setTopLeftY(getWorld().getHeight()/2 - getHeight()/2);
        setSpeedX(0);
        setSpeedY(0);
    }

    public void onTimePasses(double secondsElapsed) {
        super.onTimePasses(secondsElapsed);
        
        if(secondesRestantesPourEffet > 0) {
            secondesRestantesPourEffet -= secondsElapsed;
        }
    }


    @Override
    public void draw(GraphicsContext gc) {

        gc.save();

        if(selectionnee) {
            gc.setFill(Color.CYAN);
        }
        
        if(secondesRestantesPourEffet > 0) {
            innerShadow.setOffsetX(getWidth() * secondesRestantesPourEffet / SECONDES_UN_EFFET);
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
        secondesRestantesPourEffet = SECONDES_UN_EFFET;
    }
    
    @Override
    protected boolean onMouseEvent(MouseEvent evtFx, double x, double y) {

        selectionnee = !selectionnee;

        return true;
    }

    public void deselectionner() {
        selectionnee = false;
    }

    public boolean monter() {
        boolean siNouvelleAction = false; 

        if(getSpeedY() >= 0) {
            setSpeedY(-VITESSE_PALETTE);
            siNouvelleAction = true;
        }

        return siNouvelleAction;
    }

    public boolean descendre() {
        boolean siNouvelleAction = false; 

        if(getSpeedY() <= 0) {
            setSpeedY(+VITESSE_PALETTE);
            siNouvelleAction = true;
        }

        return siNouvelleAction;
    }

    public boolean arreter() {
        boolean siNouvelleAction = false; 

        if(getSpeedY() != 0) {
            setSpeedY(0);
            siNouvelleAction = true;
        }

        return siNouvelleAction;
    }

}
