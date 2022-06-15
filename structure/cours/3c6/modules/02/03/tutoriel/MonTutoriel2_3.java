public class MonTutoriel2_3 extends Tutoriel2_3 {
	
	public static void main(String[] args) {
		
		new MonTutoriel2_3().valider();
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
