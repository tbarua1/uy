package com.tarkesh.abstractiont;
abstract class Shape {
	abstract void draw();
}
class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}
class Test {
	public static void main(String args[]) {
		Shape s = new Circle1();// In real scenario, object is provided through
		s.draw();
	}
}

/*
 * public class Test {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */