package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
/*sorted, unsorted, ordered and unordered.
 * Ordered means you can iterate in a particular order
 * */
	 public static void main(String[] args) {
	      List<String> lst = new ArrayList<String>();
	      lst.add("alpha");
	      lst.add("beta");
	      lst.add("charlie");
	 
	      // Use the Object[] version
	      Object[] strArray1 = lst.toArray();
	      System.out.println(Arrays.toString(strArray1));   // [alpha, beta, charlie]
	 
	      // Use the generic type verion - Need to specify the type in the argument
	      String[] strArray2 = lst.toArray(new String[0]);
	      strArray2[0] = "delta";   // modify the returned array
	      System.out.println(Arrays.toString(strArray2));   // [delta, beta, charlie]
	      System.out.println(lst);  // [alpha, beta, charlie] - no change in the original list
	   }
}
