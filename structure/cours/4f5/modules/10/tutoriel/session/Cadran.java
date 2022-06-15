public enum Cadran {

    GAUCHE, DROITE, AUCUN, TOUS;

    public static boolean siJoueGauche(Cadran cadran) {
        return cadran == GAUCHE || cadran == TOUS;
    }

    public static boolean siJoueDroite(Cadran cadran) {
        return cadran == DROITE || cadran == TOUS;
    }

}
