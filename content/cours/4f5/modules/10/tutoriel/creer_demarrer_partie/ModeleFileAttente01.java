public class ModeleFileAttente implements Model {

    private transient Date dateOuverture;

    private String heureOuverture;
    
    private String idFileAttente = "filePrincipale";

    private long prochainIdRendezVous = 1;

    private List<RendezVous> rendezVousDansOrdre = new ArrayList<>();
    //private Map<String, RendezVous> rendezVousParId = new HashMap<>();

    public long getProchainIdRendezVous() {
        return prochainIdRendezVous;
    }

    public void setProchainIdRendezVous(long prochainIdRendezVous) {
        this.prochainIdRendezVous = prochainIdRendezVous;
    }

    public List<RendezVous> getRendezVousDansOrdre() {
        return rendezVousDansOrdre;
    }

    public void setRendezVousDansOrdre(List<RendezVous> rendezVousDansOrdre) {
        this.rendezVousDansOrdre = rendezVousDansOrdre;
    }

    public String getIdFileAttente() {
        return idFileAttente;
    }

    public void setIdFileAttente(String idFileAttente) {
        this.idFileAttente = idFileAttente;
    }

    public String getHeureOuverture() {
        return heureOuverture;
    }

    public void setHeureOuverture(String heureOuverture) {
        this.heureOuverture = heureOuverture;
    }

    /*
    public Map<String, RendezVous> getRendezVousParId() {
        return rendezVousParId;
    }

    public void setRendezVousParId(Map<String, RendezVous> rendezVousParId) {
        this.rendezVousParId = rendezVousParId;
    }
    */
    



    public ModeleFileAttente() {
    }


    public void ajouterRendezVousPour(String nomPremierJoueur) {
        String idRendezVous = genererIdRendezVous();
        RendezVous rendezVous = new RendezVous(idRendezVous, nomPremierJoueur);

        rendezVousDansOrdre.add(rendezVous);
    }

    private String genererIdRendezVous() {
        String idRendezVous = String.valueOf(prochainIdRendezVous);
        prochainIdRendezVous++;

        return idRendezVous;
    }
    

    public void afficherSur(VueFileAttente vueFileAttente, 
                            ViewLoader<FragmentRendezVous> viewLoaderRendezVous,
                            ViewLoader<FragmentPartieEnCours> viewLoaderPartieEnCours) {
        
        vueFileAttente.viderListeRendezVous();
        
        for(RendezVous rendezVous : rendezVousDansOrdre) {
            
            FragmentRendezVous vueRendezVous = rendezVous.creerVue(viewLoaderRendezVous, viewLoaderPartieEnCours);

            rendezVous.afficherSur(vueRendezVous);

            vueFileAttente.ajouterRendezVous(vueRendezVous);
        }
    }
    
    public String toString() {

        StringBuilder builder = new StringBuilder();
        int numeroRendezVous = 1;
        
        for(RendezVous rendezVous : rendezVousDansOrdre) {

            builder.append(numeroRendezVous);
            builder.append(". ");
            builder.append(rendezVous.toString());
            builder.append("\n");

            numeroRendezVous++;
        }

        return builder.toString();
    }

    public void initialiser() {
        dateOuverture = new Date();
        heureOuverture = new SimpleDateFormat("EEEE HH:mm").format(dateOuverture);
    }

    public MsgDemarrerPartie creerPartie(String idRendezVous, String nomDeuxiemeJoueur) {
        MsgDemarrerPartie msgDemarrerPartie = null;

        RendezVous rendezVous = rendezVousParId(idRendezVous);
        
        if(rendezVous != null) {
            
            int indiceRendezVous = rendezVousDansOrdre.indexOf(rendezVous);
            rendezVousDansOrdre.remove(indiceRendezVous);

            PartieEnCours partieEnCours = rendezVous.creerPartieEnCours(nomDeuxiemeJoueur, "partie01");

            rendezVousDansOrdre.add(indiceRendezVous, partieEnCours);
            
            msgDemarrerPartie = partieEnCours.creerMessageDemarrerPartie();
            
        }
        
        return msgDemarrerPartie;
    }

    private RendezVous rendezVousParId(String idRendezVous) {
        RendezVous rendezVous = null;
        
        for(RendezVous candidat : rendezVousDansOrdre) {
            if(candidat.siIdEst(idRendezVous)) {
                rendezVous = candidat;
                break;
            }
        }

        return rendezVous;
    }

}
