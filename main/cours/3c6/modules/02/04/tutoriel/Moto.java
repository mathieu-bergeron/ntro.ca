public class Moto extends Vehicule {
	
	@Override
	protected double consomationLitresParKilometre() {
		return 3.5;
	}

	@Override
	protected boolean siNomFeminin() {
		return true;
	}

	@Override
	protected String nomVehicule() {
		return "moto";
	}

}
