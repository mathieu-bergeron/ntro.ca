public class Vehicule {

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
}
