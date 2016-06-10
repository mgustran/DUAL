package observerPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
