public class Auto extends Vehicule {

    public void exemple(){

        double litresConsomes = super.litresEssenceConsomes();

        System.out.println("Mon auto a consomé " + litresConsomes);
    }
}
