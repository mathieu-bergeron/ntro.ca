public abstract class World2d<...> {

    public void onTimePasses(double secondsElapsed) {
        for(Object2d<> objet2d : objects) {
            objet2d.onTimePasses(secondsElapsed);
        }
    }
