package abacus;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Type mismatch: cannot convert from Object to String
		Object o = "Ha!";
		String s =  (String) o; // DOESN'T COMPILE

		// Compiles fine, cast succeeds at run-time
		Object o1 = "Ha!";
		String s1 = (String) o;

		// Compiles fine, throws ClassCastException at run-time
		Object o2 = Boolean.FALSE;
		String s2 = (String) o; 
		System.out.println(o+" "+s+" "+o1+" "+s1+" "+o2+" "+s2+" ");
	}

}
