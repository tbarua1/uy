//case 2 Exception In Case of Inheritance !!
import java.io.*;  
class Base
{  
void show(){
System.out.println("Base class");
}  
}  
class Derived1 extends Base{  
void show()throws ArithmeticException
{  
System.out.println("Derived1 class");  
}  
public static void main(String args[]){  
Base b=new Derived1();  
   b.show();  
  }  
} 