package behavioral.observer;

public class Test {
	/*
	 * Observer design pattern is useful when you are interested in the state of
	 * an object and want to get notified whenever there is any change. In
	 * observer pattern, the object that watch on the state of another object
	 * are called Observer and the object that is being watched is called
	 * Subject.
	 * 
	 * Java provides inbuilt platform for implementing Observer pattern through
	 * java.util.Observable class and java.util.Observer interface. However it’s
	 * not widely used because the implementation is really simple and most of
	 * the times we don’t want to end up extending a class just for implementing
	 * Observer pattern as java doesn’t provide multiple inheritance in classes.
	 * 
	 * Java Message Service (JMS) uses Observer pattern along with Mediator
	 * pattern to allow applications to subscribe and publish data to other
	 * applications
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	}

}
/*
 * Observer pattern is used when there is one-to-many relationship between
 * objects such as if one object is modified, its depenedent objects are to be
 * notified automatically. Observer pattern falls under behavioral pattern
 * category.
 */