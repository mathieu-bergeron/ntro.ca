public class VueFileAttente extends ViewFx {

    // ...

    @FXML
    private Label labelMessage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ...
        Ntro.assertNotNull("labelMessage", labelMessage);

        // ...
    }

    // ...
