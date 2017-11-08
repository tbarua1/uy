/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionbyinterface;

/**
 *
 * @author Abhishek.Sehgal
 */
public class AbstractionByInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal dog = new Dog();
	dog.sound();
        dog.walk();
        Animal cat = new Cat();
        cat.walk();
	cat.sound();
    }
    
}
