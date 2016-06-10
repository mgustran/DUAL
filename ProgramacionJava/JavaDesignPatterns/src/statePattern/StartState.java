package statePattern;




/**
 * Created by mgustran on 02/05/2016.
 */
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
    public String toString(){
        return "Start State";
    }


    @Override
    public void doAction(javax.naming.Context context) {

    }
}

