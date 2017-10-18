//case 5 Exception In Case of Inheritance !!
import java.io.*;  
class Base{  
void show()throws Exception{
System.out.println("Base class");
}  
}  
class Derived4 extends Base{  
void show()throws ArithmeticException{
System.out.println("Derived4 class");}  
public static void main(String args[]){  
   Base b=new Derived4();  
   try{  
   b.show();  
   }catch(Exception e){}  
  }  
} 