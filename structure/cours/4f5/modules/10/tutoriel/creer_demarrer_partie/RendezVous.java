public class RendezVous implements Value {
    
    private String idRendezVous;
    private String nomPremierJoueur;

    public String getNomPremierJoueur() {
        return nomPremierJoueur;
    }

    public void setNomPremierJoueur(String nomPremierJoueur) {
        this.nomPremierJoueur = nomPremierJoueur;
    }

    public String getIdRendezVous() {
        return idRendezVous;
    }

    public void setIdRendezVous(String idRendezVous) {
        this.idRendezVous = idRendezVous;
    }


    public RendezVous() {
    }

    public RendezVous(String idRendezVous, String nomPremierJoueur) {
        setIdRendezVous(idRendezVous);
        setNomPremierJoueur(nomPremierJoueur);
    }

    @Override
    public String toString() {
        return nomPremierJoueur;
    }

    public void afficherSur(FragmentRendezVous vueRendezVous) {

        vueRendezVous.identifierRendezVous(idRendezVous);
        vueRendezVous.afficherNomPremierJoueur(nomPremierJoueur);

    }

    public FragmentRendezVous creerVue(ViewLoader<FragmentRendezVous> viewLoaderRendezVous, 
                                  ViewLoader<FragmentPartieEnCours> viewLoaderPartieEnCours) {
        
        return viewLoaderRendezVous.createView();
    }

    public PartieEnCours creerPartieEnCours(String nomDeuxiemeJoueur, String idPartie) {

        return new PartieEnCours(idRendezVous, 
                                 nomPremierJoueur, 
                                 nomDeuxiemeJoueur,
                                 idPartie);
    }

    public boolean siIdEst(String idRendezVous) {
        return this.idRendezVous.equals(idRendezVous);
    }

}
