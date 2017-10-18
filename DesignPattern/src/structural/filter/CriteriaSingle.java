package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		List<Person> singlePerson = new ArrayList<Person>();
		for (Person person2 : singlePerson) {
			if (person2.getGender().equalsIgnoreCase("Single")) {
				singlePerson.add(person2);
			}
		}
		return singlePerson;
	}

}
