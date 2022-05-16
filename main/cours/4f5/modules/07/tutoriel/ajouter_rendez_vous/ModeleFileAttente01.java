public class ModeleFileAttente implements Model {

    private long prochainIdRendezVous = 1;
    private List<RendezVous> rendezVousDansOrdre = new ArrayList<>();

    // ...

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

