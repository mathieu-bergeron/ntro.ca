import static ca.ntro.app.tasks.frontend.FrontendTasks.*;

public class FrontalPong implements FrontendFx {
    
    @Override
    public void createTasks(FrontendTasks tasks) {

        tasks.task("afficherFenetre")
        
             .waitsFor(window())
             
             .thenExecutes(inputs -> {

                 Window window = inputs.get(window());

                 window.show();
             });
    }

    @Override
    public void registerEvents(EventRegistrar registrar) {
        
    }

    @Override
    public void registerViews(ViewRegistrarFx registrar) {
        
    }

    @Override
    public void execute() {
        
    }

}
