public class ModeleFileAttente implements Model {

    // ...

    private List<RendezVous> rendezVousDansOrdre = new ArrayList<>();

    // ...

    public void afficherSur(VueFileAttente vueFileAttente) {

        vueFileAttente.afficherMessage(this.toString());
    }
