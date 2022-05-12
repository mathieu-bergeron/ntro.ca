public class MonNullJson extends ValeurJson<Void> {

	@Override
	public Void valeurJava() {
		return null;
	}

	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {

		if(texteJson.startsWith("null")) {

			texteJson = texteJson.replace("null", "");

		}else {
			
			throw new ErreurDeChargement("Impossible de charger la valeur null au début de " + texteJson);

		}

		return texteJson;
	}
}
