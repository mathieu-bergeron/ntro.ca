public class   MaListeGaucheDroite<V extends Object> 
       extends ListeGaucheDroite<V> {

	public MaListeGaucheDroite(Class<V> typeValeur) {
		super(typeValeur);
	}
	
	@Override
	protected int indiceDroite(int indiceListe) {
	    // À COMPLÉTER
	}

	@Override
	protected int indiceListeAPartirIndiceGauche(int indiceGauche) {
	    // À COMPLÉTER
	}
	
	@Override
	protected ElementListeGaucheDroite<V> atteindreElement(int indiceListe) {
	    // À COMPLÉTER
	}

	@Override
	protected void decalerVersLaDroite() {
	    // À COMPLÉTER
	}
}
