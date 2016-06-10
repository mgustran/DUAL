package InterceptingFilterPattern;

/**
 * Created by mgustran on 10/05/2016.
 */
public class AuthenticationFilter implements Filter {

    public void execute(String request) {
        System.out.println("Authenticating Request: " + request);
    }
}
