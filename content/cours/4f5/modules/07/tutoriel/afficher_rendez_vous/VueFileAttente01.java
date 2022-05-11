public class VueFileAttente extends ViewFx {

    // ...

    @FXML
    private Label labelMessage;

    // ...

    public void afficherMessage(String message) {
        labelMessage.setText(message);
    }
