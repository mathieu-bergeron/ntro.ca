public class MonTutoriel3_1 extends Tutoriel3_1 {
	
	public static void main(String[] args) {
		
		new MonTutoriel3_1().valider();
	}

	@Override
	public Object creerTableauEntiers(Integer[] entiersInitiaux) {
		return new MonTableau(entiersInitiaux);
	}

	@Override
	public Object creerTableauChaines(String[] chainesInitiales) {
		return new MonTableau(chainesInitiales);
	}

	@Override
	public Object creerTableauVehicules(Vehicule[] vehiculesInitiaux) {
		return new MonTableau(vehiculesInitiaux);
	}

	@Override
	public Planteur fournirPlanteur() {
		return new MonPlanteur();
	}
}
