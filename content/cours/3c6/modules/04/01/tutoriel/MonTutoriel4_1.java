public class MonTutoriel4_1 extends Tutoriel4_1 {
	
	public static void main(String[] args) {
		
		new MonTutoriel4_1().valider();
	}

	@Override
	public ValeurJson<Void> fournirNullJson() {
		return new MonNullJson();
	}

	@Override
	public ValeurJson<Boolean> fournirBooleenJson() {
		return new MonBooleenJson();
	}

	@Override
	public ValeurJson<Double> fournirNombreJson() {
		return new MonNombreJson();
	}

	@Override
	public ValeurJson<String> fournirChaineJson() {
		return new MaChaineJson();
	}

	@Override
	public ChargeurJson fournirChargeurJson() {
		return new MonChargeurJson();
	}
}
