public class MonTutoriel2_6 extends Tutoriel2_6 {
	
	public static void main(String[] args) {
		
		new MonTutoriel2_6().valider();
	}

	@Override
	public Object creerMoto(double kilometrage) {
		return new Moto(kilometrage);
	}

	@Override
	public Object creerMobilette(double kilometrage) {
		return new Mobilette(kilometrage);
	}

	@Override
	public Object creerAuto(double kilometrage) {
		return new Auto(kilometrage);
	}

	@Override
	public Object creerCamion(double kilometrage, double chargementEnKilos) {
		return new Camion(kilometrage, chargementEnKilos);
	}
}
