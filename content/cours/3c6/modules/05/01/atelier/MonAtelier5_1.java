public class MonAtelier5_1 extends Atelier5_1 {
	
	public static void main(String[] args) {
		
		(new MonAtelier5_1()).valider();
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeArray() {
		return new TesteurDeListeArray();
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeNaive() {
		return new TesteurDeListeNaive();
	}

	@Override
	public ListeJava<Character> fournirListeNaive() {
		return new ListeJavaNaive<Character>(Character.class);
	}

	@Override
	public ListeJava<Character> fournirListeArray() {
		return new ListeJavaArray<Character>(Character.class);
	}

}
