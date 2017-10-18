package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;



public class ListIteratorTest {
	public static void main(String[] args) {

		System.out.println("List Test");
		// Create a collection
		ArrayList<String> list = new ArrayList<String>();
		// Adding
		String[] toys = { "Shoe", "Ball", "Frisbee" };
		list.addAll(Arrays.asList(toys));
		// Sizing
		System.out.println("List created" + ", size=" + list.size() + ", isEmpty=" + list.isEmpty());
		// Iteration using indexes.
		System.out.println("List iteration (unsorted):");
		for (int i = 0; i < list.size(); i++)
			System.out.println("   " + list.get(i));
		// Reverse Iteration using ListIterator
		System.out.println("List iteration (reverse):");
		//Iterator iterator=list.iterator();
		ListIterator<String> iterator =  list.listIterator(list.size());
		while (iterator.hasPrevious())
			System.out.println("   " + iterator.previous());
		// Removing
		list.remove(0);
		list.clear();
	}
}
