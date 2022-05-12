public class MonObjetJson extends {1:MCS:=ObjetJson~ListeJson~ValeurJson~Dictionnaire~Dictionnaire<ValeurJson>~∅} {

	private static final char OUVERTURE = '{';
	private static final char SEPARATEUR_PAIRES = ',';
	private static final char SEPARATEUR_CLE_VALEUR = ':';
	private static final char FERMETURE = '}';
	
	private {1:MCS:=Dictionnaire~Dico~ObjetJson~∅}{1:MCS:~=〈ValeurJson〉~〈ObjetJson〉~〈ListeJson〉~∅} dictionnaire = new {1:MCS:=MonDictionnaire~~~~∅}{1:MCS:=〈〉~∅}({1:MCS:=ValeurJson.class~ObjetJson.class~ListeJson.class~∅});

	@Override
	public Dictionnaire{1:MCS:~=〈ValeurJson〉~〈ObjetJson〉~〈ListeJson〉~∅} dictionnaire() {
		return dictionnaire;
	}

	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {

		String resteDuTexte = texteJson;
		MonChargeurJson chargeur = new MonChargeurJson();

		resteDuTexte = retirerCaractere(resteDuTexte, {1:MCS:=OUVERTURE~SEPARATEUR_PAIRES~SEPARATEUR_CLE_VALEUR~FERMETURE~∅});
		

		while({1:MCS:=true~false~texteJson.length() == 0~∅}) {

			{1:MCS:=MaChaineJson~MonNombreJson~MonBooleenJson~MonNullJson~∅} cle = new {1:MCS:=MaChaineJson~MonNombreJson~MonBooleenJson~MonNullJson~∅}();

			resteDuTexte = cle.chargerEtRetournerResteDuTexte(resteDuTexte);

			resteDuTexte = retirerCaractere(resteDuTexte, {1:MCS:OUVERTURE~SEPARATEUR_PAIRES~=SEPARATEUR_CLE_VALEUR~FERMETURE~∅});
				
			{1:MCS:=ValeurJson~MaChaineJson~MonNombreJson~MonBooleenJson~MonNullJson~∅} valeur = chargeur.chargerValeur(resteDuTexte);
			{1:MCS:=resteDuTexte &equals; chargeur.resteDuTexteJson();~∅}
					
			dictionnaire.entreposerValeur({1:MCS:=cle.valeurJava()~cle~valeur.valeurJava()~∅}, {1:MCS:=valeur~cle.valeurJava()~valeur.valeurJava()~∅});

					
			try {

			    resteDuTexte = retirerCaractere(resteDuTexte, {1:MCS:OUVERTURE~=SEPARATEUR_PAIRES~SEPARATEUR_CLE_VALEUR~FERMETURE~∅});

			}catch(ErreurDeChargement e) {
				
				{1:MCS:=break;~∅}
			}
		}

		resteDuTexte = retirerCaractere(resteDuTexte, {1:MCS:OUVERTURE~SEPARATEUR_PAIRES~SEPARATEUR_CLE_VALEUR~=FERMETURE~∅});
		
		return resteDuTexte;
	}

	private String retirerCaractere(String texteJson, char caractere) throws ErreurDeChargement {
		if({1:MCS:=!~∅}(texteJson.charAt({1:MCS:=0~1~texteJson.length()-1~∅}) == caractere)) {
			throw new ErreurDeChargement(String.format("Il manque un %s au début de %s", caractere, texteJson));
		}
		return texteJson.{1:MCS:=substring(1)~substring(0,1)~.replace(caractere,"")~∅};
	}
}
