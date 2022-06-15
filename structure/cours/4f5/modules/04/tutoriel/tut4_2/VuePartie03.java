private void installerEvtAfficherFileAttente() {
	
	EvtAfficherFileAttente evtNtro = NtroApp.newEvent(EvtAfficherFileAttente.class);

	boutonQuitterPartie.setOnAction(evtFx -> {

		evtNtro.trigger();
	});
}
