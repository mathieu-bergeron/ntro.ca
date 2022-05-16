public class SolutionExamen2Gr2 extends Examen2Gr2 {
	
	public static void main(String[] args) {
		
		(new MonExamen2()).valider();
	}

	@Override
	public Object creerHockey(boolean estCeSportEquipe, double temperatureRequise) {
		return new Hockey(estCeSportEquipe, temperatureRequise);
	}

	@Override
	public Object creerPingPong(boolean estCeSportEquipe, double temperatureRequise) {
		return new PingPong(estCeSportEquipe, temperatureRequise);
	}

	@Override
	public Object creerSoccer(boolean estCeSportEquipe) {
		return new Soccer(estCeSportEquipe);
	}

	@Override
	public Object creerSki(boolean estCeSportEquipe) {
		return new Ski(estCeSportEquipe);
	}

	@Override
	public Accepteur fournirAccepteur() {
		return new MonAccepteur();
	}
}
