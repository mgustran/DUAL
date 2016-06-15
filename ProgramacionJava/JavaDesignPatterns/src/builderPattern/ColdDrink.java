package builderPattern;

/**
 * Created by mgustran on 28/04/2016.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
