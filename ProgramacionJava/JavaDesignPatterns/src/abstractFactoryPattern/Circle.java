package abstractFactoryPattern;

/**
 * Created by mgustran on 28/04/2016.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}