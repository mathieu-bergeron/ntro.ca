public class VueFileAttente extends ViewFx {
    
    // ...
    

    // Ajouter
    @FXML
    private VBox conteneurRendezVous;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ...

        // Ajouter
        Ntro.assertNotNull("conteneurRendezVous", conteneurRendezVous);
        
        // ...
    }
