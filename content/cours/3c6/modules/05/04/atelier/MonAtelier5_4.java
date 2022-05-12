public class SolutionAtelier5_4 extends Atelier5_4 {
	
	public static void main(String[] args) {
		
		(new SolutionAtelier5_4()).valider();
	}

	@Override
	public TesteurDeMap fournirTesteurDeMapArbre() {
		return new TesteurDeMapArbre();
	}

	@Override
	public TesteurDeMap fournirTesteurDeMapHash() {
		return new TesteurDeMapHash();
	}
}
