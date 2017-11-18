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
public class LocalInnerDemo {
    private int data=30;//instance variable

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LocalInnerDemo() {
    }
    
    void display(){ // inside method
        class LocalInnerClass {
            void msg(){System.out.println(data);}
        }
        LocalInnerClass local = new LocalInnerClass();
        local.msg();
    }
   
    
    public static void main(String args[])
    {       
        LocalInnerDemo localInner = new LocalInnerDemo();
        localInner.display();
    }

    
}
