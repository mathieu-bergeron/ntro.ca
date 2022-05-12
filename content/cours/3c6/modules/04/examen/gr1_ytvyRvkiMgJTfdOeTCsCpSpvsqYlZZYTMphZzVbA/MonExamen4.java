public class MonExamen4 extends Examen4Gr1 {
	
	public static void main(String[] args) {

		(new MonExamen4()).valider();
	}

	@Override
	public NoeudJson fournirNoeudJson() {
		return new MonNoeudJson(new ChargeurJsonNoeud(this));
	}

	@Override
	public TesteurDeSet fournirTesteurDeSetVersionUn() {
		return new TesteurDeSetVersionUn();
	}

	@Override
	public TesteurDeSet fournirTesteurDeSetVersionDeux() {
		return new TesteurDeSetVersionDeux();
	}

	@Override
	public MaListeJson fournirListeJsonBD() {
		return new MaListeJsonBD(new ChargeurJsonBD(this));
	}

	@Override
	public ModificateurDeFichier fournirModificateurDeFichier() {
		return new MonModificateurDeFichier();
	}
}
