public class MonPlanteur implements Planteur {

	@Override
	public boolean planter() {
		MonTableau tableauEntiers = new MonTableau(new Integer[] {1,2,3});
		tableauEntiers.modifierValeur(0, "asdf");

		return false;
	}
}
