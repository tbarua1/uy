package behavioral.iterator;

public class Test {
	/*
	 * According to GoF, Iterator Pattern is used
	 * "to access the elements of an aggregate object sequentially without exposing its underlying implementation"
	 * .
	 * 
	 * The Iterator pattern is also known as Cursor.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionofNames cmpnyRepository = new CollectionofNames();

		for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}

}
/*
 * Iterator pattern in one of the behavioral pattern and it’s used to provide a
 * standard way to traverse through a group of Objects. Iterator pattern is
 * widely used in Java Collection Framework where Iterator interface provides
 * methods for traversing through a collection.
 * 
 * Iterator pattern is not only about traversing through a collection, we can
 * provide different kind of iterators based on our requirements. Iterator
 * pattern hides the actual implementation of traversal through the collection
 * and client programs just use iterator methods. Check out Iterator Pattern
 * post for example program and implementation details.
 */