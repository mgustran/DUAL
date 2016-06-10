package mediatorPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class MediatorPatternDemo {
    public static void main(String[] args){
        User Ramon = new User("Ramon el cojo");
        User Cataline = new User ("Cati la coja");

        Ramon.sendMessage("Hi cataline");
        Cataline.sendMessage("Hello! Robert!");
    }
}

