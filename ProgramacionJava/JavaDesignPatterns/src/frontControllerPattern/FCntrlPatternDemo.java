package frontControllerPattern;

/**
 * Created by mgustran on 10/05/2016.
 */
public class FCntrlPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
