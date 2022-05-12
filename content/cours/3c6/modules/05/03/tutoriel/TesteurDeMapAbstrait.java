public abstract class TesteurDeMapAbstrait implements TesteurDeMap {
	
	private static final Random alea = new Random();

	@Override
	public void fairePlusieursAjoutsAleatoires(MapJava<Cle<String>, Integer> map, Cle<String>[] cles, int nombreOperations) {
		for(int i = 0; i < cles.length; i++) {
			map.put(cles[i],alea.nextInt(cles.length));
		}
	}

	@Override
	public void fairePlusieursModificationsAleatoires(MapJava<Cle<String>, Integer> map, Cle<String>[] cles, int nombreOperations) {
		for(int i = 0; i < cles.length; i++) {
			map.put(cles[i],alea.nextInt(cles.length));
		}
	}

	@Override
	public void fairePlusieursRetraitsAleatoires(MapJava<Cle<String>, Integer> map, Cle<String>[] cles, int nombreOperations) {
		for(int i = 0; i < cles.length; i++) {
			map.remove(cles[i]);
		}
	}


}
