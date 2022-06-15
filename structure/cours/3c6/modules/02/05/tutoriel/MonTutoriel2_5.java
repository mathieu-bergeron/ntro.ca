public class MonTutoriel2_5 extends Tutoriel2_5 {
	
	public static void main(String[] args) {
		
		new MonTutoriel2_5().valider();
	}

	@Override
	public Object fournirMoto() {
		return new Moto();
	}

	@Override
	public Object fournirMobilette() {
		return new Mobilette();
	}

	@Override
	public Object fournirAuto() {
		return new Auto();
	}

	@Override
	public Object fournirCamion() {
		return new Camion();
	}

}
