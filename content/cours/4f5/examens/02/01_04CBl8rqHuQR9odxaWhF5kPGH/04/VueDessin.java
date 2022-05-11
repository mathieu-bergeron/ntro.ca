public class VueDessin extends {1:MCS:=ViewFx~World2dCanvas} {
    
    {1:MCS:=@FXML~∅}
    {1:MCS:=CanvasDessin~Canvas~∅} {1:MCS:=canvasDessin~∅};

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Ntro.assertNotNull({1:MCS:="canvasDessin"~"vueDessin"}, {1:MCS:=canvasDessin~this});
        
        initialiserCanvasDessin();
    }


    private void initialiserCanvasDessin() {
        {1:MCS:=canvasDessin~this}.setWorldWidth({1:MCS:=MondeDessin2d~World2dCanvas}.{1:MCS:=LARGEUR_DESSIN~WORLD_WIDTH});
        {1:MCS:=canvasDessin~this}.setWorldHeight({1:MCS:=MondeDessin2d~World2dCanvas}.{1:MCS:=HAUTEUR_DESSIN~WORLD_HEIGHT});
    }

    public void effacerCanvas() {
        {1:MCS:=canvasDessin~this}.{1:MCS:=clearCanvas()~clearRect(0,0,getWorld().getWidth(), getWorld().getHeight())};
    }

    public void afficherMondeDessin2d(MondeDessin2d mondeDessin2d) {
        {1:MCS:=canvasDessin~this}.{1:MCS:=displayWorld2d(mondeDessin2d)~afficherMonde2d(mondeDessin2d)};
    }
}
