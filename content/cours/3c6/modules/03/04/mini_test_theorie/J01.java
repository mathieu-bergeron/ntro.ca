public int chercher(C[] tableau, C valeur){
    int indice = -1;

    for(int i = 0; i < tableau.length; i++){
        if(tableau[i].compareTo(valeur) == 0){
            indice = i;
        }
    }

    return indice;
}
