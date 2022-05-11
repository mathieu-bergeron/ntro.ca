public class DonneesVuePartie implements ViewData {

    // ajouter
	public void reagirClicSouris(MouseEvent evtFx, double x, double y) {
		mondePong2d.dispatchMouseEvent(evtFx, x,y);
	}
