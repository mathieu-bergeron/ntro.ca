public class Mobilette extends Vehicule {
	
	private LocalDate dateLimite = LocalDate.of(2020, 10, 1);

	public Mobilette(double totalKilometres) {
		super(totalKilometres);
	}


	@Override
	public void rouler(double kilometres) {
		super.rouler(kilometres);
		
		LocalDate aujourd_hui = LocalDate.now();
		
		if(aujourd_hui.compareTo(dateLimite) >= 0) {
			
			throw new RuntimeException("La mobilette devrait déjà être remisée!");
			
		}else {
			
			Period difference = Period.between(aujourd_hui, dateLimite);
			
			System.out.println("ATTENTION: il reste " + difference.getDays() + " jours avant de remiser la mobilette");
		}
	}

	@Override
	protected double consomationLitresParKilometre() {
		return 1.5;
	}

	@Override
	protected boolean siNomFeminin() {
		return true;
	}

	@Override
	protected String nomVehicule() {
		return "mobilette";
	}
}
