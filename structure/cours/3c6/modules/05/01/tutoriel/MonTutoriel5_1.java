public class MonTutoriel5_1 extends Tutoriel5_1 {
	
	public static void main(String[] args) {
		
		new MonTutoriel5_1().valider();
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeNaive() {
		return new TesteurDeListeNaive();
	}

	@Override
	public ListeJava<Character> fournirListeNaive() {
		return new ListeJavaNaive<Character>(Character.class);
	}
}
