public abstract class Vehicule extends Object implements Rouleur, Formateur {

	private double totalKilometres = 0;
	
	public Vehicule(double totalKilometres) {
		this.totalKilometres = totalKilometres;
	}
	
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

	protected abstract double consomationLitresParKilometre();

	protected abstract String nomVehicule();

	protected abstract boolean siNomFeminin();

	private double litresEssenceConsomes() {
		return totalKilometres * consomationLitresParKilometre();
	}
}
