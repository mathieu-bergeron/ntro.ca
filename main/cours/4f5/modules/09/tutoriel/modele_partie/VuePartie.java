public class VuePartie extends ViewFx {

    // ...
    
    // ajouter 

    @FXML
    private Label labelNomPremierJoueur;

    @FXML
    private Label labelNomDeuxiemeJoueur;

    @FXML
    private Label labelScorePremierJoueur;

    @FXML
    private Label labelScoreDeuxiemeJoueur;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ajouter
        Ntro.assertNotNull("labelNomPremierJoueur", labelNomPremierJoueur);
        Ntro.assertNotNull("labelNomDeuxiemeJoueur", labelNomDeuxiemeJoueur);

        Ntro.assertNotNull("labelScorePremierJoueur", labelScorePremierJoueur);
        Ntro.assertNotNull("labelScoreDeuxiemeJoueur", labelScoreDeuxiemeJoueur);

        // ...
    }

    // ...

    public void afficherNomPremierJoueur(String nomPremierJoueur) {
        labelNomPremierJoueur.setText(nomPremierJoueur);
    }


    public void afficherNomDeuxiemeJoueur(String nomDeuxiemeJoueur) {
        labelNomDeuxiemeJoueur.setText(nomDeuxiemeJoueur);
    }


    public void afficherScorePremierJoueur(String scorePremierJoueur) {
        labelScorePremierJoueur.setText(scorePremierJoueur);
    }


    public void afficherScoreDeuxiemeJoueur(String scoreDeuxiemeJoueur) {
        labelScoreDeuxiemeJoueur.setText(scoreDeuxiemeJoueur);
    }

}
