public class Test10 {
public static void method3()
{
	//throw new IOException();
	System.out.println(50/0);
	}
	public static void method2(){
		try {
		
			method3();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static  void method1(){
		
		method2();
	}
	
	public static void main(String[] args) {
    
		method1();
	System.out.println("after the logic !");
	
	
}
}
