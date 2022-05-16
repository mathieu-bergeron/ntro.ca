public class Camion extends Vehicule {
	

	private double consomationDeBase = 14;
	private double chargementEnKilos = 0;

	public Camion(double totalKilometres, double chargementEnKilos) {
		super(totalKilometres);

		this.chargementEnKilos = chargementEnKilos;
	}

	public void accepterChargement(double chargementEnKilos) {
		this.chargementEnKilos = chargementEnKilos;
	}

	@Override
	protected double consomationLitresParKilometre() {
		return calculerConsomationSelonChargement();
	}

	@Override
	protected boolean siNomFeminin() {
		return false;
	}

	@Override
	protected String nomVehicule() {
		return "camion";
	}

	private double calculerConsomationSelonChargement() {
		return (1 + chargementEnKilos / 1E6) * consomationDeBase;
	}

}
