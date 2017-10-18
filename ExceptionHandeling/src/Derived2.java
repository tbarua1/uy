//case 3 Exception In Case of Inheritance !!
import java.io.*;  
class Base
{  
void show()throws ArithmeticException{
System.out.println("Base class");
}  
}  
class Derived2 extends Base{  
void show()throws Exception{
System.out.println("Derived3 class");
}  
public static void main(String args[]){  
   Base b=new Derived2();  
   try{  
   b.show();  
   }catch(Exception e){}  
  }  
}  