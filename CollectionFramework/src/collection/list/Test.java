package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	/*
	 * The List interface extends Collection to define an 
    ordered collection
	 * with duplicates allowed. The List interface adds 
    position-oriented
	 * operations, as well as a new list iterator that 
    enables the user to
	 * traverse the list bi-directionally. ArrayList, 
    LinkedList and vector are
	 * classes implementing List interface.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> lst = new ArrayList<String>();
	      lst.add("alpha");
	      lst.add("beta");
	      lst.add("charlie");
	 System.out.println("before Size "+lst.size());
	      // Use the Object[] version
	      Object[] strArray1 = lst.toArray();
	      System.out.println(Arrays.toString(strArray1));   // [alpha, beta, charlie]
	 
	      // Use the generic type verion - Need to specify the type in the argument
	      String[] strArray2 = lst.toArray(new String[0]);
	      strArray2[0] = "delta";   // modify the returned array
	      System.out.println(Arrays.toString(strArray2));   // [delta, beta, charlie]
	      System.out.println(lst);
               lst.add("alpha");
	      lst.add("beta");
	      lst.add("charlie");
              System.out.println("After Size "+lst.size());
              lst.remove("alpha");
              System.out.println("After Size "+lst.size());
              lst.remove(0);
              System.out.println("After Size "+lst.size());
	}

}
