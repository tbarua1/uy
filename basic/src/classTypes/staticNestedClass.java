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
public class staticNestedClass {
    
    static int data=30;
    static class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    
    public static void main (String[] args)
    {
        // no need outer class reference
        staticNestedClass.Inner inner = new Inner();
        inner.msg();
    }
}
