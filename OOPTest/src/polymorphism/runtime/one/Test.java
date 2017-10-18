package polymorphism.runtime.one;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;  
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new Axis();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
	}

}
