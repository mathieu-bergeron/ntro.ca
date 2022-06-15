public class MonChargeurJson implements ChargeurJson {
	
	private String resteDuTexteJson;

	@Override
	public ValeurJson chargerValeur(String texteJson) throws ErreurDeChargement {
		
		ValeurJson[] valeursPossibles = new ValeurJson[] {new MonNullJson(), 
				                                          new MonBooleenJson(), 
				                                          new MaChaineJson(), 
				                                          new MonNombreJson()};
		ValeurJson valeurChargee = null;

		for(ValeurJson valeurPossible : valeursPossibles) {
			
			try {
				
				resteDuTexteJson = valeurPossible.chargerEtRetournerResteDuTexte(texteJson);
				valeurChargee = valeurPossible;
				break;
				
			}catch(ErreurDeChargement e) {}
		}
		
		if(valeurChargee == null) {
			throw new ErreurDeChargement("Impossible de charger une valeur au début de " + texteJson);
		}
		
		return valeurChargee;
	}


	@Override
	public ListeJson chargerListe(String texteJson) throws ErreurDeChargement {
		
		ListeJson listeJson = new MaListeJson();
		resteDuTexteJson = listeJson.chargerEtRetournerResteDuTexte(texteJson);

		return listeJson;
	}

	@Override
	public String resteDuTexteJson() {
		return resteDuTexteJson;
	}
}
