package dessin.frontal.vues.donnees;

import ca.ntro.app.frontend.ViewData;
import dessin.frontal.vues.VueDessin;
import dessin.modeles.monde_dessin2d.MondeDessin2d;
import dessin.modeles.valeurs.Forme;
import javafx.scene.input.MouseEvent;

public class DonneesVueDessin implements ViewData {
    
    private MondeDessin2d mondeDessin2d = new MondeDessin2d();

    public void reagirTempsQuiPasse(double secondesEcoulees) {
        mondeDessin2d.onTimePasses(secondesEcoulees);
    }

    public void afficherSur(VueDessin vueDessin) {
        vueDessin.effacerCanvas();
        vueDessin.afficherMondeDessin2d(mondeDessin2d);
    }

    public void reagirEvtSouris(MouseEvent evtFx, double worldX, double worldY) {
        mondeDessin2d.dispatchMouseEvent(evtFx, worldX, worldY);
    }

    public void effacerLesFormes() {
        mondeDessin2d.effacerLesObjets();
    }

    public void ajouterForme(Forme forme) {
        mondeDessin2d.addObject2d(forme);
    }

}
