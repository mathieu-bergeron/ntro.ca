public class MonTutoriel4_3 extends Tutoriel4_3 {
	
	public static void main(String[] args) {
		
		new MonTutoriel4_3().valider();
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeArray() {
		return new TesteurDeListeArray();
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeLinked() {
		return new TesteurDeListeLinked();
	}
}
