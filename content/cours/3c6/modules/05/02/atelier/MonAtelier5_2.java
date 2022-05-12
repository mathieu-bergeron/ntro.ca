public class MonAtelier5_2 extends Atelier5_2 {
	
	public static void main(String[] args) {
		
		(new MonAtelier5_2()).valider();
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeArray() {
		return new TesteurDeListeArray();
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeSimple() {
		return new TesteurDeListeChaineeSimple();
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeDouble() {
		return new TesteurDeListeChaineeDouble();
	}

	@Override
	public ListeJava<Character> fournirListeChaineeSimple() {
		return new ListeJavaChaineeSimple<Character>(Character.class);
	}

	@Override
	public ListeJava<Character> fournirListeChaineeDouble() {
		return new ListeJavaChaineeDouble<Character>(Character.class);
	}

	@Override
	public ListeJava<Character> fournirListeArray() {
		return new ListeJavaArray<Character>(Character.class);
	}

}
