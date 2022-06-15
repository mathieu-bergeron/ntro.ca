package dessin.{1:MCS:=frontal~dorsal}.taches;

public class {1:MCS:=AfficherFileAttente~Initialisation~Navigation~ModifierFileAttente~InitialiserModeles} {

    public static void creerTaches({1:MCS:=FrontendTasks~BackendTasks}} tasks) {

        tasks.taskGroup({1:MCS:="AfficherFileAttente"~"Initialisation"~"Navigation"})
        
             {1:MCS:=.waitsFor("Initialisation")~∅}

             {1:MCS:.waitsFor("Navigation")~=∅}

             {1:MCS:.waitsFor("AfficherFileAttente")~=∅}

             {1:MCS:.waitsFor("AfficherDessin")~=∅}

             .andContains(subTasks -> {

                 // ...
                 
                 // ajouter
                 afficherFileAttenteSurConsole(subTasks);

             });
    }

    private static void afficherFileAttenteSurConsole({1:MCS:=FrontendTasks~BackendTasks} tasks) {
        
        tasks.task("afficherFileAttenteSurConsole")

             {1:MCS:=.waitsFor(modified(ModeleFileAttente.class))~∅}

             {1:MCS:.waitsFor(model(ModeleFileAttente.class))~=∅}

             {1:MCS:.waitsFor(viewLoader(FragmentCollaboration.class))~=∅}

             {1:MCS:.waitsFor(viewLoader(FragmentCollaborateur.class))~=∅}

             .thenExecutes(inputs -> {

                 {1:MCS:VueDessin vueDessin = inputs.get(created(VueDessin.class));~=∅}

                 {1:MCS:VueFileAttente vueFileAttente = inputs.get(created(VueFileAttente.class));~=∅}

                 {1:MCS:=Modified<ModeleFileAttente> modifiedFileAttente = inputs.get(modified(ModeleFileAttente.class));~∅}

                 {1:MCS:ModeleFileAttente fileAttente = inputs.get(model(ModeleFileAttente.class));~=∅}

                 {1:MCS:ViewLoader<FragmentCollaboration> viewLoaderCollaboration = inputs.get(viewLoader(FragmentCollaboration.class));~=∅}

                 {1:MCS:ViewLoader<FragmentCollaborateur> viewLoaderCollaborateur = inputs.get(viewLoader(FragmentCollaborateur.class));~=∅}

                 {1:MCS:=ModeleFileAttente fileAttente = modifiedFileAttente.currentValue();~∅}
                 
                 fileAttente.{1:MCS:=afficherSurConsole()~afficherSur(vueDessin)~afficherSur(VueFileAttente)~afficherSur(vueFileAttente, viewLoaderCollaboration, viewLoaderCollaborateur)~afficherSur(vueDessin, viewLoaderCollaboration, viewLoaderCollaborateur)};

             });
    }
