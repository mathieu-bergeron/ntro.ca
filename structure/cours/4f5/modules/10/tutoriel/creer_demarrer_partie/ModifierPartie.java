public class ModifierPartie {
    
    public static void creerTaches(BackendTasks tasks) {
        
        tasks.taskGroup("ModifierPartie")
        
             .waitsFor(model(ModelePartie.class))
        
              .contains(subTasks -> {
                  
                  ajouterPoint(subTasks);
                  
                  //recevoirActionJoueur(subTasks);

                  demarrerPartie(subTasks);

              });
    }

    private static void demarrerPartie(BackendTasks tasks) {
        tasks.task("demarrerPartie")

             .waitsFor(message(MsgDemarrerPartie.class))
             
             .thenExecutes(inputs -> {

                 MsgDemarrerPartie msgDemarrerPartie = inputs.get(message(MsgDemarrerPartie.class));
                 ModelePartie      partie            = inputs.get(model(ModelePartie.class));

                 msgDemarrerPartie.appliquerA(partie);

                 msgDemarrerPartie.broadcast();
             });
    }

    private static void recevoirActionJoueur(BackendTasks tasks) {
        tasks.task("recevoirActionJoueur")

             .waitsFor(message(MsgPropagerActionJoueur.class))
             
             .thenExecutes(inputs -> {

                 MsgPropagerActionJoueur msgPropagerActionJoueur = inputs.get(message(MsgPropagerActionJoueur.class));
                 ModelePartie            partie        = inputs.get(model(ModelePartie.class));
                 
                 if(msgPropagerActionJoueur.siVersionPlusGrandeQue(partie)) {

                     msgPropagerActionJoueur.copierDonneesDans(partie);

                 }else {

                     partie.incrementerVersion();
                     msgPropagerActionJoueur.appliquerActionJoueurA(partie);

                 }
             });
    }

    private static void ajouterPoint(BackendTasks tasks) {

        tasks.task("ajouterPoint")

             .waitsFor(message(MsgAjouterPoint.class))

             .thenExecutes(inputs -> {
                 
                 MsgAjouterPoint msgAjouterPoint = inputs.get(message(MsgAjouterPoint.class));
                 ModelePartie  partie            = inputs.get(model(ModelePartie.class));

                 if(msgAjouterPoint.memeVersionQue(partie)) {

                     msgAjouterPoint.copierDonneesDans(partie);
                     msgAjouterPoint.ajouterPointA(partie);

                     partie.incrementerVersion();
                 }
             });
    }

}
