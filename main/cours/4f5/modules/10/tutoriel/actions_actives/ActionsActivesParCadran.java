public class ActionsActivesParCadran implements Value {
    
    private Map<String, ActionsActives> actionsActives = new HashMap<>();

    public Map<String, ActionsActives> getActionsActives() {
        return actionsActives;
    }

    public void setActionsActives(Map<String, ActionsActives> actionsActives) {
        this.actionsActives = actionsActives;
    }

    public ActionsActivesParCadran() {
        actionsActives.put(Cadran.GAUCHE.name(), new ActionsActives(Cadran.GAUCHE));
        actionsActives.put(Cadran.DROITE.name(), new ActionsActives(Cadran.DROITE));
    }

    public void activer(Cadran cadran, Action action) {
        actionsActives.get(cadran.name()).activer(action);
    }

    public void desactiver(Cadran cadran, Action action) {
        actionsActives.get(cadran.name()).desactiver(action);
    }

    public void toutDesactiver() {
        for(ActionsActives actionsActives : actionsActives.values()) {
            actionsActives.toutDesactiver();
        }
    }

}
