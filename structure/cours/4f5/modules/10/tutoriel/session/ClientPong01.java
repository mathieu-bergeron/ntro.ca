public class ClientPong implements NtroClientFx {
    
    public static void main(String[] args) {
        // ajouter
        if(args.length > 0) {
            Session.nomUsager = args[0];
        }

        // ajouter
        if(args.length > 1) {
            Session.cadran = Cadran.valueOf(args[1]);
        }

        NtroClientFx.launch(args);
    }

    // ...
