package filterPattern;

/**
 * Created by mgustran on 28/04/2016.
 */
import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
