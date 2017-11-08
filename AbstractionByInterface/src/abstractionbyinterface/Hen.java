/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionbyinterface;

/**
 *
 * @author uys41
 */
public class Hen implements Animal,Birds{

    @Override
    public void sound() {
        System.out.println("Hen can Sound"); }

    @Override
    public void walk() {
        System.out.println("Hen can Walk");}

//    @Override
//    public void produceEggs() {
//        System.out.println("can produce Eggs");}
//    

    @Override
    public void LayEggs() {
        System.out.println("can produce Eggs"); }
}
