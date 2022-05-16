public class MonAtelier2_6 extends Atelier2_6 {
	
	public static void main(String[] args) {
		
		(new MonAtelier2_6()).valider();
	}

	@Override
	public Dormeur creerChatGouttiere(int totalHeuresDeSommeil, int nombreOiseauxAttrapes) {
		return new ChatGouttiere(totalHeuresDeSommeil, nombreOiseauxAttrapes);
	}

	@Override
	public Dormeur creerChatPersan(int totalHeuresDeSommeil, int nombreOiseauxAttrapes) {
		return new ChatPersan(totalHeuresDeSommeil, nombreOiseauxAttrapes);
	}

	@Override
	public Dormeur creerBouledogue(int totalHeuresDeSommeil) {
		return new Bouledogue(totalHeuresDeSommeil);
	}

	@Override
	public Dormeur creerShihtzu(int totalHeuresDeSommeil) {
		return new Shihtzu(totalHeuresDeSommeil);
	}

}
