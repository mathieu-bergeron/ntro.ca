public interface ChargeurJson {

	ValeurJson chargerValeur(String texteJson) throws ErreurDeChargement;

	ListeJson chargerListe(String texteJson) throws ErreurDeChargement;

	String resteDuTexteJson();
}
