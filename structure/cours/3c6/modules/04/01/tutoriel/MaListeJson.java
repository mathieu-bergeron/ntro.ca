public class MaListeJson extends ListeJson {

	private static final char OUVERTURE = '[';
	private static final char SEPARATEUR = ',';
	private static final char FERMETURE = ']';
	
	private ListeJava<ValeurJson> valeurs = new MaListeJava(ValeurJson.class);

	@Override
	public ListeJava listeJava() {
		return valeurs;
	}

	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {
		
		String resteDuTexte = texteJson;
		MonChargeurJson chargeur = new MonChargeurJson();

		resteDuTexte = retirerCaractere(resteDuTexte, OUVERTURE);

		while(true) {

			ValeurJson valeurJson = chargeur.chargerValeur(resteDuTexte);
			resteDuTexte = chargeur.resteDuTexteJson();
			
			listeJava().ajouter(valeurJson);
			
			try {
				resteDuTexte = retirerCaractere(resteDuTexte, SEPARATEUR);
			} catch(ErreurDeChargement e) {
				break;
			}
		}
			
		resteDuTexte = retirerCaractere(resteDuTexte, FERMETURE);

		return resteDuTexte;
	}
	
	private String retirerCaractere(String texteJson, char caractere) throws ErreurDeChargement {
		if(!(texteJson.charAt(0) == caractere)) {
			throw new ErreurDeChargement(String.format("Il manque un %s au début de %s", caractere, texteJson));
		}
		return texteJson.substring(1);
	}

}
