package collection.list.array_list;

import java.util.ArrayList;
import java.util.List;

public class ImmutableObject {
	public static void main(String[] args) {
	      List<String> lst = new ArrayList<String>();
	      lst.add("alpha");
	      lst.add("beta");
	      lst.add("charlie");
	      System.out.println(lst);   // [alpha, beta, charlie]
	 
	      for (String str : lst) {
	         str += "change!";   // cannot modify "immutable" objects
	         System.out.println(str);
	      }
	      System.out.println(lst);   // [alpha, beta, charlie]
	   }
}
