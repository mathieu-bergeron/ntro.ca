public class   MaListeGaucheDroite<V extends Object> 
       extends ListeGaucheDroite<V> {

	public MaListeGaucheDroite(Class<V> typeValeur) {
		super(typeValeur);
	}
	
	@Override
	protected int indiceGauche(int indiceListe) {
	    // À COMPLÉTER
	}

	@Override
	protected int indiceListeAPartirIndiceDroite(int indiceDroite) {
	    // À COMPLÉTER
	}
	
	@Override
	protected ElementListeGaucheDroite<V> atteindreElement(int indiceListe) {
	    // À COMPLÉTER
	}

	@Override
	protected void decalerVersLaGauche() {
	    // À COMPLÉTER
	}
}
