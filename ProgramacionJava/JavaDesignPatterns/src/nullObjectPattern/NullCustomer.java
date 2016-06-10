package nullObjectPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
    @Override
    public boolean isNil() {
        return true;
    }
}
