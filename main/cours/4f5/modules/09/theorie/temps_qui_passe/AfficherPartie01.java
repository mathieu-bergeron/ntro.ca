subTasks.task("prochaineImagePartie")

        .waitsFor(clock().nextTick())

        .thenExecutes(inputs -> {

            Tick             tick             = inputs.get(clock().nextTick());
            DonneesVuePartie donneesVuePartie = inputs.get(created(DonneesVuePartie.class));
            VuePartie        vuePartie        = inputs.get(created(VuePartie.class));
            
            donneesVuePartie.reagirTempsQuiPasse(tick.elapsedTime());
            donneesVuePartie.afficherSur(vuePartie);

        });
