import javafx.scene.input.MouseEvent;

public class EvtClicSouris extends EventNtro {
	
	private MouseEvent evtFx;
	private double worldX;
	private double worldY;


    // générer les méthodes get/set

	public EvtClicSouris() {
	
	}

	public void appliquerA(DonneesVuePartie donneesVuePartie) {
		donneesVuePartie.reagirClicSouris(evtFx, worldX, worldY);
	}

}
