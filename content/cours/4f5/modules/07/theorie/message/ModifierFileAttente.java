tasks.task("ajouterRendezVous")

     .waitsFor(message(MsgAjouterRendezVous.class))
     
     .thenExecutes(inputs -> {

         MsgAjouterRendezVous msgAjouterRendezVous = inputs.get(message(MsgAjouterRendezVous.class));

         // ...

     });
