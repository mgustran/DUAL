package visitorPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
