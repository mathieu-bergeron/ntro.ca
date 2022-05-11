public class RendezVous implements Value {
    
    private String idRendezVous;
    private String nomPremierJoueur;

    // ...

    public RendezVous() {
    }

    public RendezVous(String idRendezVous, String nomPremierJoueur) {
        setIdRendezVous(idRendezVous);
        setNomPremierJoueur(nomPremierJoueur);
    }
