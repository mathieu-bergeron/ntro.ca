public class Balle2d extends ObjetPong2d {

    @Override
    public void initialize() {
        setTopLeftX(100);
        setTopLeftX(100);
        setWidth(10);
        setHeight(10);
    }

    @Override
    protected boolean onMouseEvent(MouseEvent evtFx, 
                                   double worldX, 
                                   double worldY) {
        return false;
    }

    @Override
    public void draw(GraphicsContext gc) {

        gc.fillArc(getTopLeftX(),
                   getTopLeftY(),
                   getWidth(),
                   getHeight(),
                   0,
                   360,
                   ArcType.CHORD);
        
    }
}
