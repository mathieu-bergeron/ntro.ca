public class VuePartie extends ViewFx {

    // ...
    
    // ajouter
    @FXML
    private CanvasPartie canvasPartie;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ...

        // ajouter
        Ntro.assertNotNull("canvasPartie", canvasPartie);

        // ajouter
        initialiserCanvasPartie();
    }


    // ajouter la méthode
    private void initialiserCanvasPartie() {
        canvasPartie.setWorldWidth(MondePong2d.LARGEUR_MONDE);
        canvasPartie.setWorldHeight(MondePong2d.HAUTEUR_MONDE);
    }

    // ...
