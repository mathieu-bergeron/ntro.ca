public class MondePong2d extends World2dFx<ObjetPong2d, MondePong2d> {

    // ajouter des attributs
    private Palette2d paletteGauche;
    private Palette2d paletteDroite;
    private Balle2d balle;

    // générer les méthodes get/set

    @Override
    protected void initialize() {
        setWidth(LARGEUR_MONDE);
        setHeight(HAUTEUR_MONDE);

        paletteGauche = new Palette2d(25);
        paletteDroite = new Palette2d(LARGEUR_MONDE - 35);
        balle = new Balle2d(paletteGauche, paletteDroite);
        
        addObject2d(paletteGauche);
        addObject2d(paletteDroite);
        addObject2d(balle);

    }

    public void appliquerActionJoueur(Cadran cadran, Action action) {
        Palette2d palette = paletteDuCadran(cadran);

        appliquerActionJoueur(palette, action);
    }

    private Palette2d paletteDuCadran(Cadran cadran) {
        Palette2d palette;

        switch(cadran) {
        case GAUCHE:
        default:
            palette = paletteGauche;
            break;

        case DROITE:
            palette = paletteDroite;
            break;
        }

        return palette;
    }

    private void appliquerActionJoueur(Palette2d palette, Action action) {

        switch(action) {
        case HAUT:
            palette.monter();
            break;

        case BAS:
            palette.descendre();
            break;

        case ARRET:
        default:
            palette.arreter();
        }

    }


    // ...

}
