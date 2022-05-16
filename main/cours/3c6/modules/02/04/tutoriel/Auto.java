public class Auto extends Vehicule {

	@Override
	protected double consomationLitresParKilometre() {
		return 8.0;
	}

	@Override
	protected boolean siNomFeminin() {
		return false;
	}

	@Override
	protected String nomVehicule() {
		return "auto";
	}
}
