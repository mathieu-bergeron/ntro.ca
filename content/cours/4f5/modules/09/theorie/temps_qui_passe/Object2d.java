public abstract class Object2d<...> {

    public void onTimePasses(double secondsElapsed) {
        topLeftX += speedX * secondsElapsed;
        topLeftY += speedY * secondsElapsed;
    }
