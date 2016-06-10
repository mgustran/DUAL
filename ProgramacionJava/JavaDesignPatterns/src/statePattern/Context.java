package statePattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class Context {
    private State state;
    public Context(){
        state = null;
    }
    public void setState(State state){
        this.state = state;
    }
    public State getState(){
        return state;
    }

}
