package collection.list.vector;

import java.util.Vector;

public class BasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vct = new Vector<String>();
		//adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		System.out.println(vct);
		//adding element at specified index
		vct.add(2,"Random");
		System.out.println(vct);
		//getting elements by index
		System.out.println("Element at index 3 is: "+vct.get(3));
		//getting first element
		System.out.println("The first element of this vector is: "+vct.firstElement());
		//getting last element
		System.out.println("The last element of this vector is: "+vct.lastElement());
		//how to check vector is empty or not
		System.out.println("Is this vector empty? "+vct.isEmpty());
	}

}
