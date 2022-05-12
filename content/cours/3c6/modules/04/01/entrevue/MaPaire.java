public class MaPaire<V extends Object>  {

	private String cle;
	private V valeur;

	public MaPaire(String cle, V valeur){
	    this.cle = cle;
	    this.valeur = valeur;
	}

	public String getCle(){
	    return cle;
	}

	public V getValeur(){
	    return valeur;
	}
	
}
