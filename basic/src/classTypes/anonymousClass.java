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
public class anonymousClass {
    
    public static void main (String[] args)
    {
        Person p = new Person(){
        @Override
        void eat(){System.out.println("nice fruits");}
        };
        p.eat();
    }
}
 
abstract class Person{
    abstract void eat();
    }
