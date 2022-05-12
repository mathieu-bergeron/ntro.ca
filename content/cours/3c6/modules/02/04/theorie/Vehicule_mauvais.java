public class Vehicule {

	private double totalKilometres = 0;
	
	public void rouler(double kilometres) {
		totalKilometres += kilometres;
	}

	private double litresEssenceConsomes() {
	    double litresConsomes = 0;

	    if(this instanceof Camion){ // instanceof

	        double chargementEnKilos = ((Camion) this).getChargementEnKilos(); // getter

	        double consomationDeBase = ((Camion) this).getConsomationDeBase(); // getter

		    double consomationSelonChargement = (1 + chargementEnKilos / 1E6) * consomationDeBase;

	        litresConsomes = totalKilometres * consomationSelonChargement;

	    }else{

	        litresConsomes = totalKilometres * consomationLitresParKilometre();
	    }

		return litresConsomes;
	}
}
