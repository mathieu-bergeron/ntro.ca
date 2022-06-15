public class VueFileAttente extends ViewFx {
    
    @FXML
    private Button boutonAjouterRendezVous;

    @FXML
    private VBox conteneurRendezVous;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Ntro.assertNotNull("boutonAjouterRendezVous", boutonAjouterRendezVous);
        Ntro.assertNotNull("conteneurRendezVous", conteneurRendezVous);

        installerMsgAjouterRendezVous();
    }

    private void installerMsgAjouterRendezVous() {

        MsgAjouterRendezVous msgAjouterRendezVous = NtroApp.newMessage(MsgAjouterRendezVous.class);

        boutonAjouterRendezVous.setOnAction(evtFx -> {

            msgAjouterRendezVous.setNomPremierJoueur(Session.nomUsager);
            msgAjouterRendezVous.send();

        });
    }

    public void ajouterRendezVous(FragmentRendezVous vueRendezVous) {
        conteneurRendezVous.getChildren().add(vueRendezVous.rootNode());
        conteneurRendezVous.getChildren().add(petitEspaceVertical());
    }
    
    private Pane petitEspaceVertical() {

        Pane petitEspaceVertical = new Pane();

        petitEspaceVertical.getStyleClass().add("petit-espace-vertical");

        return petitEspaceVertical;
    }

    public void viderListeRendezVous() {
        conteneurRendezVous.getChildren().clear();
    }
}
