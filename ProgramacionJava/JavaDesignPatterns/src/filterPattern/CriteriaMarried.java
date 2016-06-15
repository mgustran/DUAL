package filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mgustran on 28/04/2016.
 */
public class CriteriaMarried implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> marriedPersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("MARRIED")){
                marriedPersons.add(person);
            }
        }
        return marriedPersons;
    }
}