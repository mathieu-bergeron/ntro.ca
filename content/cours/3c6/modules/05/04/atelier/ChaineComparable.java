public class ChaineComparable extends CleComparable<String> {

	public ChaineComparable(String valeurJava) {
		super(valeurJava);
	}

	@Override
	public int compareTo(CleComparable<String> o) {
		return valeurJava().compareTo(o.valeurJava());
	}
}
