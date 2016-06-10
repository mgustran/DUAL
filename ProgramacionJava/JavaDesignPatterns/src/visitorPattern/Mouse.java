package visitorPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class Mouse implements  ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
