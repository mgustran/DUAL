package templatePattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();


    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
