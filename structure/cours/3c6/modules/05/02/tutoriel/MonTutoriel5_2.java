public class MonTutoriel5_2 extends Tutoriel5_2 {
	
	public static void main(String[] args) {
		
		new MonTutoriel5_2().valider();
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeSimple() {
		return new TesteurDeListeChaineeSimple();
	}

	@Override
	public ListeJava<Character> fournirListeChaineeSimple() {
		return new ListeJavaChaineeSimple<Character>(Character.class);
	}
}
