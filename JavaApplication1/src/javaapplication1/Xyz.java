/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author uys41
 */
public class Xyz extends Abc{
01995745367
    private int a = 40;
    public int b = 50;
    int c = 60;

    public Xyz() {
    }

    public static void main(String[] args) {
        Xyz xyz = new Xyz();
        xyz.printValue();
       .
//        Abc abc = new Abc();
//         abc.y=70;
//         abc.z=80;
//        System.out.println("abc.y" + abc.y);
//        System.out.println("abc.z" + abc.z);
//        abc.printValue1();
    }

    public void printValue() {
        System.out.println(a + " " + b + " " + c);
    }
}
