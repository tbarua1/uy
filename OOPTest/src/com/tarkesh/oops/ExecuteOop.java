package com.tarkesh.oops;

public class ExecuteOop {
	public static void main(String[] args) {
		 EncapsulationTest encap = new EncapsulationTest();
	      encap.setName("Mr Xyz");
	      encap.setCity("Dhaka");
	      encap.setId(100);
	      encap.setPhone("0123455789");

	      System.out.print("Name : " + encap.getName() +
	    		  "\nCity : " + encap.getCity()+
	    		  "\nId : " + encap.getId()+
	    		  "\nPhone : " + encap.getPhone());
	      encap.setName("Mr abc");
	      encap.setCity("Rangpur");
	      encap.setId(200);
	      encap.setPhone("987654321");
	      System.out.print("\nName : " + encap.getName() +
	    		  "\nCity : " + encap.getCity()+
	    		  "\nId : " + encap.getId()+
	    		  "\nPhone : " + encap.getPhone());
	}

}
