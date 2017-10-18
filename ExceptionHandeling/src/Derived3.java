//case 4 Exception In Case of Inheritance !!
import java.io.*;  
class Base{  
void show()throws Exception{
System.out.println("Base");
}  
}  
class Derived3 extends Base{  
void show()throws Exception{
System.out.println("Derived3");}  
public static void main(String args[]){  
   Base b=new Derived3();  
   try{  
   b.show();  
   }catch(Exception e){}  
 }  
}