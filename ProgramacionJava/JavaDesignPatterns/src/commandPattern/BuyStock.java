package commandPattern;

/**
 * Created by mgustran on 29/04/2016.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute(){
        abcStock.buy();
    }
}
