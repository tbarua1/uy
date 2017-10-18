package structural.decorator;

/*Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

We are demonstrating the use of decorator pattern via following example in which we will decorate a shape with some color without alter shape class.*/
public class Test {
	public static void main(String[] args) {
		Shape1 circle = new Circle();

		Shape1 redCircle = new RedShapeDecorator(new Circle());

		Shape1 redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
/*
 * Decorator design pattern is used to modify the functionality of an object at
 * runtime. At the same time other instances of the same class will not be
 * affected by this, so individual object gets the modified behavior. Decorator
 * design pattern is one of the structural design pattern (such as Adapter
 * Pattern, Bridge Pattern, Composite Pattern) and uses abstract classes or
 * interface with composition to implement.
 * 
 * We use inheritance or composition to extend the behavior of an object but
 * this is done at compile time and its applicable to all the instances of the
 * class. We can’t add any new functionality of remove any existing behavior at
 * runtime – this is when Decorator pattern comes into picture
 */