List<Double> valeurs = lireFichier(nomFichier);

valeurs.set(indice, nouvelleValeur);

ecrireFichier(valeurs, nomFichier);
