public class Declarations {

    public static void declarerMessages(MessageRegistrar registrar) {

        registrar.registerMessage(MsgAjouterRendezVous.class);
        registrar.registerMessage(MsgAjouterPoint.class);
    }

    public static void declarerModeles(ModelRegistrar registrar) {

        registrar.registerModel(ModeleFileAttente.class);
        registrar.registerValue(RendezVous.class);
        registrar.registerValue(PartieEnCours.class);
        
        registrar.registerModel(ModelePartie.class);
        registrar.registerValue(MondePong2d.class);
        registrar.registerValue(Balle2d.class);
        registrar.registerValue(Palette2d.class);
    }
}
