public class VueFileAttente extends ViewFx {
    
    @FXML
    private Button boutonOuvrirPartie; // à retirer

    @FXML
    private Button boutonAjouterRendezVous;

    @FXML
    private Label labelMessage; // à retirer

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // à retirer
        Ntro.assertNotNull("boutonOuvrirPartie", boutonOuvrirPartie); 
        Ntro.assertNotNull("labelMessage", labelMessage);

        // ...

    }

