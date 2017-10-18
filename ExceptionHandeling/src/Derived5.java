//case 6 Exception In Case of Inheritance !!
import java.io.*;  
class Base{  
void show()throws Exception{System.out.println("Base");
}  
}  
class Derived5 extends Base{  
void show(){System.out.println("Derived6");
}  
public static void main(String args[]){  
   Base b=new Derived5();  
   try{  
   b.show();  
   }catch(Exception e){}  
  }  
} 