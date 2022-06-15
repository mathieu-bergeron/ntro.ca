tasks.task("modifierModele")

     .waitsFor(modele(MonModele.class))

     .thenExecutes(inputs -> {

         MonModele monModele = input.gets(model(MonModele.class);


         monModele.ajouterQuelqueChose("valeur");

     });
