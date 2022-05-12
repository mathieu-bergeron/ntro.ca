public void afficher(C[] tableau){
    int n = tableau.length;

    for(int i = 0; i < Math.pow(2,n); i++){
        System.out.println(i);
    }
}
