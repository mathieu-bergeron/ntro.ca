package tutoriels.generer_tutoriel2_3.solution;

import tutoriels.tutoriel2_3.Accepteur;
import tutoriels.tutoriel2_3.vehicules.Moto;
import tutoriels.tutoriel2_3.vehicules.Vehicule;

public class MonAccepteur implements Accepteur {

	@Override
	public boolean accepterSiDeuxRoues(Vehicule vehicule) {
		return vehicule.nombreDeRoues() == 2;
	}

	@Override
	public boolean accepterSiEconomique(Vehicule vehicule) {
		return vehicule.consomationLitresParKilometre() <= 6.0;
	}

	@Override
	public boolean accepterSiMoto(Vehicule vehicule) {
		return vehicule instanceof Moto;
	}

}
