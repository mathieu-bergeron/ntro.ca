public class TesteurDeMapNaif extends TesteurDeMapAbstrait {

	@Override
	public MapJava<Cle<String>, Integer> nouveauMap() {
		return new MapJavaNaif<Cle<String>, Integer>();
	}

	@Override
	public Cle<String> nouvelleCle(String valeur) {
		return new Cle<String>(valeur);
	}

	@Override
	public void accederAuClesDansOrdre(MapJava<Cle<String>, Integer> map) {
		List<Cle<String>> cles = map.keys();
		List<String> valeurCles = new ArrayList<>();

		for(Cle<String> cle : cles) {
			valeurCles.add(cle.valeurJava());
		}

		Collections.sort(valeurCles);

		for(String valeurCle : valeurCles) {
			System.out.println("MAP: " + valeurCle);
		}
	}
}
