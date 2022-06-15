public class MondePong2d extends World2dFx<ObjetPong2d, MondePong2d> {
    
    // ...

    @Override
    protected void initialize() {

        // ...


        // ajouter
        for(int i = 0; i < 100; i++) {
            addObject2d(new Balle2d());
        }
    }
