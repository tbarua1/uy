/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author uys41
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal=new Dog();
         Animal cat=new Cat();
         cat.voice1();
        Animal animal1=new Animal() {
            @Override
            public void voice1() {
                System.out.println("i am from main method"); }
        };
        animal1.voice1();
        animal.voice1();
        
    }
    
}
