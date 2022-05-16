public class Vehicule implements Rouleur, Formateur {

	private double totalKilometres;

	public Vehicule() {
		this.totalKilometres = 0.0;
	}

	public Vehicule(double totalKilometres) {
		this.totalKilometres = totalKilometres;
	}

}
