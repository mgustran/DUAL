package nullObjectPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean isNil() {
        return false;
    }
}
