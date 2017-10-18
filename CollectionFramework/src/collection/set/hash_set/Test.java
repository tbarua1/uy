package collection.set.hash_set;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(1, "Java");
		Book book1Dup = new Book(1, "Java"); // same id as above
		Book book2 = new Book(2, "Android");
		Book book3 = new Book(3, "Spring");

		Set<Book> set1 = new HashSet<Book>();
		set1.add(book1);
		set1.add(book1Dup); // duplicate id, not added
		set1.add(book1); // added twice, not added
		set1.add(book3);
		set1.add(null); // Set can contain a null
		set1.add(null); // but no duplicate
		set1.add(book2);
		System.out.println("All Set - "+set1); // [null, 1: Java, 2: Android, 3: Spring]

		set1.remove(book1);
		set1.remove(book3);
		System.out.println("After Removing book 1 and 3 - "+set1); // [null, 2: Android]

		Set<Book> set2 = new HashSet<Book>();
		set2.add(book3);
		System.out.println("Another New Set - "+set2); // [3: Spring]
		set2.addAll(set1); // "union" with set1
		System.out.println("After Adding set1 into set2 - "+set2); // [null, 2: Android, 3: Spring]

		set2.remove(null);
		System.out.println("After Removing null - "+set2); // [2: Android, 3: Spring]
		set2.retainAll(set1); // "intersection" with set1
		System.out.println(""+set2); // [2: Android]
	}

}
