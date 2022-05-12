package tutoriels.generer_tutoriel2_1;

import tutoriels.tutoriel2_1.Formateur;

public class SolutionFormateur implements Formateur {

	@Override
	public String formater(int valeur) {

		StringBuilder builder = new StringBuilder();
		
		int dizaine = valeur / 10;
		int unite = valeur % 10;
		
		builder.append("[");
		builder.append(dizaine);
		builder.append("][");
		builder.append(unite);
		builder.append("]");

		return builder.toString();
	}

}
