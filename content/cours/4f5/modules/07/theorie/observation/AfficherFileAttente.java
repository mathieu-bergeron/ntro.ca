
tasks.task("observerModele")

     .waitsFor(modified(MonModele.class))

     .executes(inputs -> {
         
         Modified<MonModele> monModele    = inputs.get(modified(MonModele.class));

         MonModele ancienneValeur = monModele.previousValue();
         MonModele valeurCourante = monModele.currentValue();

         
     });
