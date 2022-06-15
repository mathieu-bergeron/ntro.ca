public class MonAtelier4_2 extends Atelier4_2 {
	
	public static void main(String[] args) {
		
		(new MonAtelier4_2()).valider();
	}

	@Override
	public ChargeurJson fournirChargeurJson() {
		return new MonChargeurJson();
	}
}
