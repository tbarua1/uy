package structural.flyweight;

public class Test {
	/*
	 * Flyweight pattern is primarily used to reduce the number of objects
	 * created and to decrease memory footprint and increase performance. This
	 * type of design pattern comes under structural pattern as this pattern
	 * provides ways to decrease object count thus improving the object
	 * structure of application.
	 * 
	 * Flyweight pattern tries to reuse already existing similar kind objects by
	 * storing them and creates new object when no matching object is found. We
	 * will demonstrate this pattern by drawing 20 circles of different
	 * locations but we will create only 5 objects. Only 5 colors are available
	 * so color property is used to check already existing Circle objects.
	 */
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String[] args) {

		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
/*
 * Flyweight design pattern is used when we need to create a lot of Objects of a
 * class. Since every object consumes memory space that can be crucial for low
 * memory devices, such as mobile devices or embedded systems, flyweight design
 * pattern can be applied to reduce the load on memory by sharing objects.
 * String Pool implementation in java is one of the best example of Flyweight
 * pattern implementation
 */