package com;

public class SingletonTest {
	 private static SingletonTest singleton = new SingletonTest( );

	   /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	   private SingletonTest() { }

	   /* Static 'instance' method */
	   public static SingletonTest getInstance( ) {
	      return singleton;
	   }

	   /* Other methods protected by singleton-ness */
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton");
	   }
	public static void main(String[] args) {
		SingletonTest test=SingletonTest.getInstance();
		test.demoMethod();
		SingletonTest.demoMethod();

	}

}
