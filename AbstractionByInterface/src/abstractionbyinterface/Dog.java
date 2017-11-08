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
public class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("Woof");
    }    

    @Override
    public void walk() {
        System.out.println("Dog can walk"); }
}
