public class ClientPong implements NtroClientFx {

    // ...

    @Override
    public void registerMessages(MessageRegistrar registrar) {

        registrar.registerMessage(MsgAjouterRendezVous.class);
    }
