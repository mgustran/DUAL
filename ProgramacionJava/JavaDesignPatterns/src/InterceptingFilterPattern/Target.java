package InterceptingFilterPattern;

/**
 * Created by mgustran on 10/05/2016.
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing Request: " + request);
    }
}
