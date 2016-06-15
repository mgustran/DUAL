package commandPattern;

/**
 * Created by mgustran on 29/04/2016.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute(){
        abcStock.sell();
    }
}
