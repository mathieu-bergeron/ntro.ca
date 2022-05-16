public abstract class {1:MCS:ModeleFileAttente~Collaboration~Collaborateur~ModeleDessin~RendezVous~PartieEnCours~=Forme~Cercle~Rectangle~Triangle} extends ObjetDessin2d implements {1:MCS:Model~=Value} {

    // ...
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append({1:MCS:"Dessin "~idCollaboration~idRendezVous~idPartie~Session.nomUsager~idCollaborateur~nom~forme~=nomForme()~couleur});
        builder.append(" (couleur ");
        builder.append({1:MCS:"Dessin "~idCollaboration~idRendezVous~idPartie~Session.nomUsager~idCollaborateur~nom~forme~nomForme()~=couleur});
        builder.append(")");
        
        return builder.toString();
    }
    
    protected abstract String nomForme();

}
