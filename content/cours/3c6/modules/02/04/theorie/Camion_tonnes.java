public class Camion extends Vehicule {
	
	private double consomationDeBase = 14;
	private double chargementEnTonnes = 0; // TONNES

	public void accepterChargement(double chargementEnKilos) {
		this.chargementEnTonnes = chargementEnKilos / 1E3;  // TONNES
	}

	@Override
	protected double consomationLitresParKilometre() {
		return calculerConsomationSelonChargement();
	}

	private double calculerConsomationSelonChargement() {
		return (1 + chargementEnTonnes / 1E3) * consomationDeBase; // TONNES
	}
}
