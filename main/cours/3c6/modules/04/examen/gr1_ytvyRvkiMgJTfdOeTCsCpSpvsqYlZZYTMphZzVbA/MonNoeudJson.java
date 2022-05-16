public class MonNoeudJson extends NoeudJson {

	public MonNoeudJson(ChargeurJson chargeurJson) {
		super(chargeurJson);
	}

	private NoeudJava<ValeurJson> valeurJava = new NoeudJava<>();

	@Override
	public NoeudJava<ValeurJson> valeurJava() {
		return valeurJava;
	}

	// [À COMPLÉTER]

	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {

		String resteDuTexte = texteJson;
		ChargeurJson chargeur = chargeurJson();

        // [À COMPLÉTER]
		
		return resteDuTexte;
	}

	private String retirerCaractere(String texteJson, char caractere) throws ErreurDeChargement {
		if(!(texteJson.charAt(0) == caractere)) {
			throw new ErreurDeChargement(String.format("Il manque un %s au début de %s", caractere, texteJson));
		}
		return texteJson.substring(1);
	}
}
