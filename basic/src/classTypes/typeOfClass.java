/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classTypes;

/**
 *
 * @author uys41
 */
//non static nested class
public class typeOfClass { //outer class
    private int data=30;
    class innerClassDemo{ //inner class or member inner class
        void msg(){System.out.println("data is "+data);}
    }    
   public static void main (String[] args)
    {
        //typeOfClass.innerClassDemo innerDemo1 = new typeOfClass().new innerClassDemo();
        //or 
        typeOfClass outClass = new typeOfClass();
        typeOfClass.innerClassDemo innerDemo2 = outClass.new innerClassDemo(); // member class
        
        innerDemo2.msg(); // member class method
    }
}
