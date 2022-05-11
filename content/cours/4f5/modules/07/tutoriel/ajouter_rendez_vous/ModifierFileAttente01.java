private static void ajouterRendezVous(BackendTasks tasks) {
    tasks.task("ajouterRendezVous")

         .waitsFor(message(MsgAjouterRendezVous.class))
         
         .thenExecutes(inputs -> {

             MsgAjouterRendezVous msgAjouterRendezVous = inputs.get(message(MsgAjouterRendezVous.class));
             ModeleFileAttente    fileAttente          = inputs.get(model(ModeleFileAttente.class));

             // Intuitivement, on veut
             // fileAttente.ajouterRendezVous(msgAjouterRendezVous);

             // Avec l'inversion des dépendances, on va plutôt faire:
             msgAjouterRendezVous.ajouterA(fileAttente);

         });
}
