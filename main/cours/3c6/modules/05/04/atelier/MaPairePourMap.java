public class   MaPairePourMap<K extends Object, C extends CleComparable<K>, V extends Object> 
       extends PairePourMap<K, C, V> {
	
	private C cle;
	private V valeur;
	
	public MaPairePourMap(C cle, V valeur) {
		this.cle = cle;
		this.valeur = valeur;
	}

	@Override
	public C cle() {
		return cle;
	}

	@Override
	public V valeur() {
		return valeur;
	}

	@Override
	public void setCle(C cle) {
		this.cle = cle;
	}

	@Override
	public void setValeur(V valeur) {
		this.valeur = valeur;
	}

	@Override
	public int compareTo(PairePourMap<K, C, V> o) {
		return cle.compareTo(o.cle());
	}
}
