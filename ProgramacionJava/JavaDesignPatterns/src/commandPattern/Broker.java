package commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mgustran on 29/04/2016.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
