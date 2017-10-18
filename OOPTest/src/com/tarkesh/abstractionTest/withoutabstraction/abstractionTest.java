package com.tarkesh.abstractionTest.withoutabstraction;

public class abstractionTest {
	public static void main(String args[]){
         
        
        //THIS REFERENCE VARIABLE CAN ACESS ONLY THOSE METHOD WHICH ARE OVERRIDDEN
        Person person = new Employee();
        person.setName("Tarkeshwar Barua");        
       Employee emp=new Employee();
       emp.setEmpCode("empCode");
        System.out.println(emp.getEmpCode()+" "+ person.getName());
    }
}
