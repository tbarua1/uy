public class ex1 {
public static void main(String[] args) {
		
		try {
			
			int []i2=new int[5];
			System.out.println(i2[10]);
			
			String a=null;
		    System.out.println(a.length());
			
		    int i=50/0;
			System.out.println(i);
			
		} catch (ArrayIndexOutOfBoundsException e || NullPointerException e3) {
			System.out.println(e);
		}
		catch (NullPointerException e3) {
			// TODO: handle exception
			System.out.println(e3);
		}
		catch (ArithmeticException e2) {
			System.out.println(e2);
		}
		
		System.out.println("after the loigic");
	}
}
