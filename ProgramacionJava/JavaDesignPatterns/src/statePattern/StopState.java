package statePattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
    public String toString(){
        return "Stop State";
    }

    @Override
    public void doAction(javax.naming.Context context) {

    }
}
