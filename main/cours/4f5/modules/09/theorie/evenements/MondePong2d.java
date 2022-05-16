public class MondePong2d extends World2dFx<ObjetPong2d, MondePong2d> {

    // ...
    
    public boolean appliquerActionJoueur(Cadran cadran, Action action) {
        Palette2d palette = paletteDuCadran(cadran);

        return appliquerActionJoueur(palette, action);
    }

    private boolean appliquerActionJoueur(Palette2d palette, Action action) {
        boolean siNouvelleAction = false;

        switch(action) {
        case HAUT:
            siNouvelleAction = palette.monter();
            break;

        case BAS:
            siNouvelleAction = palette.descendre();
            break;

        case ARRET:
            siNouvelleAction = palette.arreter();
        }

        return siNouvelleAction;
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
