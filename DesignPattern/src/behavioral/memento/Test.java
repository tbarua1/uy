package behavioral.memento;

public class Test {
	/*
	 * Memento design pattern is used when we want to save the state of an
	 * object so that we can restore later on. Memento pattern is used to
	 * implement this in such a way that the saved state data of the object is
	 * not accessible outside of the object, this protects the integrity of
	 * saved state data.
	 * 
	 * Memento pattern is implemented with two objects – Originator and
	 * Caretaker. Originator is the object whose state needs to be saved and
	 * restored and it uses an inner class to save the state of Object. The
	 * inner class is called Memento and its private, so that it can’t be
	 * accessed from other objects.
	 */
	public static void main(String[] args) {
		Originator originator = new Originator();
	      CareTaker careTaker = new CareTaker();
	      
	      originator.setState("State #1");
	      originator.setState("State #2");
	      careTaker.add(originator.setStateToMemento());
	      
	      originator.setState("State #3");
	      careTaker.add(originator.setStateToMemento());
	      
	      originator.setState("State #4");
	      System.out.println("Current State: " + originator.getState());		
	      
	      originator.getStateFromMemento(careTaker.get(0));
	      System.out.println("First saved State: " + originator.getState());
	      originator.getStateFromMemento(careTaker.get(1));
	      System.out.println("Second saved State: " + originator.getState());
	 
	}
}
/*
 * Memento pattern is used to restore state of an object to a previous state.
 * Memento pattern falls under behavioral pattern category.
 */