public class PartieEnCours extends RendezVous {

    // ...


    // ajouter
    public MsgDemarrerPartie creerMessageDemarrerPartie() {
        MsgDemarrerPartie msgDemarrerPartie = NtroApp.newMessage(MsgDemarrerPartie.class);
        
        msgDemarrerPartie.setNomPremierJoueur(getNomPremierJoueur());
        msgDemarrerPartie.setNomDeuxiemeJoueur(nomDeuxiemeJoueur);

        return msgDemarrerPartie;
    }
