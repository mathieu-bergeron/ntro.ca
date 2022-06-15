public class {1:MCS:ModeleFileAttente~=Collaboration~Collaborateur~ModeleDessin~RendezVous~PartieEnCours~Forme~Cercle~Rectangle~Triangle} implements {1:MCS:Model~=Value} {

    // ...
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append({1:MCS:="Dessin "~idCollaboration~idRendezVous~idPartie~Session.nomUsager~idCollaborateur~nom~forme~couleur});
        builder.append({1:MCS:"Dessin "~=idCollaboration~idRendezVous~idPartie~Session.nomUsager~idCollaborateur~nom~forme~couleur});
        builder.append("\n");

        for({1:MCS:Collaboration~RendezVous~PartieEnCours~=Collaborateur} {1:MCS:collaboration~rendezVous~partieEnCours~=collaborateur} : {1:MCS:collaborations~collaborationsDansOrdre~rendezVousDansOrdre~partieEnCoursDansOrdre~=collaborateurs~collaborateursDansOrdre}) {
            
            builder.append({1:MCS:collaboration~rendezVous~partieEnCours~=collaborateur}.toString());
            builder.append("\n");
        }
        
        return builder.toString();
    }

}
