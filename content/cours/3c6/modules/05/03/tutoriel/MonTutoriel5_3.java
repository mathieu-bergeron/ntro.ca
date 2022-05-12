public class MonTutoriel5_3 extends Tutoriel5_3 {
	
	public static void main(String[] args) {
		new MonTutoriel5_3().valider();
	}

	@Override
	public TesteurDeMap fournirTesteurDeMapNaif() {
		return new TesteurDeMapNaif();
	}
}
