package comparators;

import java.util.Comparator;

public class PersonCnpComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getCnp() < person2.getCnp()) {
            return -1;
        } else if (person1.getCnp() > person2.getCnp()) {
            return 1;
        }
        return 0;
    }
}
