package collection.list.vector;

import java.util.List;
import java.util.Vector;

public class GetSubList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		vct.add("Click");
		System.out.println("Actual vector:" + vct);
		List<String> list = vct.subList(2, 4);
		System.out.println("Sub List: " + list);
	}

}
