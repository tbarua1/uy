
package javaapplication12;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class b{
b(){System.out.print("super class...");};
}
public class Z extends b  {
    Z()
    {
        System.out.println("constructors-1.....");
    }
    int bc(int x)
    { 
    System.out.println("test1...");
    return 0;
    }     
    int bc(int x, double y)
    {
        System.out.println("");
         return 0;
    }        
    

   
    public static void main(String[] args) {
    
    Z a = new Z(); 
    System.out.println("this is ariyan class=");
    }
    
}
