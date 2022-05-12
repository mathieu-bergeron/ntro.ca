public int nombreDoublons(C[] tableau){
    int nombreDoublons = 0;

    for(int i = 0; i < tableau.length; i++){
        for(int j = 0; j < tableau.length; j++){
            if(tableau[i].compareTo(tableau[j]) == 0){
                nombreDoublons++;
            }
        }
    }

    return nombreDoublons;
}

