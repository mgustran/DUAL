package abstractFactoryPattern;

/**
 * Created by mgustran on 28/04/2016.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}