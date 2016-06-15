package strategyPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class OperationDivide implements Strategy {
    @Override
    public int doOperation(int num1, int num2){
        return num1/num2;
    }
}
