public class MonTutoriel4_4 extends Tutoriel4_4 {
	
	public static void main(String[] args) {
		
		new MonTutoriel4_4().valider();
	}

	@Override
	public ManipulateurDeFichier fournirManipulateurNaif() {
		return new ManipulateurDeFichierNaif();
	}
}
