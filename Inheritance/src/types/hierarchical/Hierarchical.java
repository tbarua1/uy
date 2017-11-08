/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package types.hierarchical;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Hierarchical {
    public static void main(String args[]){  
    Cat c=new Cat();  
    c.meow();  
    c.eat();  
    //c.bark();//C.T.Error  
    }
}
    class Animal{  
    void eat(){System.out.println("eating...");}  
    }  
    class Dog extends Animal{  
    void bark(){System.out.println("barking...");}  
    }  
    class Cat extends Animal{  
    void meow(){System.out.println("meowing...");}  
    }  
     
