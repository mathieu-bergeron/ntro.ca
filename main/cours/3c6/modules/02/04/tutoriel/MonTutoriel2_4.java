public class MonTutoriel2_4 extends Tutoriel2_4 {
	
	public static void main(String[] args) {
		
		new MonTutoriel2_4().valider();
	}

	@Override
	public Rouleur creerMoto() {
		return new Moto();
	}
}
