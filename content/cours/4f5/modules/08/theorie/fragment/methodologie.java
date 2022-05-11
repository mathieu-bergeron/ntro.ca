public class FragmentRendezVous extends ViewFx {

    @FXML
    // ...
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ...

}


// Dans le Frontal
@Override
public void registerViews(ViewRegistrarFx registrar) {

    // ...

    registrar.registerView(FragmentRendezVous.class, "/fragments/rendez_vous.xml")

}

// Dans les tâches du Frontal

viewLoader(FragmentRendezVous.class)

// et

ViewLoader<FragmentRendezVous> viewLoaderRendezVous = inputs.get(viewLoader(FragmentRendezVous.class));
