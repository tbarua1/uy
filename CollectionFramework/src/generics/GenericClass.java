package generics;

public class GenericClass<T> {
	/*
	 * A generic class declaration looks like a non-generic class declaration,
	 * except that the class name is followed by a type parameter section.
	 * 
	 * As with generic methods, the type parameter section of a generic class
	 * can have one or more type parameters separated by commas. These classes
	 * are known as parameterized classes or parameterized types because they
	 * accept one or more parameters.
	 */
	 private T t;

	   public void add(T t) {
	      this.t = t;
	   }

	   public T get() {
	      return t;
	   }

	   public static void main(String[] args) {
		   GenericClass<Integer> integerBox = new GenericClass<Integer>();
		   GenericClass<String> stringBox = new GenericClass<String>();
	    
	      integerBox.add(new Integer(10));
	      stringBox.add(new String("Hello World"));

	      System.out.printf("Integer Value :%d\n\n", integerBox.get());
	      System.out.printf("String Value :%s\n", stringBox.get());
	   }
}
