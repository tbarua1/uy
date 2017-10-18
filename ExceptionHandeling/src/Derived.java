//case 1 For Practical in case of inheritance !!
import java.io.*;  
class Base{  
void show(){
System.out.println("Base class");
}  
}  
class Derived extends Base{  
void show()throws IOException
{  
System.out.println("Derived class");  
}  
public static void main(String args[]){  
   Base b=new Derived();  
   b.show();  
  }  
}  