public class Theore1_3 extends Afficheur implements PossedeNom {

    @Override
    public String obtenirNom(){

        return "Mathieu";
    }


    @Override
    protected void afficher(int valeur){

        System.out.println(valeur);
    }

}
