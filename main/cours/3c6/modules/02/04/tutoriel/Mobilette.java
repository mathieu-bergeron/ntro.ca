public class Mobilette extends Vehicule {

	@Override
	protected double consomationLitresParKilometre() {
		return 1.5;
	}

	@Override
	protected boolean siNomFeminin() {
		return true;
	}

	@Override
	protected String nomVehicule() {
		return "mobilette";
	}
}
