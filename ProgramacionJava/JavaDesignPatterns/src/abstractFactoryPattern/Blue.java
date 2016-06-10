package abstractFactoryPattern;

/**
 * Created by mgustran on 28/04/2016.
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
