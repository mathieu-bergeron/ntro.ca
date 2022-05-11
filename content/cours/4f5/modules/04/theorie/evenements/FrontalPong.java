@Override
public void registerEvents(EventRegistrar registrar) {

	registrar.registerEvent(EvtAfficherFileAttente.class);

	registrar.registerEvent(EvtAfficherPartie.class);
}
