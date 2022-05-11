public class Collaboration implements Value {

    public void {1:MCS:=afficherSur~afficherSurConsole}({1:MCS:VueFileAttente vueFileAttente~VueDessin vueDessin~=FragmentCollaboration fragmentCollaboration~FragmentCollaborateur fragmentCollaborateur~∅}{1:MCS:, ViewLoader<FragmentCollaboration> viewLoaderCollaboration~=∅}{1:MCS:=, ViewLoader<FragmentCollaborateur> viewLoaderCollaborateur~∅}) {

        {1:MCS:vueFileAttente~vueDessin~=fragmentCollaboration~fragmentCollaborateur~∅}{1:MCS:=.effacerLesCollaborateurs();~.afficherLesCollaborateurs();~∅}
        
        for({1:MCS:Collaboration~RendezVous~PartieEnCours~=Collaborateur} {1:MCS:collaboration~rendezVous~partieEnCours~=collaborateur} : {1:MCS:collaborations~collaborationsDansOrdre~rendezVousDansOrdre~partieEnCoursDansOrdre~=collaborateurs~collaborateursDansOrdre}) {
            
            {1:MCS:FragmentCollaboration~=FragmentCollaborateur~∅} {1:MCS:fragmentCollaboration~=fragmentCollaborateur~∅} {1:MCS:＝ viewLoaderCollaboration.createView();~=＝ viewLoaderCollaborateur.createView();~∅}

            {1:MCS:collaboration~rendezVous~partieEnCours~=collaborateur}.{1:MCS:=afficherSur~afficherSurConsole}({1:MCS:fragmentCollaboration~=fragmentCollaborateur~∅}{1:MCS:=, viewLoaderCollaborateur~∅});

            {1:MCS:vueFileAttente~vueDessin~=fragmentCollaboration~fragmentCollaborateur~∅}.{1:MCS:=ajouterCollaborateur~retirerCollaborateur}({1:MCS:=fragmentCollaborateur~nom~collaborateur~∅});

        }
        
        
    }
