public class MonExamen3 extends Examen3Gr2 {
	
	public static void main(String[] args) {
		
		new MonExamen3().valider();
	}

	@Override
	protected Tableau<String> creerTableauChaines() {
		return new MonTableau<String>();
	}

	@Override
	protected Tableau<Integer> creerTableauEntiers() {
		return new MonTableau<Integer>();
	}

	@Override
	protected Tableau<Double> creerTableauDoubles() {
		return new MonTableau<Double>();
	}

	@Override
	public Object fournirGraphe() {
		return new MonGraphe();
	}

	@Override
	protected Object creerSommet(int valeur) {
		return new Sommet(valeur);
	}

	@Override
	public <C extends Comparable<C>> Melangeur<C> fournirMelangeurNaif() {
		return new MelangeurNaif<C>();
	}

	@Override
	public <C extends Comparable<C>> Melangeur<C> fournirMelangeurEfficace() {
		return new MelangeurEfficace<C>();
	}

}
