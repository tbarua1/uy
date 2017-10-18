package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	/*
	 * The Comparator interface gives you the capability to sort a given
	 * collection any number of different ways. The another handy thing about
	 * the Comparator interface is that you can use it to sort instances of any
	 * class—even classes you can't modify—unlike the Comparable interface,
	 * which forces you to change the class whose instances you want to sort.
	 * 
	 * The Comparator interface is also very easy to implement, having only one
	 * method, compare().The Comparator.compare() method returns an int.
	 
    negative if objOne < objTwo
    zero if objOne == objTwo
    positive if objOne > objTwo

	 */
	 public static class StringComparator implements Comparator<String> {
	      @Override
	      public int compare(String s1, String s2) {
	         return s1.compareToIgnoreCase(s2);
	      }
	   }
	 
	   // Define a Comparator<Integer> to order Integers based on the least significant digit
	   public static class IntegerComparator implements Comparator<Integer> {
	      @Override
	      public int compare(Integer s1, Integer s2) {
	         return s1%10 - s2%10;
	      }
	   }
	 
	   public static void main(String[] args) {
	      // Use a customized Comparator for Strings
	      Comparator<String> compStr = new StringComparator();
	 
	      // Sort and search an "array" of Strings
	      String[] array = {"Hello", "Hi", "HI", "hello"};
	      Arrays.sort(array, compStr);
	      System.out.println(Arrays.toString(array));  // [Hello, hello, Hi, HI]
	      System.out.println(Arrays.binarySearch(array, "Hello", compStr)); // 1
	      System.out.println(Arrays.binarySearch(array, "HELLO", compStr)); // 1 (case-insensitive)
	 
	      // Use a customized Comparator for Integers
	      Comparator<Integer> compInt = new IntegerComparator();
	 
	      // Sort and search a "List" of Integers
	      List<Integer> lst = new ArrayList<Integer>();
	      lst.add(42);  // auto-box
	      lst.add(21);
	      lst.add(34);
	      lst.add(13);
	      Collections.sort(lst, compInt);
	      System.out.println(lst);  // [21, 42, 13, 34]
	      System.out.println(Collections.binarySearch(lst, 22, compInt)); // 1
	      System.out.println(Collections.binarySearch(lst, 35, compInt)); // -5 (insertion at index 4)
	   }

}
