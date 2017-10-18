package behavioral.mediator;

public class Test {
	/*
	 * Mediator design pattern is used to provide a centralized communication
	 * medium between different objects in a system. Mediator design pattern is
	 * very helpful in an enterprise application where multiple objects are
	 * interacting with each other. If the objects interact with each other
	 * directly, the system components are tightly-coupled with each other that
	 * makes maintainability cost higher and not flexible to extend easily.
	 * Mediator pattern focuses on provide a mediator between objects for
	 * communication and help in implementing lose-coupling between objects.
	 * 
	 * Air traffic controller is a great example of mediator pattern where the
	 * airport control room works as a mediator for communication between
	 * different flights. Mediator works as a router between objects and it can
	 * have it’s own logic to provide way of communication.
	 */
	public static void main(String[] args) {
		User robert = new User("Robert");
	      User john = new User("John");

	      robert.sendMessage("Hi! John!");
	      john.sendMessage("Hello! Robert!");
	}
}
/*
 * Mediator pattern is used to reduce communication complexity between multiple
 * objects or classes. This pattern provides a mediator class which normally
 * handles all the communications between different classes and supports easy
 * maintenance of the code by loose coupling. Mediator pattern falls under
 * behavioral pattern category.
 */