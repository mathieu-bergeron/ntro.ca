public class MonAtelier4_4 extends Atelier4_4 {
	
	public static void main(String[] args) {

		(new MonAtelier4_4()).valider();
	}

	@Override
	public ManipulateurDeFichier fournirManipulateurNaif() {
		return new ManipulateurDeFichierNaif();
	}

	@Override
	public ManipulateurDeFichier fournirManipulateurEfficace() {
		return new ManipulateurDeFichierEfficace();
	}
}
