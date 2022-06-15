public class Vehicule {

	private double totalKilometres = 0;
	
	public void rouler(double kilometres) {
		totalKilometres += kilometres;
	}

	private double litresEssenceConsomes() {
		return totalKilometres * consomationLitresParKilometre();
	}
}
