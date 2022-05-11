public class MondePong2d extends World2dFx<ObjetPong2d, MondePong2d> {

    @Override
    protected void initialize() {
        // ...
        
        addObject2d(new Palette2d());
        addObject2d(new Balle2d());
    }
