public class Palette2d extends ObjetPong2d {
    
    private static final double VITESSE_PALETTE = 200;

    public Palette2d() {
        super();
    }

    public Palette2d(double topLeftX) {
        super();

        setTopLeftX(topLeftX);
    }

    @Override
    public void initialize() {
        setWidth(10);
        setHeight(100);
        
        setTopLeftY(getWorld().getHeight()/2 - getHeight()/2);
    }

    @Override
    public void draw(GraphicsContext gc) {

        gc.save();

        gc.fillRect(getTopLeftX(),
                    getTopLeftY(),
                    getWidth(), 
                    getHeight());
        
        gc.restore();
    }
    
    
    @Override
    protected boolean onMouseEvent(MouseEvent evtFx, double x, double y) {
        return false;
    }

    public void monter() {
        setSpeedY(-VITESSE_PALETTE);
    }

    public void descendre() {
        setSpeedY(+VITESSE_PALETTE);
    }

    public void arreter() {
        setSpeedY(0);
    }
}
