public class PartieEnCours extends RendezVous {
    
    private String nomDeuxiemeJoueur;
    private String idPartie;

    public String getNomDeuxiemeJoueur() {
        return nomDeuxiemeJoueur;
    }

    public void setNomDeuxiemeJoueur(String nomDeuxiemeJoueur) {
        this.nomDeuxiemeJoueur = nomDeuxiemeJoueur;
    }

    public String getIdPartie() {
        return idPartie;
    }

    public void setIdPartie(String idPartie) {
        this.idPartie = idPartie;
    }
    
    
    

    public PartieEnCours() {
        super();
    }

    public PartieEnCours(String idRendezVous, 
                         String nomPremierJoueur,
                         String nomDeuxiemeJoueur,
                         String idPartie) {

        super(idRendezVous, nomPremierJoueur);

        setNomDeuxiemeJoueur(nomDeuxiemeJoueur);
        setIdPartie(idPartie);
    }


    @Override
    public FragmentRendezVous creerVue(ViewLoader<FragmentRendezVous> viewLoaderRendezVous, 
                                  ViewLoader<FragmentPartieEnCours> viewLoaderPartieEnCours) {
        
        return viewLoaderPartieEnCours.createView();
    }

    public void afficherSur(FragmentRendezVous vueRendezVous) {
        super.afficherSur(vueRendezVous);
        
        FragmentPartieEnCours vuePartieEnCours = (FragmentPartieEnCours) vueRendezVous;
        
        vuePartieEnCours.afficherNomDeuxiemeJoueur(nomDeuxiemeJoueur);

    }
    
    
    @Override
    public String toString() {
        return super.toString() + " Vs " + nomDeuxiemeJoueur;
    }

    public MsgDemarrerPartie creerMessageDemarrerPartie() {
        MsgDemarrerPartie msgDemarrerPartie = NtroApp.newMessage(MsgDemarrerPartie.class);
        
        msgDemarrerPartie.setNomPremierJoueur(getNomPremierJoueur());
        msgDemarrerPartie.setNomDeuxiemeJoueur(nomDeuxiemeJoueur);

        return msgDemarrerPartie;
    }

}
