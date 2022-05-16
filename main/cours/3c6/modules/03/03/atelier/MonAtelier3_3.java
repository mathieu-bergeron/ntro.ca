public class MonAtelier3_3 extends Atelier3_3 {
	
	public static void main(String[] args) {
		
		(new MonAtelier3_3()).valider();
	}

	@Override
	public <C extends Comparable<C>> Trieur<C> fournirTrieurNaif() {
		return new TrieurNaif<C>();
	}
}
