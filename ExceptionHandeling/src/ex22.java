//
public class ex22 {
/*
     Condition 1: 
     public static void main(String[] argument) {
		System.out.println(10/0);
		System.out.println("after the Logic !");
		Output: Runtime Exception !!
	}*/
	
/*
	public static void main(String[] argument) {
	Condition 2:
	throw new ArithmeticException("/ by zero !");
	System.out.println("after the logic !"); //In this line Compile time Exception i.e.
												   Unreachable Code !
        Indirectly we can't write any statement after throw keyword !! 
		 * As we wrote in our program above !!
		 * NOTE:
		 
		 // Indirectly we can write as like 
		  * if(Some Condition){
		  *  //Your code  }
		  *  else {
		  *  //another piece of code }
		} */
	
	/* condition 3:
	  
	 If we will do
	 throw new ex22(); //Only throwable object can be thrown Not like this..
	 We will get compile time error ! i.e. incompatible types 
	 found: ex22
	 required: java.lang.Throwable
	 */
	
	/*
	 Condition 4:
	 Change we did : If our class in Extending Runtime Exception class then
	 class ex22 extends RuntimeException{
	 public static void main(String []args)
	 {
	 throw new ex22();
	 }
	 }
	 Output: Runtime Exception will come here !!
	 */
}
