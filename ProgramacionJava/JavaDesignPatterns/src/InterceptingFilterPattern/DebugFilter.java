package InterceptingFilterPattern;

/**
 * Created by mgustran on 10/05/2016.
 */
public class DebugFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("Request Log: " + request);
    }
}
