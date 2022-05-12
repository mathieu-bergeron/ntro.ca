public class MonAtelier3_2 extends Atelier3_2 {
	
	public static void main(String[] args) {
		
		(new MonAtelier3_2()).valider();
	}

	@Override
	public Object creerPaireEntiers(int gauche, int droite) {
		return new MaPaire<Integer>(gauche, droite);
	}

	@Override
	public Object creerPaireChaines(String gauche, String droite) {
		return new MaPaire<String>(gauche, droite);
	}

	@Override
	public Object creerPaireAnimaux(Animal gauche, Animal droite) {
		return new MaPaire<Animal>(gauche, droite);
	}

	@Override
	public Planteur fournirPlanteur() {
		return new MonPlanteur();
	}
}
