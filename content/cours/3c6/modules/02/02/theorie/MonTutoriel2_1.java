public class MonTutoriel2_1 extends Tutoriel2_1 {
	
	public static void main(String[] args) {

		new MonTutoriel2_1().valider();
	}

	@Override
	public Accepteur fournirAccepteur() {
		return new MonAccepteur();
	}

	@Override
	public Formateur fournirFormateur() {
		return new MonFormateur();
	}

}
