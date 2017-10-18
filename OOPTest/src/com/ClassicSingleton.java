package com;

public class ClassicSingleton {
	 private static ClassicSingleton instance = null;
	   private ClassicSingleton() {
	      // Exists only to defeat instantiation.
	   }

	   public static ClassicSingleton getInstance() {
	      if(instance == null) {
	         instance = new ClassicSingleton();
	      }
	      return instance;
	   }
//1808253012

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassicSingleton test=ClassicSingleton.getInstance();
		System.out.println(test.hashCode());

}
}