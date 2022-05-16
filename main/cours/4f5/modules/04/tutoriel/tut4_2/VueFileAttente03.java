private void installerEvtAfficherPartie() {
	
	EvtAfficherPartie evtNtro = NtroApp.newEvent(EvtAfficherPartie.class);

	boutonOuvrirPartie.setOnAction(evtFx -> {

		evtNtro.trigger();

	});
}
