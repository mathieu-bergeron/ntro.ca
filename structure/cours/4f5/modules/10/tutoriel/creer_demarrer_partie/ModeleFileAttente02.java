public class ModeleFileAttente implements Model {

    // ...
    
    // ajouter
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
    
