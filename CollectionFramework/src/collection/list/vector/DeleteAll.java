package collection.list.vector;

import java.util.Vector;

public class DeleteAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector:" + vct);
		vct.clear();
                
		System.out.println("After clear vector:" + vct);
	}

}
