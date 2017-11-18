package collection.list.linked_list;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(1, "Java");
		Book book1Dup = new Book(1, "Java"); // same id as above
		Book book2 = new Book(2, "Android");
		Book book3 = new Book(3, "Spring");

		Set<Book> set = new LinkedHashSet<>();
		set.add(book1);
		set.add(book1Dup); // duplicate id, not added
		set.add(book1); // added twice, not added
		set.add(book3);
		set.add(null); // Set can contain a null
		set.add(null); // but no duplicate
		set.add(book2);
		System.out.println(set);}}
