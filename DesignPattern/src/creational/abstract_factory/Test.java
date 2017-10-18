package creational.abstract_factory;

public class Test {
	/*
	 * Abstract Factory pattern is similar to Factory pattern and it’s factory
	 * of factories. If you are familiar with factory design pattern in java,
	 * you will notice that we have a single Factory class that returns the
	 * different sub-classes based on the input provided and factory class uses
	 * if-else or switch statement to achieve this.In Abstract Factory pattern,
	 * we get rid of if-else block and have a factory class for each sub-class
	 * and then an Abstract Factory class that will return the sub-class based
	 * on the input factory class
	 */
	public static void main(String[] args) {

		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// call draw method of Shape Circle
		shape1.draw();

		// get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// call draw method of Shape Rectangle
		shape2.draw();

		// get an object of Shape Square
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// call draw method of Shape Square
		shape3.draw();

		// get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// get an object of Color Red
		Color color1 = colorFactory.getColor("RED");

		// call fill method of Red
		color1.filled();

		// get an object of Color Green
		Color color2 = colorFactory.getColor("Green");

		// call fill method of Green
		color2.filled();

		// get an object of Color Blue
		Color color3 = colorFactory.getColor("BLUE");

		// call fill method of Color Blue
		color3.filled();
	}
}
