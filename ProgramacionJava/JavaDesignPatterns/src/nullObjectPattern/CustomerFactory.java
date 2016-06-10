package nullObjectPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie", "Mothafucka"};
    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
