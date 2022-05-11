public class ModeleFileAttente implements Model {

    // ...
    

    // compléter le code
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
