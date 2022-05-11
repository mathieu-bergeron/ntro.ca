public class RendezVous implements Value {

    // ...


    // ajouter
    public PartieEnCours creerPartieEnCours(String nomDeuxiemeJoueur, String idPartie) {

        return new PartieEnCours(idRendezVous, 
                                 nomPremierJoueur, 
                                 nomDeuxiemeJoueur,
                                 idPartie);
    }
