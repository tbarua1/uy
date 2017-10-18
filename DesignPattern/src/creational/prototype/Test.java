package creational.prototype;

public class Test {
	/*
	 * Prototype pattern is used when the Object creation is a costly affair and
	 * requires a lot of time and resources and you have a similar object
	 * already existing. So this pattern provides a mechanism to copy the
	 * original object to a new object and then modify it according to our
	 * needs. This pattern uses java cloning to copy the object.
	 * 
	 * Prototype design pattern mandates that the Object which you are copying
	 * should provide the copying feature. It should not be done by any other
	 * class. However whether to use shallow or deep copy of the Object
	 * properties depends on the requirements and its a design decision
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bookShop = new BookShop();
		// bookShop.setBook(book);
		bookShop.setShopName("New Book Store");
		bookShop.loadData();
		bookShop.getBook().remove(1);
		System.out.println(bookShop);
		;

		/*
		 * BookShop secondShop=new BookShop(); //bookShop.setBook(book);
		 * secondShop.setShopName("New Second Book Store");
		 * secondShop.loadData(); System.out.println(secondShop);
		 */

		// shellow cloning deep cloning
		// BookShop secondShop=(BookShop)bookShop.clone();
		BookShop secondShop = bookShop.clone();
		System.out.println(secondShop);
	}

}
