package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		// TODO Auto-generated method stub
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person2 : malePersons) {
			if (person2.getGender().equalsIgnoreCase("Male")) {
				malePersons.add(person2);
			}
		}
		return malePersons;
	}

}
