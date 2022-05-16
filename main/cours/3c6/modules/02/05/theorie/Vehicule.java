public abstract class Vehicule extends Object implements Rouleur, Formateur {

	protected abstract double consomationLitresParKilometre();

	protected abstract String nomVehicule();

	protected abstract boolean siNomFeminin();

	private double litresEssenceConsomes() {
		return totalKilometres * consomationLitresParKilometre();
	}
}
