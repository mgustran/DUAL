package builderPattern;

/**
 * Created by mgustran on 28/04/2016.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
