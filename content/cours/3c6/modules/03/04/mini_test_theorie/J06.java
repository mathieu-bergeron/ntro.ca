public C[] melanger(C[] entree){
    C[] resultat;

    if(entree.length == 0){
        resultat = new C[];

    }else if(entree.length == 1){
        resultat = new C[1];
        resultat[0] = entree[0];

    }else{
        int n = entree.length
        C[] gauche = sousTableau(entree, 0, n/2);
        C[] droite = sousTableau(entree, n/2, n);

        gauche = melanger(gauche);
        droite = melanger(droite);

        resultat = fusionner(gauche, droite);
    }

    return resultat;
}
