public class Declarations {

    // ...

    public static void declarerMessages(MessageRegistrar registrar) {

        // ...
        
        // ajouter
        registrar.registerMessage(MsgDemarrerPartie.class);
        registrar.registerMessage(MsgAjouterPoint.class);
    }
