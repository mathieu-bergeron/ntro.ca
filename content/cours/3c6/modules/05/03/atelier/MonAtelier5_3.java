public class MonAtelier5_3 extends Atelier5_3 {
	
	public static void main(String[] args) {
		(new MonAtelier5_3()).valider();
	}

	@Override
	public TesteurDeMap fournirTesteurDeMapNaif() {
		return new TesteurDeMapNaif();
	}

	@Override
	public TesteurDeMap fournirTesteurDeMapHasha() {
		return new TesteurDeMapHasha();
	}

	@Override
	public TesteurDeMap fournirTesteurDeMapHashb() {
		return new TesteurDeMapHachb();
	}

	@Override
	public TesteurDeMap fournirTesteurDeMapHashc() {
		return new TesteurDeMapHachc();
	}
}
