public static void rechercherRemplacerA(String nomFichier, String ancienneValeur, String nouvelleValeur){

    // Charger tout le fichier
    List<String> valeurs = chargerFichier(nomFichier);

    // Parcourir tout le tableau pour déterminer la valeur à modifier
    int emplacement = chercher(valeurs, ancienneValeur);

    // Effectuer la modification
    valeurs.set(emplacement, nouvelleValeur);

    // Ré-écrire le fichier
    ecrireFichier(nomFichier, valeurs);
}
