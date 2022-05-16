public class Vehicule {

	public String formater() {
		StringBuilder builder = new StringBuilder();

		if(this instanceof Auto){ // instanceof

			builder.append("Mon");

		}else if(this instanceof Camion){ // instanceof

			builder.append("Mon");

		}else if(this instanceof Moto){ // instanceof

			builder.append("Ma");

		}else if(this instanceof Mobilette){ // instanceof

			builder.append("Ma");

        // FOURGONNETTE
		}else if(this instanceof Fourgonnette){ // instanceof

			builder.append("Ma");
		}

		if(this instanceof Auto){ // instanceof

			builder.append(" auto");

		}else if(this instanceof Camion){ // instanceof

			builder.append(" camion");

		}else if(this instanceof Moto){ // instanceof

			builder.append(" moto");

		}else if(this instanceof Mobilette){ // instanceof

			builder.append(" mobilette");

        // FOURGONNETTE
		}else if(this instanceof Fourgonnette){ // instanceof

			builder.append(" fourgonnette");
		}

		builder.append(" a roulé ");
		builder.append(totalDesKilometres());
		builder.append(" kilomètres et consomé ");
		builder.append(litresEssenceConsomes());
		builder.append(" litres d'essence.");
		
		return builder.toString();
	}
}
