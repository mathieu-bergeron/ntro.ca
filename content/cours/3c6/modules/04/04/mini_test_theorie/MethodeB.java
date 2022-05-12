public static void rechercherRemplacerB(String nomFichier, String ancienneValeur, String nouvelleValeur){

    // Charger tout le fichier
    List<String> valeurs = chargerFichier(nomFichier);

    // Parcourir tout le tableau pour déterminer la valeur à modifier
    int emplacement = chercher(valeurs, ancienneValeur);

    // Écrire la modification directement dans le fichier
    modifierFichier(nomFichier, emplacement, nouvelleValeur);
}
