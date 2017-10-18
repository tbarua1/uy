package collection.list.vector;

import java.util.Enumeration;
import java.util.Vector;

public class UsingEnumration {
	/*
	 * The Vector class implements a growable array of objects. Like an array,
	 * it contains components that can be accessed using an integer index.
	 * However, the size of a Vector can grow or shrink as needed to accommodate
	 * adding and removing items after the Vector has been created.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();// creating vector
		v.add("Tarkeshwar Barua");// method of Collection
		v.addElement("Tarun Rahi");// method of Vector
		v.addElement("Manju");
		// traversing elements using Enumeration
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
