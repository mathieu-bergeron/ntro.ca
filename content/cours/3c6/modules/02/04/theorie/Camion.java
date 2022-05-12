public class Camion extends Vehicule {
	
	private double consomationDeBase = 14;
	private double chargementEnKilos = 0;

	public void accepterChargement(double chargementEnKilos) {
		this.chargementEnKilos = chargementEnKilos;
	}

	@Override
	protected double consomationLitresParKilometre() {
		return calculerConsomationSelonChargement();
	}

	private double calculerConsomationSelonChargement() {
		return (1 + chargementEnKilos / 1E6) * consomationDeBase;
	}
}
