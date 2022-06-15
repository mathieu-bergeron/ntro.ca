public class ActionsActives implements Value {
    
    private Cadran      cadran;
    private Set<String> actions = new HashSet<>();

    private EvtActionJoueur evtActionJoueur = NtroApp.newEvent(EvtActionJoueur.class);

    public Set<String> getActions() {
        return actions;
    }

    public void setActions(Set<String> actions) {
        this.actions = actions;
    }
    
    public ActionsActives() {
    }

    public ActionsActives(Cadran cadran) {
        this.cadran = cadran;
    }

    public void activer(Action action) {
        actions.add(action.name());

        evtActionJoueur.setAction(new ActionJoueur(cadran, action));
        evtActionJoueur.trigger();
    }

    public void desactiver(Action action) {
        actions.remove(action.name());

        if(actions.isEmpty()) {
            
            evtActionJoueur.setAction(new ActionJoueur(cadran, Action.ARRET));
            evtActionJoueur.trigger();
            
        }else {
            for(String actionRestante : actions) {
                evtActionJoueur.setAction(new ActionJoueur(cadran, Action.valueOf(actionRestante)));
                evtActionJoueur.trigger();
                break;
            }
        }
    }

    public void desactiver(String action) {
        desactiver(Action.valueOf(action));
    }

    public void toutDesactiver() {
        for(String action : actions) {
            desactiver(action);
        }
    }
}
