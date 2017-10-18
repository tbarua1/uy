package io;
/* string class methods  */
class Scm {
	public static void main(String[] args) {
		String a1 = "Hi this is array of string";
		byte b1[] = a1.getBytes();
		char ch[] = a1.toCharArray();
		System.out.println(b1);
		System.out.println(ch);

		/** trim ***/
		String s1 = "     Hello How are you guys?     ";
		String t1 = s1.trim();
		
		System.out.println(t1);

				/*** index ***/
		String s3 = "Delhi";
		int x1 = s3.indexOf('a');
		System.out.println(x1);

		/*** index of ***/
		String s4 = "Hello How are You?";
		int x2 = s4.indexOf("are");
		// int x2=s4.indexof("are",a);
		System.out.println(x2);

		/*** substring ***/
		String s11 = "Hello How are You?";
		String s5 = s11.substring(10);
	
		// String s5=s11.substring(0,5);
		System.out.println(s5);
		// String s6=String.valueof(10);

		/** equals **/
		String s7 = "Hello";
		String s8 = new String("Hello");
		boolean b2 = s7.equals(s8);
		System.out.println(b2);

		/*** equalsIgnorecase ***/
		String s9 = "Hey";
		String s10 = "hey wats up";
		boolean b3 = s9.equalsIgnoreCase(s10);
		System.out.println(b3);
	}
}
