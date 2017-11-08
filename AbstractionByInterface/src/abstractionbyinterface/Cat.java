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
public class Cat implements Animal,Mamels{

    @Override
    public void sound() {
        System.out.println("Meon");
    }    

    @Override
    public void walk() {
        System.out.println("Cat can walk"); }

    @Override
    public void childBirth() {
        System.out.println("small cats baby "); }
}
