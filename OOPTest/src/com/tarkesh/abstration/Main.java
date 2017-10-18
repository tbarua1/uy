package com.tarkesh.abstration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Employee e = new Employee("George W.", "Houston, TX", 43);
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();*/
		
		  Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
            System.out.println("Slary Object "+s);
            System.out.println("Employee Object "+e);
//	      System.out.println("Call mailCheck using Salary reference --");
//	      s.mailCheck();
//	      System.out.println("\n Call mailCheck using Employee reference--");
//	      e.mailCheck();
	}

}
