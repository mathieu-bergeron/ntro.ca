public class Vehicule extends Object implements Rouleur, Formateur {

	private double totalKilometres = 0;
	
	@Override
	public void rouler(double kilometres) {
		totalKilometres = totalKilometres + kilometres;
	}
	
	@Override
	public String formater() {
		StringBuilder builder = new StringBuilder();
		
		if(siNomFeminin()) {
			builder.append("Ma ");
		}else {
			builder.append("Mon ");
		}
		builder.append(nomVehicule());
		builder.append(" a roulé ");
		builder.append(totalKilometres);
		builder.append(" kilomètres et consomé ");
		builder.append(litresEssenceConsomes());
		builder.append(" litres d'essence.");
		
		return builder.toString();
	}

	protected double consomationLitresParKilometre() {
		return 0.0;
	}

	protected String nomVehicule() {
		return "";
	}

	protected boolean siNomFeminin() {
		return false;
	}

	private double litresEssenceConsomes() {
		return totalKilometres * consomationLitresParKilometre();
	}
}
