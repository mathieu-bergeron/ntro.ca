public class DorsalPong extends LocalBackendNtro {

    @Override
    public void createTasks(BackendTasks tasks) {

        InitialiserModeles.creerTaches(tasks);
        ModifierFileAttente.creerTaches(tasks);

    }
