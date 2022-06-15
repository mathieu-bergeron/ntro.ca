
public class MaVue {

    public void afficher(MonModele modele){

        afficherNomJoueur(modele.getNomJoueur());

        String numeroPartie = String.valueOf(modele.getNumeroDePartie());

        afficherNumeroPartie(numeroPartie);

    }

}


