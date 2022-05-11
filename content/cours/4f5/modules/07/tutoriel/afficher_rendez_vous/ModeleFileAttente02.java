public class ModeleFileAttente implements Model {

    // ...

    private List<RendezVous> rendezVousDansOrdre = new ArrayList<>();

    // ...

    @Override
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
