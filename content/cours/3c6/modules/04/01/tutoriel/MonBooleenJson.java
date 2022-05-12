public class MonBooleenJson extends ValeurJson<Boolean> {

	private boolean valeur;

	@Override
	public Boolean valeurJava() {
		return valeur;
	}

	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {

		if(texteJson.startsWith("true")) {

			valeur = true;
			texteJson = texteJson.replace("true", "");

		}else if(texteJson.startsWith("false")) {

			valeur = false;
			texteJson = texteJson.replace("false", "");

		}else {
			
			throw new ErreurDeChargement("Impossible de charger un booléen au début de " + texteJson);
			
		}
		
		return texteJson;
	}
}
