public class VuePartie extends ViewFx {

    // ...

    @FXML
    private CanvasPartie canvasPartie;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ...
        
        initialiserCanvasPartie();
    }

    private void initialiserCanvasPartie() {
        canvasPartie.setWorldWidth(MondePong2d.LARGEUR_MONDE);
        canvasPartie.setWorldHeight(MondePong2d.HAUTEUR_MONDE);
    }
