public class Vehicule extends Object {
	
	public double consomationLitresParKilometre() {
		return 0.0;
	}
	
	public double litresEssenceConsomes(double kilometres) {
		return kilometres * consomationLitresParKilometre();
	}

	public int nombreDeRoues() {
		return 0;
	}

}
