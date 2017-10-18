package exception;

public class DevidebyZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		for (int i = 5; i >= 0; i--) {
			System.out.println(i+" ,  "+(10 / i));
		}}catch(ArithmeticException e){System.out.println(" Error - " +e);}
		System.out.println("After for loop...");
	}

}
