public class MonAtelier2_5 extends Atelier2_5 {
	
	public static void main(String[] args) {
		
		new MonAtelier2_5().valider();
	}

	@Override
	public Dormeur creerChatGouttiere() {
	    return new ChatGouttiere();
	}

	@Override
	public Dormeur creerChatPersan() {
	    return new ChatPersan();
	}

	@Override
	public Dormeur creerBouledogue() {
	    return new Bouledogue();
	}

	@Override
	public Dormeur creerShihtzu() {
	    return new Shihtzu();
	}
}
