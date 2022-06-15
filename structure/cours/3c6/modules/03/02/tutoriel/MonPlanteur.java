public class MonPlanteur implements Planteur {

	@Override
	public boolean planter() {

		MonTableau<Integer> tableauEntiers = new MonTableau<>(new Integer[] {1,2,3});
		tableauEntiers.modifierValeur(0, "asdf");
		// erreur      ^^^^^^^^^^^^^^

		return false;
	}
}
