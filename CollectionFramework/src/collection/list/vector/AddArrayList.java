package collection.list.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AddArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vct = new Vector<>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector:" + vct);
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		vct.addAll(list);
		System.out.println("After Copy: " + vct);
	}

}
