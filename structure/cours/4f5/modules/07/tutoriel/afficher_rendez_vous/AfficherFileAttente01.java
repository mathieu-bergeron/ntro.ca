public class AfficherFileAttente {

    //...

    tasks.task("afficherFileAttente")

         .waitsFor(modified(ModeleFileAttente.class))

         .executes(inputs -> {

             // ...

             // ajouter
             fileCourante.afficherSur(vueFileAttente);

         });

    //...
