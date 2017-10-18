import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//Note: In case of throws Case 

/*In our program if their is a possibility of rising checked 
exception then compulsory we should handle that checked 
exception otherwise we will get compile time error saying i.e. 
unreported exception must be caught or declared to be thrown ! */
public class ex33 
{
public static void main(String[] args)throws FileNotFoundException 
{
	//Case 1:
	Scanner s=new Scanner(new File("abc.in"));
	//your code goes here !
	
	//Case 1:
	/*PrintWriter p=new PrintWriter("abcd.txt");
	p.println("hey !");
	//compile time exception !!
	} */

	//Case2:
//	Thread.sleep(1000);
}}
