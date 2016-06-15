package visitorPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class VisitorPatternDemo {
    public static void main(String[] args){
        ComputerPart computer1 = new Computer();
        computer1.accept(new ComputerPartDisplayVisitor());
    }
}
