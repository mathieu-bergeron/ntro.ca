public class MonModele {

    private String nomJoueur;
    private long numeroPartie;

    public afficherSur(MaVue vue){

        vue.afficherNomJoueur(nomJoueur);

        String numeroPartieChaine = String.valueOf(numeroPartie);

        vue.afficherNumeroPartie(numeroPartieChaine);

    }

}
