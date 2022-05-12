public class MonExpressionJson extends ExpressionJson {
	
	public MonExpressionJson(ChargeurJson chargeurJson) {
		super(chargeurJson);
	}

	private ExpressionJava<ValeurJson> valeurJava = new ExpressionJava<ValeurJson>();

	@Override
	public ExpressionJava<ValeurJson> valeurJava() {
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
