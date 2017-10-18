package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		// TODO Auto-generated method stub
		List<Person> femalePerson = new ArrayList<Person>();
		for (Person person2 : femalePerson) {
			if (person2.getGender().equalsIgnoreCase("Female")) {
				femalePerson.add(person2);
			}
		}
		return femalePerson;
	}

}
