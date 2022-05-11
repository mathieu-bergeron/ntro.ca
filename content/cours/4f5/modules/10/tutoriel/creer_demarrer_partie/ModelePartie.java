public class ModelePartie implements Model {
    
    private MondePong2d mondePong2d = new MondePong2d();

    private String nomPremierJoueur = "";
    private String nomDeuxiemeJoueur = "";

    private int scorePremierJoueur = 0;
    private int scoreDeuxiemeJoueur = 0;

    public MondePong2d getMondePong2d() {
        return mondePong2d;
    }

    public void setMondePong2d(MondePong2d mondePong2d) {
        this.mondePong2d = mondePong2d;
    }

    public String getNomPremierJoueur() {
        return nomPremierJoueur;
    }

    public void setNomPremierJoueur(String nomPremierJoueur) {
        this.nomPremierJoueur = nomPremierJoueur;
    }

    public String getNomDeuxiemeJoueur() {
        return nomDeuxiemeJoueur;
    }

    public void setNomDeuxiemeJoueur(String nomDeuxiemeJoueur) {
        this.nomDeuxiemeJoueur = nomDeuxiemeJoueur;
    }

    public int getScorePremierJoueur() {
        return scorePremierJoueur;
    }

    public void setScorePremierJoueur(int scorePremierJoueur) {
        this.scorePremierJoueur = scorePremierJoueur;
    }

    public int getScoreDeuxiemeJoueur() {
        return scoreDeuxiemeJoueur;
    }

    public void setScoreDeuxiemeJoueur(int scoreDeuxiemeJoueur) {
        this.scoreDeuxiemeJoueur = scoreDeuxiemeJoueur;
    }
    
    
    public void afficherInfoPartieSur(VuePartie vuePartie) {
        vuePartie.afficherNomPremierJoueur(nomPremierJoueur);
        vuePartie.afficherNomDeuxiemeJoueur(nomDeuxiemeJoueur);

        vuePartie.afficherScorePremierJoueur(String.valueOf(scorePremierJoueur));
        vuePartie.afficherScoreDeuxiemeJoueur(String.valueOf(scoreDeuxiemeJoueur));
    }

    public void copierDonneesDans(DonneesVuePartie donneesVuePartie) {
        donneesVuePartie.copierDonnesDe(mondePong2d);
    }

    /*
    public void appliquerActionJoueur(Cadran cadran, Action action) {
        mondePong2d.appliquerActionJoueur(cadran, action);
    }*/

    public void copierDonnesDe(MondePong2d mondePong2d) {
        mondePong2d.copierVersionDans(this.mondePong2d);
        this.mondePong2d.copyDataFrom(mondePong2d);
    }

    public void ajouterPointPour(Cadran cadran) {
        switch(cadran) {
        case GAUCHE:
        default:
            scorePremierJoueur++;
            break;

        case DROITE:
            scoreDeuxiemeJoueur++;
            break;
        }
    }

    public boolean siVersionPlusGrandeQue(DonneesVuePartie donneesVuePartie) {
        return donneesVuePartie.siVersionPlusPetiteOuEgaleA(mondePong2d);
    }

    public boolean siVersionPlusPetiteOuEgaleA(MondePong2d mondePong2d2) {
        return this.mondePong2d.siVersionPlusPetiteOuEgaleA(mondePong2d2);
    }

    public void copierVersionDans(DonneesVuePartie donneesVuePartie) {
        donneesVuePartie.copierVersionDe(mondePong2d);
    }

    public void demarrer() {
        mondePong2d.incrementerVersion();

        scorePremierJoueur = 0;
        scoreDeuxiemeJoueur = 0;
        
        mondePong2d.demarrerPartie();

    }

    public void incrementerVersion() {
        mondePong2d.incrementerVersion();
    }

    public void appliquerActionJoueur(Cadran cadran, Action action) {
        mondePong2d.appliquerActionJoueur(cadran, action);
    }

    public boolean memeVersionQue(MondePong2d mondePong2d2) {
        return this.mondePong2d.memeVersionQue(mondePong2d2);
    }

}
