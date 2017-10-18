package collection.list.array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lst = new ArrayList(); // A List contains instances of Object.
									// Upcast ArrayList to List
		lst.add("Tarkeshwar"); // add() takes Object. String upcast to Object
							// implicitly
		lst.add("Tarun");
		lst.add("Manju");
		System.out.println(lst); // [alpha, beta, charlie]

		// Get a "iterator" instance from List to iterate thru all the elements
		// of the List
		Iterator iter = lst.iterator();
		while (iter.hasNext()) { // any more element
			// Retrieve the next element, explicitly downcast from Object back
			// to String
			String str = (String) iter.next();
			System.out.println(str);
		}
	}

}
