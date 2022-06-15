public class Auto extends Vehicule {

    // ...

    @Override
	public String formater(){

	    String retour = super.formater();

	    return "[AUTO] " + retour;
	}
}
