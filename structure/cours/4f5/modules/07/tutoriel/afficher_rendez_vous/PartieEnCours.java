public class PartieEnCours extends RendezVous {
    
    private String nomDeuxiemeJoueur;

    // ...
    
    @Override
    public String toString() {
        return super.toString() + " Vs " + nomDeuxiemeJoueur;
    }
