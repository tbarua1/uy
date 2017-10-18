package creational.builder;

public class Test {
	/*
	 * This pattern was introduced to solve some of the problems with Factory
	 * and Abstract Factory design patterns when the Object contains a lot of
	 * attributes. Builder pattern solves the issue with large number of
	 * optional parameters and inconsistent state by providing a way to build
	 * the object step-by-step and provide a method that will actually return
	 * the final Object
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Phone phone=new Phone("Android", "1 GHz", 6, 3000, 5);
		// System.out.println(phone);

		PhoneBuilder builder = new PhoneBuilder().setBattery(3000).
                        setOs("Android");
                Phone p = builder.getPhone();
		System.out.println(p);
	}

}
