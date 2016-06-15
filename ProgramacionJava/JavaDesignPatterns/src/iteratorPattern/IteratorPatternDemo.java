package iteratorPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        for(Iterator item = namesRepository.getIterator(); item.hasNext();){
            String name = (String)item.next();
            System.out.println("Name : " + name);
        }
    }
}
