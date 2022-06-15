package pong;

import ca.ntro.app.ServerRegistrar;
import ca.ntro.app.messages.MessageRegistrar;
import ca.ntro.app.models.ModelRegistrar;
import pong.messages.MsgAjouterPoint;
import pong.messages.MsgAjouterRendezVous;
import pong.messages.MsgDemarrerPartie;
import pong.messages.MsgCreerPartie;
import pong.messages.MsgPropagerActionJoueur;
import pong.modeles.ModeleFileAttente;
import pong.modeles.ModelePartie;
import pong.modeles.monde_pong2d.Balle2d;
import pong.modeles.monde_pong2d.MondePong2d;
import pong.modeles.monde_pong2d.Palette2d;
import pong.modeles.valeurs.ActionJoueur;
import pong.modeles.valeurs.PartieEnCours;
import pong.modeles.valeurs.RendezVous;

public class Declarations {

    public static void declarerMessages(MessageRegistrar registrar) {
        registrar.registerMessage(MsgAjouterRendezVous.class);
        registrar.registerMessage(MsgCreerPartie.class);
        registrar.registerMessage(MsgPropagerActionJoueur.class);
        registrar.registerMessage(MsgDemarrerPartie.class);
        registrar.registerMessage(MsgAjouterPoint.class);
    }

    public static void declarerModeles(ModelRegistrar registrar) {
        registrar.registerModel(ModeleFileAttente.class);
        registrar.registerValue(RendezVous.class);
        registrar.registerValue(PartieEnCours.class);

        registrar.registerModel(ModelePartie.class);
        registrar.registerValue(MondePong2d.class);
        registrar.registerValue(Palette2d.class);
        registrar.registerValue(Balle2d.class);
        registrar.registerValue(ActionJoueur.class);
    }

    public static void declarerServeur(ServerRegistrar registrar) {
        registrar.registerPort(8002);
        registrar.registerName("localhost");
    }

}
