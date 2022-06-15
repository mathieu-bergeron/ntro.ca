public class MonAtelier4_1 extends Atelier4_1 {
	
	public static void main(String[] args) {
		
		(new MonAtelier4_1()).valider();
	}

	@Override
	public ObjetJson fournirObjetJson() {
		return new MonObjetJson();
	}

	@Override
	public ChargeurJson fournirChargeurJson() {
		return new MonChargeurJson();
	}
}
