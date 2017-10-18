/*
   Recommended by Sun Microsystem:
 
 * throws keyword doesn't prevent abnormal termination That's why recommended is to use try catch block !!
 * By using throws key word we can say it's to use to convince compiler !!
 * Use to delegate the Exception to the caller 
 * throws keyword require only for checked exception ! You can use for unchecked exception but their is no   	uses or impact !! 
 */

/*
Condition 1: No valid because we can only define throwable type !
class hello
{
public void method()throws hello{
		
}
}*/

/*
Condition 2: In this case it's valid because our class is extending RuntimeException

class hello extends RuntimeException
{
public void method()throws hello
{
// your logic...
}
}
*/

/*
condition1 : Exception is a checked Exception So in this case compiler is going to 
rise an issue !  that if you are declaring unchecked exception so u have to handle it!

class hello2
{
public static void main(String[] args) 
{
throw new Exception();
}
}

*/

/* Error is unchecked exception ! So No problem at all !
 condition 2:

 class hello2
	{
	public static void main(String[] args) {
		
		throw new Error();
	}
} */
	
public class ex44 {
public static void main(String[] args)throws ArithmeticException {
	System.out.println("start main");
	methodA();
	System.out.println("exit main");
}
public static void methodA()throws ArithmeticException {
	System.out.println("start A");
	methodB();
	System.out.println("exit A");
}
public static void methodB()throws ArithmeticException {
	System.out.println("start B");
	methodC();
System.out.println("exit B");
}
public static void methodC()throws ArithmeticException {
	try {
	System.out.println(10/0);
	} catch (Exception e) {
	e.printStackTrace();}
	System.out.println("start C");
	System.out.println("exit C");
}
}
