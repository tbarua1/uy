package structural.flyweight;

public class Circle implements Shape2 {
	private String color;
	   private int x;
	   private int y;
	   private int radius;
	   
	public Circle(String color, int x, int y, int radius) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public Circle(String color) {
		super();
		this.color = color;
		}
	public Circle(int x, int y, int radius) {
		super();
		//this.color = color;
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
System.out.println("Circle [color=" + color + ", x=" + x + ", y=" + y + ", radius=" + radius + "]");
	}
	@Override
	public String toString() {
		return "Circle [color=" + color + ", x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	

}
