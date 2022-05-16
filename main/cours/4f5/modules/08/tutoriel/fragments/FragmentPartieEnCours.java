public class FragmentPartieEnCours extends FragmentRendezVous {
    
    @FXML
    private Label labelNomDeuxiemeJoueur;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        super.initialize(location, resources);

        Ntro.assertNotNull("labelNomDeuxiemeJoueur", labelNomDeuxiemeJoueur);
    }

    public void afficherNomDeuxiemeJoueur(String nomDeuxiemeJoueur) {
        labelNomDeuxiemeJoueur.setText(nomDeuxiemeJoueur);
    }

}
