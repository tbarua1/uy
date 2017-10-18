
public class WhyObjectBaseClass {
public static void main(String[] args) {
	String str = new String("Hi");
	Class strClass = str.getClass();
	System.out.println("Super class of String: " + strClass.getSuperclass());
        Object obj = new Object();
	Class objClass = obj.getClass();
	System.out.println("Super class of Object: " + objClass.getSuperclass());
	Class classClass = objClass.getClass();
	System.out.println("Super class of Class: "
			+ classClass.getSuperclass());
}
}
