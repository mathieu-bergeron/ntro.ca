public interface ChargeurJson {

	ValeurJson chargerValeur(String texteJson) throws ErreurDeChargement;

	String resteDuTexteJson();
}
