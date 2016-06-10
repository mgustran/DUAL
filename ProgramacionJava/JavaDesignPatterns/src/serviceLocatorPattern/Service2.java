package serviceLocatorPattern;

/**
 * Created by mgustran on 11/05/2016.
 */
public class Service2 implements Service {

    public void execute() {
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
