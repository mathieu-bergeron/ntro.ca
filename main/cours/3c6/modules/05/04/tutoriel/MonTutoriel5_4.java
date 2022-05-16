public class MonTutoriel5_4 extends Tutoriel5_4 {
	
	public static void main(String[] args) {
		new MonTutoriel5_4().valider();
	}

	@Override
	public Arbre<Character> fournirArbre() {
		return new MonArbre<Character>();
	}
}
