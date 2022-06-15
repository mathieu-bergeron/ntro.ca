package tutoriels.generer_tutoriel2_3.solution;

import tutoriels.tutoriel2_3.Formateur;
import tutoriels.tutoriel2_3.vehicules.Auto;
import tutoriels.tutoriel2_3.vehicules.Camion;
import tutoriels.tutoriel2_3.vehicules.Fourgonnette;
import tutoriels.tutoriel2_3.vehicules.Mobilette;
import tutoriels.tutoriel2_3.vehicules.Moto;
import tutoriels.tutoriel2_3.vehicules.Vehicule;

public class MonFormateur implements Formateur {

	@Override
	public String formater(Vehicule vehicule) {

		StringBuilder builder = new StringBuilder();
		
		if(vehicule instanceof Auto) {
			builder.append("Une auto");
		}else if(vehicule instanceof Camion) {
			builder.append("Un camion");
		}else if(vehicule instanceof Fourgonnette) {
			builder.append("Une fourgonnette");
		}else if(vehicule instanceof Moto) {
			builder.append("Une moto");
		}else if(vehicule instanceof Mobilette) {
			builder.append("Une mobilette");
		}

		builder.append(" est un véhicule à ");
		builder.append(vehicule.nombreDeRoues());
		builder.append(" roues. Sa consomation d'essence est ");
		builder.append(vehicule.consomationLitresParKilometre());
		builder.append(" litres par kilomètre.");
		
		return builder.toString();
	}

}
