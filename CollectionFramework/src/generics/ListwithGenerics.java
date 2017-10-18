package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListwithGenerics {
	 public static void main(String[] args) {
	      List<String> lst = new ArrayList<String>();  // Inform compiler about the type
	      lst.add("alpha");         // compiler checks if argument's type is String
	      lst.add("beta");
	      lst.add("charlie");
	      System.out.println(lst);  // [alpha, beta, charlie]
	 
	      Iterator<String> iter = lst.iterator();   // Iterator of Strings
	      System.out.println("Listing by Iterator");
	      while (iter.hasNext()) {
	         String str = iter.next();  // compiler inserts downcast operator
	         System.out.println(str);
	      }
	 
//	      lst.add(new Integer(1234));   // ERROR: compiler can detect wrong type
//	      Integer intObj = lst.get(0);  // ERROR: compiler can detect wrong type
	 
	      // Enhanced for-loop (JDK 1.5)
	      System.out.println("Normal/Ordinery Listing");
	      for (String str : lst) {
	         System.out.println(str);
	      }
	   }
}
