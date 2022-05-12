public class MaChaineJson extends ValeurJson<String> {

	private static final String PATRON = "^\"([^\"]*)\"";
	private static final Pattern pattern = Pattern.compile(PATRON);
	
	private String valeur;

	@Override
	public String valeurJava() {
		return valeur;
	}

	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {

		Matcher matcher = pattern.matcher(texteJson);
		
		if(matcher.find()) {
			
			valeur = matcher.group(1);
			
			texteJson = matcher.replaceFirst("");

		}else {
			
			throw new ErreurDeChargement("Impossible de charger une chaîne pour " + texteJson);
		}

		return texteJson;
	}

	@Override
	public String toString() {
		return String.format("\"%s\"", super.toString());
	}

}
