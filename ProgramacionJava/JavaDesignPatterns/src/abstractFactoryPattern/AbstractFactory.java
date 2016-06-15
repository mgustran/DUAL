package abstractFactoryPattern;

/**
 * Created by mgustran on 28/04/2016.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}