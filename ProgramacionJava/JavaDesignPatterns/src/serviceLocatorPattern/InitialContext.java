package serviceLocatorPattern;

/**
 * Created by mgustran on 11/05/2016.
 */
public class InitialContext {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Lookin up and creatin a new Service1 object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Lookin up and creatin a new Service2 object");
            return new Service2();
        }
        return null;
    }


}
