subTasks.task("reagirActionJoueur")

        .waitsFor(event(EvtActionJoueur.class))
        
        .thenExecutes(inputs -> {
            
            DonneesVuePartie donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
            EvtActionJoueur  evtActionJoueur  = inputs.get(event(EvtActionJoueur.class));
            
            evtActionJoueur.appliquerA(donneesVuePartie);

        });
