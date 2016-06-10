package abstractFactoryPattern;

/**
 * Created by mgustran on 28/04/2016.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}