public class test11 
{
public static void main(String[] args) {
		
		try {
			
			int i[]=new int[2];
			i[0]=10; 
			i[1]=20; 
			
			System.out.println(i[1]);
			
			System.out.println(50/0);
			
		} catch (ArithmeticException | NullPointerException |ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		e.printStackTrace();
	}
	System.out.println("after the logic");	
	}
		
}
