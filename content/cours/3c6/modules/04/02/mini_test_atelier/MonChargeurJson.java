public class MonChargeurJson implements ChargeurJson {

	private String resteDuTexteJson;

	@Override
	public ValeurJson chargerValeur(String texteJson) throws ErreurDeChargement {
		
		ValeurJson[] valeursPossibles = new ValeurJson[] {{1:MCS:=new MonNullJson()~new NullJson()~∅}{1:MCS:=,~&#10101;~∅}
		                                                  {1:MCS:=new MonBooleenJson()~new BooleenJson()~∅}{1:MCS:=,~&#10101;~∅}
		                                                  {1:MCS:=new MaChaineJson()~new ChaineJson()~∅}{1:MCS:=,~&#10101;~∅}
		                                                  {1:MCS:=new MonNombreJson()~new NombreJson()~∅}{1:MCS:=,~&#10101;~∅}
		                                                  {1:MCS:new MaPaireJson()~new PaireJson()~=∅}{1:MCS:,~&#10101;~=∅}
		                                                  {1:MCS:=new MaListeJson()~new ListeJson()~∅}{1:MCS:=,~&#10101;~∅}
		                                                  {1:MCS:new MonArbreJson()~new ArbreJson()~=∅}{1:MCS:,~&#10101;~=∅}
		                                                  {1:MCS:=new MonObjetJson()~new ObjetJson()~∅}{1:MCS:=,~&#10101;~∅}};

		// le reste pareil
	}
}
