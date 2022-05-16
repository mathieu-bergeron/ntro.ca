public class {1:MCS:ModeleFileAttente~Collaboration~=Collaborateur~ModeleDessin~RendezVous~PartieEnCours~Forme~Cercle~Rectangle~Triangle} implements {1:MCS:Model~=Value} {

    // ...

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("\t");
        builder.append({1:MCS:"Dessin "~idCollaboration~idRendezVous~idPartie~Session.nomUsager~idCollaborateur~=nom~forme~couleur});
        builder.append(", ");
        builder.append({1:MCS:"Dessin "~idCollaboration~idRendezVous~idPartie~Session.nomUsager~idCollaborateur~nom~=forme~couleur}.toString());
        
        return builder.toString();
    }
}
