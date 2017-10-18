package collection.list.array_list;

import java.util.ArrayList;
import java.util.List;

public class MutableObjects {
	 public static void main(String[] args) {
	      List<StringBuilder> lst = new ArrayList<StringBuilder>();
	      lst.add(new StringBuilder("alpha"));
	      lst.add(new StringBuilder("beta"));
	      lst.add(new StringBuilder("charlie"));
	      System.out.println(lst);   // [alpha, beta, charlie]
	 
	      for (StringBuilder sb : lst) {
	         sb.append("88");   // can modify "mutable" objects
	      }
	      System.out.println(lst);  // [alpha88, beta88, charlie88]
	   }
}
