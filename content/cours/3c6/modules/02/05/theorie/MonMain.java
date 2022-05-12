public class Principal {

    public static void main(String[] args){

        Rouleur vehicule = new MonVehicule();

        // OK
        vehicule.rouler(10.0);

        // ERREUR
        System.out.println(vehicule.formater());
    }
}
