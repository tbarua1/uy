package behavioral.visitor;

public class Test {
	/*
	 * Visitor pattern is used when we have to perform an operation on a group
	 * of similar kind of Objects. With the help of visitor pattern, we can move
	 * the operational logic from the objects to another class.
	 * 
	 * For example, think of a Shopping cart where we can add different type of
	 * items (Elements), when we click on checkout button, it calculates the
	 * total amount to be paid. Now we can have the calculation logic in item
	 * classes or we can move out this logic to another class using visitor
	 * pattern. Let’s implement this in our example of visitor pattern. Check
	 * out Visitor Pattern post for implementation details.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	}

}
/*
 * In Visitor pattern, we use a visitor class which changes the executing
 * algorithm of an element class. By this way, execution algorithm of element
 * can vary as and when visitor varies. This pattern comes under behavior
 * pattern category. As per the pattern, element object has to accept the
 * visitor object so that visitor object handles the operation on the element
 * object.
 */