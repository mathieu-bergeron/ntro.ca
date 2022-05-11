public class VuePartie extends ViewFx {
    
    
    @FXML
    private Button boutonQuitterPartie;

    @FXML
    private CanvasPartie canvasPartie;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Ntro.assertNotNull("boutonQuitterPartie", boutonQuitterPartie);
        Ntro.assertNotNull("canvasPartie", canvasPartie);
        
        initialiserCanvasPartie();
        
        installerEvtAfficherFileAttente();
    }


    private void initialiserCanvasPartie() {
        canvasPartie.setWorldWidth(MondePong2d.LARGEUR_MONDE);
        canvasPartie.setWorldHeight(MondePong2d.HAUTEUR_MONDE);
    }


    private void installerEvtAfficherFileAttente() {
        
        EvtAfficherFileAttente evtNtro = NtroApp.newEvent(EvtAfficherFileAttente.class);

        boutonQuitterPartie.setOnAction(evtFx -> {

            evtNtro.trigger();
        });
    }


    public void viderCanvas() {
        canvasPartie.clearCanvas();
    }

    public void afficherImagesParSeconde(String fps) {
        canvasPartie.displayFps(fps);
    }

    public void afficherPong2d(MondePong2d mondePong2d) {
        canvasPartie.displayWorld2d(mondePong2d);
    }

}
