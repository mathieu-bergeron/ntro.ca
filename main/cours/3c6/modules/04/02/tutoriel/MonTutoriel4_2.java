public class MonTutoriel4_2 extends Tutoriel4_2 {
	
	public static void main(String[] args) {
		
		new MonTutoriel4_2().valider();
	}

	@Override
	public <C extends Comparable<C>> Chercheur<C> fournirChercheurNaif() {
		return new ChercheurNaif<C>();
	}

	@Override
	public <C extends Comparable<C>> Chercheur<C> fournirChercheurEfficace() {
		return new ChercheurEfficace<C>();
	}
}
