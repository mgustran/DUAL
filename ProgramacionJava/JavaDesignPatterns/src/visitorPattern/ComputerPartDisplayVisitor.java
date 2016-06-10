package visitorPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void  visit(Keyboard keyboard){
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Mouse mouse){
        System.out.println("Dysplaying Mouse");
    }

    @Override
    public void  visit(Monitor monitor){
        System.out.println("Dysplaying Monitor");
    }
}
