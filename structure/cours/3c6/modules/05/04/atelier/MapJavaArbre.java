public class   MapJavaArbre <K extends Object, C extends CleComparable<K>, V extends Object> 
       extends MapJava<C,V> {
	
	private MonArbre<PairePourMap<K,C,V>> arbre = new MonArbre<>();
	
	@Override
	public void put(C c, V v) {
		arbre.ajouter(new MaPairePourMap<K,C,V>(c,v));
	}

	@Override
	public V get(C c) {
		V valeur = null;

		Noeud<PairePourMap<K,C,V>> noeud = arbre.trouverNoeud(new MaPairePourMap<K,C,V>(c, null));

		if(noeud != null) {
			valeur = noeud.valeur().valeur();
		}

		return valeur;
	}

	@Override
	public void clear() {
		arbre = new MonArbre<>();
	}

	@Override
	public int size() {
		return arbre.nombreDeNoeuds();
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public boolean containsKey(C c) {
		Noeud<PairePourMap<K,C,V>> noeud = arbre.trouverNoeud(new MaPairePourMap<K,C,V>(c, null));
		
		return noeud != null;
	}

	@Override
	public boolean containsValue(V v) {
		boolean siContient = false;

		List<Noeud<PairePourMap<K,C,V>>> noeuds = arbre.tousLesNoeuds();
		
		for(Noeud<PairePourMap<K,C,V>> noeud : noeuds) {
			
			if(noeud.valeur().valeur().equals(v)) {
				siContient = true;
				break;
			}
		}
		
		return siContient;
	}

	@Override
	public void remove(C c) {
		arbre.retirer(new MaPairePourMap<K,C,V>(c, null));
	}

	@Override
	public List<C> keys() {
		List<Noeud<PairePourMap<K,C,V>>> noeuds = arbre.tousLesNoeuds();
		
		List<C> cles = new ArrayList<>();

		for(Noeud<PairePourMap<K,C,V>> noeud : noeuds) {
			cles.add(noeud.valeur().cle());
		}
		
		return cles;
	}

}
