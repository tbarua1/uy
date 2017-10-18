/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.static_factory_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Test {

    /*static factory method is not the same as the Factory Method pattern from Design Patterns. 
    This technique is similar to the Flyweight pattern static method that returns an instance of 
    the class. Here’s a simple example from Boolean (the boxed primitive class for the primitive type
    boolean). This method translates a boolean primitive value into a Boolean object reference:
    
    A class can have only a single constructor with a given signature. Programmers have been known to 
    get around this restriction by providing two constructors whose parameter lists differ only in the 
    order of their parameter types. This is a really bad idea. The user of such an API will never be able 
    to remember which constructor is which and will end up calling the wrong one by mistake. People reading
    code that uses these constructors will not know what the code does without referring to the class 
    documentation.
    
    First advantage- they have names, static factory methods don’t share the restriction discussed in the previous 
    paragraph. In cases where a class seems to require multiple constructors with the same signature, 
    replace the constructors with static factory methods and carefully chosen names to highlight their 
    differences.
    A second advantage of static factory methods is that, unlike constructors, they are not required to 
    create a new object each time they’re invoked. This allows immutable classes  to use preconstructed 
    instances, or to cache instances as they’re constructed, and dispense them repeatedly to avoid creating
    unnecessary duplicate objects. The Boolean.valueOf(boolean) method illustrates this technique: it never
    creates an object. This technique is similar to the Flyweight pattern . It can greatly improve 
    performance if equivalent objects are requested often, especially if they are expensive to create.
    */
    public static void main(String[] args) throws IOException {
         GetPlanFactory planFactory = new GetPlanFactory();  
        
      System.out.print("Enter the name of plan for which the bill will be generated: ");  
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
      String planName=br.readLine();  
      System.out.print("Enter the number of units for bill will be calculated: ");  
      int units=Integer.parseInt(br.readLine());  
  
      Plan p = planFactory.getPlan(planName);  
      //call getRate() method and calculateBill()method of DomesticPaln.  
  
       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
           p.getRate();  
           p.calculateBill(units);  
           
    }

    public static Boolean valueOf(boolean b) {

        return b ? Boolean.TRUE : Boolean.FALSE;

    }
}
