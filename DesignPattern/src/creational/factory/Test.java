package creational.factory;

//Low coupling high cohesion 
public class Test {
	/*
	 * Factory design pattern is used when we have a super class with multiple
	 * sub-classes and based on input, we need to return one of the sub-class.
	 * This pattern take out the responsibility of instantiation of a class from
	 * client program to the factory class. We can apply Singleton pattern on
	 * Factory class or make the factory method static
	 */
	public static void main(String[] args) {
		// OS obj=(OS) new Android();
		// obj.spec();
		// }
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("Closed");
		obj.spec();
	}
}
